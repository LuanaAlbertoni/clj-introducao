(ns estoque.aula2)

(defn valor-descontado
	"Retorna o valor com desconto de 10%"
	[valor-bruto]
	(let [taxa-de-desconto (/ 10 100)]
		(println "Calculando desconto de" desconto)
		(* valor-bruto (- 1 desconto))))

(println (valor-descontado 100))


;Condidionais
(> 500 100) true
(< 500 100) false

(if (> 500 100)
	(println "maior")
	(println "menor ou igual"))

(if (> 50 100)
	(println "maior")
	(println "menor ou igual"))



(defn valor-descontado
	"Retorna o valor com desconto de 10% se o valor for estritamente maior que 100"
	[valor-bruto]
	(if (> valor-bruto 100)
	(let [taxa-de-desconto (/ 10 100)
		  desconto         (* valor-bruto taxa-de-desconto)]
		(println "Calculando desconto de" desconto)
		(- valor-bruto desconto))
		valor-bruto))

(valor-descontado 100)
(valor-descontado 1000)