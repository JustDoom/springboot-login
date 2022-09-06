<template>
  <div><br>
    <h2 class="font">Blog</h2><br>
    <div style="padding-left: 20px; padding-right: 20px">
      <p class="font font-size">Login to verify</p>
      <p class="font font-size">Username: <input type="text" placeholder="Username" id="username"></p>
      <p class="font font-size">Password: <input type="password" placeholder="Password" id="password"></p>
      <button v-on:click="send" id="submit">Submit</button>
      <br>
    </div>
    <AppFooter/>
  </div>
</template>

<script>
import axios from "axios";

function getCookie(cname) {
  let name = cname + "=";
  let decodedCookie = decodeURIComponent(document.cookie);
  let ca = decodedCookie.split(';');
  for(let i = 0; i <ca.length; i++) {
    let c = ca[i];
    while (c.charAt(0) === ' ') {
      c = c.substring(1);
    }
    if (c.indexOf(name) === 0) {
      return c.substring(name.length, c.length);
    }
  }
  return "";
}

export default {
  methods: {
    send: async function() {
      try {
        const cookie = getCookie("token");

        const res = await axios.post("http://localhost:8080/post-blog", { "token": cookie }, {
          crossDomain: true,
          headers: {
            "Access-Control-Allow-Origin": '*',
          },
        });



      } catch (e) {
        console.log(e);
      }
    }
  },
  head() {
    return {
      title: 'ImJustDoom - Blog',
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
