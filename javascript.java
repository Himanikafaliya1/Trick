window.addEventListener('load', setListeners)

function setListeners(){
    let celsiusinput= document.querySelector("#celsius > input");
    let fahrenheightinput= document.querySelector("#fahrenheight > input");
    let kelvininput= document.querySelector("#kelvin > input");

    let btn= document.querySelector('div.button button')


    function roundnumber(number){
        return Math.round(number)
    }

    celsiusinput.addEventListener('input', function(){
        let cTemp= parseFloat(celsiusinput.value || 0)
        let fTemp= (cTemp*(9/5)) + 32
        let kTemp= cTemp + 273.15

        fahrenheightinput.value = roundnumber(fTemp)
        kelvininput.value = roundnumber(kTemp)
    })

    fahrenheightinput.addEventListener('input', function(){
        let fTemp= parseFloat(fahrenheightinput.value)
        let cTemp= (fTemp - 32) * (5/9)
        let kTemp= (fTemp - 32) * (5/9) + 273.15

        celsiusinput.value= roundnumber(cTemp)
        kelvininput.value= roundnumber(kTemp)
    })



    fahrenheightinput.addEventListener('input', function(){
        let kTemp= parseFloat(kelvininput.value)
        let cTemp= kTemp - 273.15
        let fTemp= (kTemp - 273.15) * (9/5) + 32

        celsiusinput.value= roundnumber(cTemp)
        fahrenheightinput.value= roundnumber(fTemp)
    })

    btn.addEventListener('click', function() {
        celsiusinput.value =""
        fahrenheightinput.value = ""
        kelvininput.value =""
    })
}