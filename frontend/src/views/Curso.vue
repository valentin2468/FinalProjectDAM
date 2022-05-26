<template>
  <div>
    <h1>
      Curso {{ $route.query.añoCurso }} de {{ $route.query.nombreModulo }}
    </h1>
    <CTable striped>
      <CTableHead>
        <CTableRow color="dark">
          <CTableHeaderCell scope="col">ID</CTableHeaderCell>
          <CTableHeaderCell scope="col">Nombre</CTableHeaderCell>
          <CTableHeaderCell scope="col">Modulo</CTableHeaderCell>
          <CTableHeaderCell scope="col">Curso</CTableHeaderCell>
        </CTableRow>
      </CTableHead>
      <CTableBody>
        <CTableRow color="info" v-for="alumno in alumnos" :key="alumno.id">
          <CTableHeaderCell scope="row"
            ><router-link
              :to="{
                path: '/alumno',
                name: 'Alumno',
                params: { idAlumno: alumno.id },
              }"
            >
              {{ alumno.id }}
            </router-link></CTableHeaderCell
          >
          <CTableDataCell>{{ alumno.nombre }}</CTableDataCell>
          <CTableDataCell>{{ $route.query.nombreModulo }}</CTableDataCell>
          <CTableDataCell>{{ $route.query.añoCurso }}</CTableDataCell>
        </CTableRow>
      </CTableBody>
    </CTable>
  </div>
</template>

<script>
export default {
  name: 'Curso',
  data() {
    return {
      alumnos: [],
    }
  },
  mounted() {
    this.getAlumnos()
  },
  methods: {
    async getAlumnos() {
      console.log('hacemos un get de alumnos')
      await fetch(
        `http://localhost:8081/api/alumnos/curso?idCurso=${this.$route.params.idCurso}`,
      )
        .then((response) => response.json())
        .then((response) => (this.alumnos = response))
    },
  },
}
</script>
