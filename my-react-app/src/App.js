import logo from './logso.svg';
import apple from './apple.jpeg';
import orange from './orange.jpeg';
import martabak from './martabak.jpeg';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React Toasdday
        </a>
      </header>
    </div>
  );
}

export function CustomerName() {
  return (
    <>
      <h1>
        GO buy
      </h1>
      <input type='text'/>
        Nama Pemesan
      <button type='button'>
        enter
      </button>

      <div id='flex-container'>
        <img src={apple} alt='apple'/>
        <input type='checkbox'/>
        <button type='button'>
          -
        </button>
        <button type='button'>
          +
        </button>
        <img src={orange} alt='orange'/>
        <input type='checkbox'/>
        <img src={martabak} alt='martabak'/>
        <input type='checkbox'/>
      </div>

      
    </>
  );
}

export function MenuDisplay(image) {
  return(
    <>
      <div class="menu-grid">
          <img class="menu-image" src={image} alt="food"/>
          <div class='item item-1'>
            {/* <p class='menu-description'> */}
              APEL IJO @5k
            {/* </p> */}
              Total Price
            <button class='btn' type='button'>-</button>
            Quantity
            <button class='btn' type='button'>+</button>
            {/* <p class='menu-description'> */}
            {/* </p> */}
          </div>
      
          <img class="menu-image"src={image} alt="food"/>
          <div class='item item-2'>2</div>
          <img class="menu-image" src={image} alt="food"/>
          <div class='item item-3'>3</div>
          <img class="menu-image" src={image} alt="food"/>
          <div class='item item-4'>4</div>
          <img class="menu-image" src={image} alt="food"/>
          <div class='item item-5'>5</div>
      </div>
    </>
  )
}


export default App;
