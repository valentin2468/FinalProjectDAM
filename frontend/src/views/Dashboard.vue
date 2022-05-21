<template>
  <div>
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
                },
                params: { idCurso: curso.año },
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
    }
  },
  mounted() {
    this.getModulos()
  },
  methods: {
    async getModulos() {
      console.log('hacemos un get de modulos')
      await fetch('http://localhost:8081/api/profesor/modulos?idProfesor=1')
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
    /* async saveAlumnos() {
      for (let modulo = 0; modulo < this.modulos.length; modulo++) {
        for (
          let curso = 0;
          curso < this.modulos[modulo].cursos.length;
          curso++
        ) {
          const data = await fetch(
            `http://localhost:8081/api/alumnos/curso?idCurso=${this.modulos[modulo].cursos[curso].id}`,
          )
          this.modulos[modulo].cursos[curso].alumnos = await data.json()
        }
      }
    }, */
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
