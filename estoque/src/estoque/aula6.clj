(ns estoque.aula6)


(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

(defn imprime-e-15
  [valor]
  (println "valor" (class valor) valor)
  15)


;desestruturar vetores
(defn imprime-e-15
  [[chave valor]]
  valor)

(println (map imprime-e-15 pedido))


(defn preco-dos-produtos [[chave valor]]
  (* (:quantidade valor) (:preco valor)))

;usar underline quando nao usara o parametro
(defn preco-dos-produtos [[_ valor]]
  (* (:quantidade valor) (:preco valor)))

(println (map preco-dos-produtos pedido))
(println (reduce + (map preco-dos-produtos pedido)))

; THREAD LAST
(defn total-do-pedido
  [pedido]
  (->> pedido
      (map preco-dos-produtos ,,,)
      (reduce + ,,,)))

(println (total-do-pedido pedido))



(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))

(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-do-produto ,,,)
       (reduce + ,,,)))

(println (total-do-pedido pedido))


(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}
             :chaveiro {:quantidade 1}})

(defn gratuito?
  [item]
  (<= (get item :preco 0) 0))

(println "Filtrando gratuitos")
(println (filter gratuito? (vals pedido)))

(println (filter (fn [[chave item]] (gratuito? item)) pedido))

;lambda
(println (filter #(gratuito? (second %)) pedido))


(defn pago?
    [item]
  (not (gratuito? item)))

;composicao
(comp not gratuito?)

(def pago? (comp not gratuito?))







