(ns luminus-sudamerik.routes.products
  (:require [luminus-sudamerik.layout :as layout]
            [luminus-sudamerik.db.core :as db]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :refer [ok]]
            [clojure.java.io :as io]))

(defn list-products []
  (let [products (db/list-products)]
    (ok products)))

(defroutes products-routes
  (GET "/products" [] (list-products)))

