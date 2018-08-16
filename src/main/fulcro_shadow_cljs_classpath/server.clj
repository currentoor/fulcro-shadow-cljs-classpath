(ns fulcro-shadow-cljs-classpath.server
  (:require
    [fulcro.easy-server :refer [make-fulcro-server]]
    ; MUST require these, or you won't get them installed.
    [fulcro-shadow-cljs-classpath.api.read]
    [fulcro-shadow-cljs-classpath.api.mutations]))

(defn build-server
  [{:keys [config] :or {config "config/dev.edn"}}]
  (make-fulcro-server
    :parser-injections #{:config}
    :config-path config))



