<template>
  <div><br>
    <button v-on:click="logout" id="submit">Logout</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  methods: {
    logout: async function () {
      try {
        const res = await axios.post("http://localhost:8080/logout2", {}, {
          crossDomain: true,
          headers: {
            "Access-Control-Allow-Origin": '*',
          },
        });

        document.cookie = res.data.cookie;
      } catch (e) {
        console.log(e);
      }
    }
  },
  head() {
    return {
      title: 'ImJustDoom - Logout',
      meta: [
        {
          hid: "description",
          name: "description",
          content: "Home"
        }
      ]
    }
  }
}
</script>

<style>
.font {
  font-family: "Helvetica Neue", sans-serif;
}

.font-size {
  font-size: 14px;
  line-height: 1.4;
}
</style>
