(ns estoque.aula5)

(def estoque {"Mochila" 10, "Camiseta" 5})
(println estoque)

(println "temos" (count estoque) "elementos")
(println "Chaves sao" (keys estoque))
(println "Valores sao" (vals estoque))

;keyword
; :mochila

(def estoque {:mochila 10
              :camiseta 5})

;associar nova chave e valor e mudar um valor em uma representacao, nunca no original
(assoc estoque :cadeira 3)
(assoc estoque :mochila 1)

;dissociar uma chave e valor em uma representacao
(dissoc estoque :mochila)

;adiciona soma 1 em um valor referente a key
(println (update estoque :mochila inc))

(defn tira-um
  [valor]
  (println "tirando um de " valor)
  (- valor 1))
(println (update estoque :mochila tira-um))
(println (update estoque :mochila #(- % 3)))


(def pedido {:mochila {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

(println " \n\n\n")
(println pedido)

(def pedido (assoc pedido :chaveiro {:quantidade 1, :preco 10}))
(println pedido)
(println (pedido :mochila))

(println (:quantidade (:mochila pedido)))

; THREADING
(printlne (-> predido
      :mochila
      :quantidade))

(println (update-in pedido [:mochila :quantidade] inc))






