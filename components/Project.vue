<template>
  <nuxt-link :to="'project/' + id">
    <div style="font-family: 'Helvetica Neue', sans-serif;" class="project">
      <h3>{{ name }}</h3>
      <p>{{ tag }}</p>
    </div>
  </nuxt-link>
</template>

<script>
export default {
  name: "Project",
  props: ["project", "id", "name", "tag"]
};
</script>

<style scoped>
.project {
  padding: 1rem;
  border: 1px solid #dedede;
  margin: 1rem 0;
}

a:link {
  text-decoration: none;
  color: #333333;
}
a:visited {
  text-decoration: none;
  color: #333333;
}
a:hover {
  text-decoration: none;
}
a:active {
  text-decoration: none;
}
</style>
