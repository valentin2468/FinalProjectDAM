<template>
  <div class="bg-light min-vh-100 d-flex flex-row align-items-center">
    <CAlert :color="alertType" :show="alertShow" fade>
      {{ alertInfo }}
    </CAlert>
    <CContainer>
      <CRow class="justify-content-center">
        <CCol :md="4">
          <CCardGroup>
            <CCard class="p-4">
              <CCardBody>
                <CForm>
                  <h1>Iniciar Sesión</h1>
                  <p class="text-medium-emphasis">
                    Inicia sesion con tu cuenta
                  </p>
                  <CInputGroup class="mb-3">
                    <CInputGroupText>
                      <CIcon icon="cil-user" />
                    </CInputGroupText>
                    <CFormInput
                      placeholder="Usuario"
                      autocomplete="usuario"
                      v-model="username"
                    />
                  </CInputGroup>
                  <CInputGroup class="mb-4">
                    <CInputGroupText>
                      <CIcon icon="cil-lock-locked" />
                    </CInputGroupText>
                    <CFormInput
                      type="password"
                      placeholder="Password"
                      autocomplete="current-password"
                      v-model="password"
                    />
                  </CInputGroup>
                  <CRow>
                    <CCol :xs="6">
                      <CButton
                        @click="fetchLogin()"
                        color="primary"
                        class="px-4"
                        :disabled="!disabledButton"
                      >
                        Iniciar
                      </CButton>
                    </CCol>
                  </CRow>
                </CForm>
              </CCardBody>
            </CCard>
          </CCardGroup>
        </CCol>
      </CRow>
    </CContainer>
  </div>
</template>

<script>
import Config from '../../../config.js'
export default {
  name: 'Login',
  data() {
    return {
      username: '',
      password: '',
      validUsername: false,
      validPassword: false,
      alertShow: false,
      alertType: 'primary',
      alertInfo: '',
    }
  },
  methods: {
    updateAlert({ message, type = 'primary', timeout = 3000 }) {
      this.alertShow = timeout
      this.alertType = type
      this.alertInfo = message
    },
    fetchLogin() {
      const response = fetch(`${Config.BASE_PATH}${Config.API_PATH}/login`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          username: this.username,
          password: this.password,
        }),
      })
      response
        .then((res) => {
          if (res.ok) {
            let body = res.json()
            body
              .then((res) => {
                localStorage.setItem('userToken', res.token)
                localStorage.setItem('username', res.username)
                //localStorage.setItem('role', body.role)
                this.$router.push('/')
              })
              .catch((err) => {
                this.updateAlert({
                  message: `Ha ocurrido un error: ${err}`,
                  type: 'danger',
                })
              })
          } else {
            this.updateAlert({
              message: `Ha ocurrido un error`,
              type: 'danger',
              timeout: 10000,
            })
          }
        })
        .catch((err) => {
          this.updateAlert({
            message: `Ha ocurrido un error: ${err}`,
            type: 'danger',
            timeout: 10000,
          })
        })
    },
  },
  computed: {
    disabledButton: function () {
      return Boolean(this.username && this.password)
    },
  },
  mounted() {},
}
</script>
