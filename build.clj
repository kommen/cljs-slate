(require '[cljs.build.api :as cljs])


(cljs/build
 "src"
 {:main          'slatenpm.core
  :output-to     "out/main.js"
  :verbose       true
  :npm-deps      {"slate"       "0.33.6"
                  "slate-react" "0.12.6"
                  "immutable"   "4.0.0-rc.9"
                  "react"       "16.3.2"
                  "react-dom"   "16.3.2"}
  :install-deps  true
  :optimizations :none})
