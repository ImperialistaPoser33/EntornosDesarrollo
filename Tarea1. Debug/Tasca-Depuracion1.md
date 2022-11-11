<h2>TASCA 1. </h2>

<p><b>1. En la función1… Què fan aquestes línies de codi?</b></p>

<p>String string2 = "string2";</p>
string2= string2.substring(0, string2.length()-1);</br>
string2=string2+"1";

<p><b>Respuesta: </b>Sustituye el "2" por un "1" al final de "string2".</p></br>

<p><b>2. Què valen les variables string1 i string2 abans d'executar el codi de comprovació següent?</b></p>

if(string1 == string2 ) {</br>
System.out.println("SÓN IGUALS " + a );.</br>
}</br>
else {</br>
System.out.println("SÓN DIFERENTS");</br>
}

<p><b>Respuesta: </b>String 1 y 2 valen exactamente lo mismo: "String1", por lo cual en condiciones normales siempre se ejecutaria el statement del if, pero por alguna razon, siempre se ejecuta el else.</p></br>

<p><b>3. Per què no funciona l'operador == ? Quin operador s'ha d'usar en lloc d'aquest?</b></p>

<p><b>Respuesta: </b>El else del ejercicio anterior se ejecuta por el operador == , que deberia reemplazarse por ".equals". Resultado correcto: "if (string1.equals(string2) {" .</p></br>

<p><b>4. La función2() està declarada com segueix:</b></p>

public void funcion2() {</br>
System.out.println("--------------------");</br>
System.out.println("Aquesta és la funció 2");</br>
System.out.println("Com faig la crida perquè funcione????");</br>
}

<p>Aquesta funció com l'he de cridar des del mètode MAIN perquè funcione. Existeixen 2 possibilitats. Explica-les.</p>

<p><b>Respuesta: </b>1: Declarar funcion2(); como "public static void" (si todos los public void son estaticos, no hay impedimento en llamar una funcion de otro static).</p>