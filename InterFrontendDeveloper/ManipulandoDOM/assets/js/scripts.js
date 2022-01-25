function changeMode() {
  changeClasses();
  changeText();
}

function changeClasses() {
  button.classList.toggle(darkModeClass);
  h1.classList.toggle(darkModeClass);
  body.classList.toggle(darkModeClass);
  footer.classList.toggle(darkModeClass);
}

function changeText() {
  const lightMode = "Light Mode";
  const darkMode = "Dark Mode";
  if (button.classList.contains(darkModeClass)) {
    button.innerText = lightMode;
    h1.innerText = darkMode + " ON";
    return;
  }
  button.innerText = darkMode;
  h1.innerText = lightMode + "ON";
  return;
}

const button = document.getElementById("mode-selector");
const h1 = document.getElementById("page-title");
const body = document.getElementsByTagName("body")[0];
const footer = document.getElementsByTagName("footer")[0];
const darkModeClass = "dark-mode";

button.addEventListener("click", changeMode);
