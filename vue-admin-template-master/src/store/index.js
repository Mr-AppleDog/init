import Vue from 'vue'
import Vuex from 'vuex'
import getters from './getters'
import app from './modules/app'
import settings from './modules/settings'
import user from './modules/user'
import tagsView from './modules/tagsView'
import dict from './modules/dict'

Vue.use(Vuex)

const store = new Vuex.Store({
  modules: {
    app,
    settings,
    dict,
    user,
    tagsView
  },
  getters
})

export default store
