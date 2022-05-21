<template>
  <div>
    <h1>
      Curso {{ $route.params.idCurso }} de {{ $route.query.nombreModulo }}
    </h1>
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
