<template>
  <div><br>
    <div style="border-top: 1px solid #ccc;">

    </div>
  </div>
</template>

<script>
export default {
  name: "AppHeader"
}
</script>

<style scoped>
.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 1rem;
  padding-bottom: 1rem;
}
.header .title {
  font-size: 3rem;
  color: #526488;
}
.header ul {
  display: flex;
  list-style-type: none;
  margin: auto;
}
.header a {
  display: inline-block;
  background: #333;
  color: #fff;
  padding: 0.3rem 1rem;
  margin-right: 0.5rem;
}
.buttons {
  display: table;
  margin: auto;
  /*border: 3px solid #4287f5;*/
}
.button {
  float: left;
  margin-right: 25px;
}
.buttons ul {
  display: flex;
  list-style-type: none;
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
  color: #000000;
}
a:active {
  text-decoration: none;
}
</style>
