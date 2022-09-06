<template>
  <div><br>
    <h2 style="font-family: 'Helvetica Neue', sans-serif;">Contact</h2>
    <div style="padding-left: 20px; font-family: 'Helvetica Neue', sans-serif;">
      <p>If you so wish you can contact me with the below + my socials.</p><br>
      <ul>
        <li>Email: <a href="mailto:justdoomdev@gmail.com">justdoomdev@gmail.com</a></li>
        <li>YouTube: <a href="https://www.youtube.com/c/JustDoom">JustDoom</a></li>
        <li>Twitter: <a href="https://twitter.com/ImJustDoom">ImJustDoom</a></li>
        <li>Discord: JustDoom#1106</li>
        <li>Discord Server: <a href="https://discord.gg/wVCSqV7ptB">Dino Nuggy Kingdom</a></li>
      </ul>
    </div>
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
      projects: []
    };
  },
  head() {
    return {
      title: 'ImJustDoom - Contact',
      meta: [
        {
          hid: "description",
          name: "description",
          content: "JustDooms Site"
        }
      ]
    }
  }
}

</script>
