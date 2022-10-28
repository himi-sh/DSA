function reverse(str) {
  // let strArray = str.split('');
  let output = []
  for (let i=str.length-1; i>=0; i--) {
    output.push(str[i]);
  }
  return output.join('');
}

const outpu = reverse("Hello, I am Andy");
console.log(outpu);