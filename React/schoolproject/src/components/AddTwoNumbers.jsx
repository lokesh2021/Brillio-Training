import React from "react";
import "../css/main.css";

class Add extends React.Component {
  state = {
    num1: 0,
    num2: 0,
    num3: 0,
  };

  setData = (event) => {
    this.setState({ [event.target.name]: [event.target.value] });
  };

  calculate = () => {
    let res = parseInt(this.state.num1) + parseInt(this.state.num2);
    this.setState({ num3: res });
  };

  render() {
    return (
      <div>
        <div className="container">
          <div className="inner-container">
            <h1>Addition of 2 numbers</h1>
          </div>
          <div className="inner-container">
            <form>
              <div className="inner-container">
                <label for="num1">Enter Number 1: </label>
                <input
                  type="text"
                  id="num1"
                  name="num1"
                  onChange={this.setData}
                />
              </div>
              <div className="inner-container">
                <label for="num1">Enter Number 2: </label>
                <input
                  type="text"
                  id="num2"
                  name="num2"
                  onChange={this.setData}
                />
              </div>
              <div className="inner-container">
                <label for="num3">Result: </label>
                <input
                  type="text"
                  id="num3"
                  name="num3"
                  value={this.state.num3}
                />
              </div>
              <div className="inner-container">
                <input
                  type="button"
                  className="button"
                  value="Calculate"
                  onClick={this.calculate}
                />
              </div>
            </form>
          </div>
        </div>
      </div>
    );
  }
}

export default Add;
