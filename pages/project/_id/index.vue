<template>
  <div style="font-family: 'Helvetica Neue', sans-serif;"><br>
    <div v-if="isLoaded">
      <nuxt-link to="/">Back To Projects</nuxt-link><br><br>
      <h2>{{ this.project['information'].name }}</h2>
      <hr>
      <small>Project ID: {{ $route.params.id }}</small>
      <p style="word-wrap: break-word" v-html="this.description"></p>
    </div>
    <p v-else>Loading...</p>
    <AppFooter/>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      isLoaded: false,
      project: {},
      description: ""
    };
  },
  async beforeCreate() {
    const config = {
      headers: {
        Accept: "application/json"
      }
    };
    try {
      const res = await axios.get(
        `https://api.imjustdoom.com/projects/${this.$route.params.id}`,
        config
      );
      this.project = res.data;
      this.isLoaded = true;
      document.querySelector('head title').textContent = this.project['information'].name;

      this.description = window.atob(this.project['information'].description);
    } catch (err) {
      console.log(err);
    }
  },
  head() {
    return {
      title: "loading...",
      meta: [
        {
          hid: "description",
          name: "description",
          content: "cool projects"
        }
      ]
    };
  }
}

function decode(text) {
  return window.atob(text);
}
</script>

<style scoped>

</style>
