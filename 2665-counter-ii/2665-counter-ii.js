/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let currCount = init;

    function increment() {
        ++currCount;
        return currCount;

    }
    function decrement() {
        currCount--;
        return currCount;

    }
    function reset() {
        currCount = init;
        return currCount;

    }
    return{increment , decrement , reset};
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */