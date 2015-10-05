(ns luminus-sudamerik.routes.products
  (:require [luminus-sudamerik.layout :as layout]
            [luminus-sudamerik.db.core :as db]
            [liberator.core :refer [resource defresource]]
            [compojure.core :refer [defroutes GET ANY]]
            [ring.util.http-response :refer [ok]]
            [clojure.java.io :as io]))

(defresource products-list-resource
  :available-media-types ["application/json"]
  :handle-ok (fn [_] (db/list-products)))

(defroutes products-routes
  (ANY "/products" [] products-list-resource))

