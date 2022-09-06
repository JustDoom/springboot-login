<template>
  <div><br>
    <h2 class="font">Hey, I'm JustDoom</h2><br>
    <div style="padding-left: 20px; padding-right: 20px">
      <p class="font font-size">Welcome to my website, I enjoy messing around with old game consoles and of course
        programming!<br>
        I mainly work on Minecraft mods/plugins but occasionally make other things which you can
        check out
        <nuxt-link to="/projects">here.</nuxt-link>
        Most of my projects are open source on my <a href="https://github.com/JustDoom">GitHub</a>.<br><br>
        I have been programming for 2-3 years now and I have grown a lot over that time. I started in Scratch which was
        really fun but eventually moved to Roblox then to Minecraft where I have learnt Java fairly well and am
        branching off from there into website and game development. In between my projects I have tried out multiple
        programming languages and have decent knowledge of HTML/CSS, JavaScript, a little PHP, Python and Lua as well as Java which is
        my main language.<br><br>
        I also have an interest in archiving, more specifically old Minecraft server related programs such as server
        jars or plugins, you can check out the website <a href="https://echidantribe.org">here</a>. This also carries
        into old game consoles such as the old PlayStations and Nintendo consoles (My favourite console is the Nintendo
        3DS, perfect combination of modern and old tech right into a perfectly sized portable device).<br>
        If you want to contact me or check out my socials you can check out <nuxt-link to="/contact">this page</nuxt-link>.</p>
      <br>
    </div>
    <AppFooter/>
  </div>
</template>

<script>
import Ads from 'vue-google-adsense'
import Vue from "vue";

export default {
  head() {
    return {
      title: 'ImJustDoom - Home',
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
