import auth from './auth'

import modal from './modal'

export default {
  install(Vue) {

    // 认证对象
    Vue.prototype.$auth = auth

    // 模态框对象
    Vue.prototype.$modal = modal

  }
}
