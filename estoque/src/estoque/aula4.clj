(ns estoque.aula4)

(def precos [30 700 1000])

(println (precos 0))
(println (get precos 0))
;vai retornar erro poir nao tem no vetor definido em precos
;(println  (precos 17))


;com o get tem uma tratativa para retornar nulo
(println "valor padrao nil" (get precos 17))
;se nao encontra o valor ele retornara por padrao 0
(println "valor padrao 0" (get precos 17 0))
;existe um valor padrao porem existe um valor no vetor
(println "valor padrao 0, mas existe" (get precos 2 0))

; UTILIZAR GET PARA EVITAR EXCEPTION


(println "precos com conj" (conj precos 5))
; conj adiciona no final do vetor o valor e devolve o valor novo mas nao muda o que ja foi definido
(println "precos" precos)

;atualizar um elemento dentro do vetor
;update atualiza dentro de precos na posicao 0 e incrementa 1 (o vetor original segue imutavel)
(println (update precos 0 inc))
;dec decrementa 1
(println (update precos 1 dec))

(defn soma-1 [valor] (println "estou somando um em" valor) (+ valor 1))
(println "funcao de somar um" (update precos 0 soma-1))

(defn soma-3 [valor] (println "estou somando tres em" valor) (+ valor 3))
(println "funcao de somar tres" (update precos 0 soma-3))

; CODIGO DA AULA ANTERIOR
(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor for estritamente maior que 100"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "map" (map valor-descontado precos))

(println (range 10))
;even? se o numero eh par
(println (filter even? (range 10)))

(println "vetor" precos)
(println "filter" (filter aplica-desconto? precos))

(println "map apos o filter"
  (map valor-descontado
       (filter aplica-desconto? precos)))

(println (reduce + precos))

(defn minha-soma [valor-1 valor-2]
  (println "somando" valor-1 valor-2)
  (+ valor-1 valor-2))

;vai so mar o primeiro com o segundo elemento e assim sucessivamente
(println (reduce minha-soma precos))

;define o primeiro elemento do reduce, nesse caso 0
(println (reduce minha-soma 0 precos))

;(println (reduce minha-soma (range 10)))














