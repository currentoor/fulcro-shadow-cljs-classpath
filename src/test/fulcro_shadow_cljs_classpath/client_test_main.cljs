(ns ^:dev/always fulcro-shadow-cljs-classpath.client-test-main
  (:require [fulcro-spec.selectors :as sel]
            [fulcro-spec.suite :as suite]))

(suite/def-test-suite client-tests {:ns-regex #"fulcro-shadow-cljs-classpath.*-spec"}
  {:default   #{::sel/none :focused}
   :available #{:focused}})

(client-tests)
