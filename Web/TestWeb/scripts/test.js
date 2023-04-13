const myHeading = document.querySelector("h1");
myHeading.textContent = "Hello world!";

let myVariable = "Bob";
myVariable = "Steve";

let iceCream = "chocolate";

function checkIceCream() {
    if (iceCream === "chocolate") {
      alert("Yay, I love chocolate ice cream!");
    } else {
      alert("Awwww, but chocolate is my favorite…");
    }
}

const myImage = document.querySelector("img");

myImage.onclick = () => {
  const mySrc = myImage.getAttribute("src");
  if (mySrc === "images/icon.png") {
    myImage.setAttribute("src", "images/icon_change.png");
  } else {
    myImage.setAttribute("src", "images/icon.png");
  }
};

  
  
  
