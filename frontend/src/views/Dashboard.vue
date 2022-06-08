<template>
  <div v-if="this.modulos">
    MODULOS:
    <CAccordion>
      <CAccordionItem
        v-for="modulo in modulos"
        :item-key="modulo.id"
        :key="modulo.id"
      >
        <CAccordionHeader> {{ modulo.nombre }} </CAccordionHeader>
        <CAccordionBody>
          <CButton
            class="d-grid gap-2 d-md-flex justify-content-md-end"
            id="boton"
            color="info"
            v-for="curso in modulo.cursos"
            :key="curso.id"
          >
            <router-link
              :to="{
                path: '/curso',
                name: 'Curso',
                query: {
                  nombreModulo: modulo.nombre,
                  añoCurso: curso.año,
                },
                params: { idCurso: curso.id },
              }"
              >año {{ curso.año }}</router-link
            >
          </CButton>
        </CAccordionBody>
      </CAccordionItem>
    </CAccordion>
  </div>
</template>

<script>
export default {
  name: 'Dashboard',
  components: {},
  data() {
    return {
      modulos: [],
      usuario: null,
    }
  },
  mounted() {
    this.getProfesorUsuario()
  },
  methods: {
    async getProfesorUsuario() {
      console.log('hacemos un get del profesor asignado a este usuario')
      await fetch(
        `http://localhost:8081/api/usuario?idUsuario=${localStorage.getItem(
          'username',
        )}`,
      )
        .then((response) => response.json())
        .then((response) => (this.usuario = response))
        .then(() => this.getModulos())
    },
    async getModulos() {
      console.log('hacemos un get de modulos')
      await fetch(
        `http://localhost:8081/api/profesor/modulos?idProfesor=${this.usuario.profesor.id}`,
      )
        .then((response) => response.json())
        .then((response) => (this.modulos = response))
        .then(() => this.saveCursos())
    },
    async saveCursos() {
      for (let i = 0; i < this.modulos.length; i++) {
        const data = await fetch(
          `http://localhost:8081/api/cursos/modulo?idModulo=${this.modulos[i].id}`,
        )
        this.modulos[i].cursos = await data.json()
      }
    },
  },
}
</script>

<style scoped>
#boton {
  margin-top: 10px;
  border: 1px solid rgb(82, 68, 207);
  background-color: rgb(229, 189, 253);
  color: rgb(82, 68, 207);
}
</style>
