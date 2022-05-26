<template>
  <div v-if="loaded">
    <h1 id="nombre">{{ alumno.nombre }}</h1>
    <CTable color="success" striped>
      <CTableHead>
        <CTableRow>
          <CTableHeaderCell scope="col">ID</CTableHeaderCell>
          <CTableHeaderCell scope="col">Dni</CTableHeaderCell>
          <CTableHeaderCell scope="col">Dirección</CTableHeaderCell>
          <CTableHeaderCell scope="col">Teléfono</CTableHeaderCell>
          <CTableHeaderCell scope="col">Fecha Nacimiento</CTableHeaderCell>
        </CTableRow>
      </CTableHead>
      <CTableBody>
        <CTableRow>
          <CTableHeaderCell scope="row">{{ alumno.id }}</CTableHeaderCell>
          <CTableDataCell>{{ alumno.dni }}</CTableDataCell>
          <CTableDataCell>{{ alumno.direccion }}</CTableDataCell>
          <CTableDataCell>{{ alumno.telefono }}</CTableDataCell>
          <CTableDataCell>
            <div id="fecha">{{ alumno.fechaNacimiento }}</div></CTableDataCell
          >
        </CTableRow>
      </CTableBody>
    </CTable>
    <div>
      <CChart
        type="line"
        :wrapper="false"
        :data="{
          labels: [
            'January',
            'February',
            'March',
            'April',
            'May',
            'June',
            'July',
          ],
          datasets: [
            {
              label: asignaturas[0].nombre,
              backgroundColor: 'rgba(220, 220, 220, 0.2)',
              borderColor: 'rgba(220, 220, 220, 1)',
              pointBackgroundColor: 'rgba(220, 220, 220, 1)',
              pointBorderColor: '#fff',
              data: [40, 20, 12, 39, 10, 40, 39],
            },
          ],
        }"
      />
    </div>
  </div>
</template>

<script>
export default {
  name: 'Alumno',
  data() {
    return {
      loaded: false,
      alumno: null,
      asignaturas: [],
    }
  },
  mounted() {
    this.getAlumno()
  },
  methods: {
    async getAlumno() {
      console.log('hacemos un get de alumno')
      await fetch(
        `http://localhost:8081/api/alumno?idAlumno=${this.$route.params.idAlumno}`,
      )
        .then((response) => response.json())
        .then((response) => (this.alumno = response))
        .then(() => (this.loaded = true))
        .then(() => this.getAsignaturas())
    },
    async getAsignaturas() {
      console.log('hacemos un get de asignaturas')
      await fetch(
        `http://localhost:8081/api/asignaturas/curso?idCurso=${this.alumno.curso.id}`,
      )
        .then((response) => response.json())
        .then((response) => (this.asignaturas = response))
        .then(() => (this.loaded = true))
    },
  },
}
</script>
<style scoped>
#fecha {
  text-align: center;
  width: 9.5ch;
  overflow: hidden;
  white-space: nowrap;
}
#nombre {
  text-align: center;
}
</style>
