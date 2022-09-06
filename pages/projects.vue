<template>
  <div><br>
    <Project v-if="isLoaded" v-for="project in projects" :key="project['information'].id" :name="project['information'].name"
             :id="project['information'].id" :tag="project['information'].tag" :project="project"></Project>
    <p style="font-family: 'Helvetica Neue', sans-serif;" id="loading">Loading...</p>
    <AppFooter/>
  </div>
</template>

<script>
import axios from "axios";
import Project from "@/components/Project";

export default {
  components: {
    Project
  },
  data() {
    return {
      projects: [],
      isLoaded: false
    };
  },
  async beforeCreate() {
    const config = {
      headers: {
        Accept: "application/json"
      }
    };

    async function fetchProject(projects, project, config) {
      const res = await axios.get('https://api.imjustdoom.com/projects/' + project, config);
     // const posts = await res.json();
      projects.push(res.data);
    }

    try {
      const res = await axios.get('https://api.imjustdoom.com/projects', config);

      for (let i = 0; i < res.data[0].projects.length; i++) {
        console.log('https://api.imjustdoom.com/projects/' + res.data[0].projects[i] + '/name');
        await fetchProject(this.projects, res.data[0].projects[i], config);
      }

      this.isLoaded = true;
      document.getElementById("loading").remove();
    } catch (e) {
      console.log(e)
    }
  },
  head() {
    return {
      title: 'ImJustDoom - Projects',
      meta: [
        {
          hid: "description",
          name: "description",
          content: "JustDooms Site"
        }
      ]
    }
  },
  methods: {
    async fetchProject (res, config) {

    }
  }
}

</script>
