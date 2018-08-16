# The Project

# Unexpected Behavior

Running the following commands 
```
npm install
shadow-cljs release main
```

Results in warnings about two versions of the cljs compiler on the classpath

```
shadow-cljs - config: /Users/currentoor/src/fulcro-shadow-cljs-classpath/shadow-cljs.edn  cli version: 2.5.1  node: v10.4.1
shadow-cljs - running: lein with-profile cljs run -m shadow.cljs.devtools.cli --npm release main
[2018-08-15 17:08:36.120 - INFO] duplicate resource cljs/compiler.cljc on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/compiler.cljc over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/compiler.cljc
[2018-08-15 17:08:36.129 - INFO] duplicate resource cljs/core.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/core.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/core.cljs
[2018-08-15 17:08:36.129 - INFO] duplicate resource cljs/analyzer.cljc on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/analyzer.cljc over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/analyzer.cljc
[2018-08-15 17:08:36.129 - INFO] duplicate resource cljs/spec/alpha.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/spec/alpha.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/spec/alpha.cljs
[2018-08-15 17:08:36.130 - INFO] duplicate resource cljs/reader.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/reader.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/reader.cljs
[2018-08-15 17:08:36.130 - INFO] duplicate resource cljs/util.cljc on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/util.cljc over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/util.cljc
[2018-08-15 17:08:36.130 - INFO] duplicate resource cljs/repl.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/repl.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/repl.cljs
[2018-08-15 17:08:36.131 - INFO] duplicate resource cljs/pprint.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/pprint.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/pprint.cljs
[2018-08-15 17:08:36.132 - INFO] duplicate resource cljs/externs.js on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/externs.js over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/externs.js
[2018-08-15 17:08:36.132 - INFO] duplicate resource cljs/nodejs.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/nodejs.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/nodejs.cljs
[2018-08-15 17:08:36.133 - INFO] duplicate resource cljs/imul.js on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/imul.js over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/imul.js
[2018-08-15 17:08:36.133 - INFO] duplicate resource cljs/source_map/base64.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/source_map/base64.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/source_map/base64.cljs
[2018-08-15 17:08:36.134 - INFO] duplicate resource clojure/set.cljs on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/clojure/set.cljs over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/clojure/set.cljs
[2018-08-15 17:08:36.135 - INFO] duplicate resource cljs/support.cljc on classpath, using jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.10.339/clojurescript-1.10.339-slim.jar!/cljs/support.cljc over jar:file:/Users/currentoor/.m2/repository/org/clojure/clojurescript/1.9.946/clojurescript-1.9.946.jar!/cljs/support.cljc
```

`lein deps :tree` results in this

```
Possibly confusing dependencies found:
[thheller/shadow-cljs "2.5.1"] -> [com.google.javascript/closure-compiler-unshaded "v20180805"] -> [args4j "2.0.26"]
 overrides
[fulcrologic/fulcro-spec "2.1.0-1" :exclusions [fulcrologic/fulcro]] -> [org.clojure/clojurescript "1.9.946"] -> [com.google.javascript/closure-compiler-unshaded "v20170910"] -> [args4j "2.33"]

Consider using these exclusions:
[fulcrologic/fulcro-spec "2.1.0-1" :exclusions [fulcrologic/fulcro args4j]]

[thheller/shadow-cljs "2.5.1"] -> [com.google.javascript/closure-compiler-unshaded "v20180805"] -> [com.google.errorprone/error_prone_annotations "2.0.18"]
 overrides
[thheller/shadow-cljs "2.5.1"] -> [com.google.javascript/closure-compiler-unshaded "v20180805"] -> [com.google.guava/guava "25.1-jre"] -> [com.google.errorprone/error_prone_annotations "2.1.3"]

Consider using these exclusions:
[thheller/shadow-cljs "2.5.1" :exclusions [com.google.errorprone/error_prone_annotations]]

[thheller/shadow-cljs "2.5.1"] -> [com.google.javascript/closure-compiler-unshaded "v20180805"] -> [com.google.code.findbugs/jsr305 "3.0.1"]
 overrides
[thheller/shadow-cljs "2.5.1"] -> [com.google.javascript/closure-compiler-unshaded "v20180805"] -> [com.google.guava/guava "25.1-jre"] -> [com.google.code.findbugs/jsr305 "3.0.2"]

Consider using these exclusions:
[thheller/shadow-cljs "2.5.1" :exclusions [com.google.code.findbugs/jsr305]]

 [bidi "2.1.3"]
   [prismatic/schema "1.1.3" :exclusions [[org.clojure/tools.reader]]]
 [bk/ring-gzip "0.2.1"]
 [clojure-complete "0.2.4" :exclusions [[org.clojure/clojure]]]
 [com.cemerick/piggieback "0.2.2" :scope "test"]
 [fulcrologic/fulcro-spec "2.1.0-1" :scope "test" :exclusions [[fulcrologic/fulcro]]]
   [colorize "0.1.1" :scope "test" :exclusions [[org.clojure/clojure]]]
   [com.lucasbradstreet/cljs-uuid-utils "1.0.2" :scope "test"]
   [com.taoensso/sente "1.12.0" :scope "test"]
     [com.taoensso/encore "2.93.0" :scope "test"]
       [com.taoensso/truss "1.5.0" :scope "test"]
     [com.taoensso/timbre "4.10.0" :scope "test"]
       [io.aviso/pretty "0.1.33" :scope "test"]
   [kibu/pushy "0.3.8" :scope "test"]
   [org.clojure/clojurescript "1.9.946" :scope "test"]
 [fulcrologic/fulcro "2.6.0-RC5"]
   [cljsjs/react-dom-server "16.4.1-0"]
   [cljsjs/react-dom "16.4.1-0"]
   [cljsjs/react "16.4.1-0"]
   [clojure-future-spec "1.9.0-beta4"]
   [com.stuartsierra/component "0.3.2"]
     [com.stuartsierra/dependency "0.2.0"]
   [garden "1.3.5"]
     [com.yahoo.platform.yui/yuicompressor "2.4.8" :exclusions [[rhino/js]]]
 [http-kit "2.2.0"]
 [org.clojure/clojure "1.9.0"]
   [org.clojure/core.specs.alpha "0.1.24"]
   [org.clojure/spec.alpha "0.1.143"]
 [org.clojure/tools.namespace "0.3.0-alpha4" :scope "test"]
   [org.clojure/java.classpath "0.2.3" :scope "test"]
 [org.clojure/tools.nrepl "0.2.13" :scope "test"]
 [ring/ring-core "1.6.3" :exclusions [[commons-codec]]]
   [clj-time "0.11.0"]
     [joda-time "2.8.2"]
   [commons-fileupload "1.3.3"]
   [commons-io "2.5"]
   [crypto-equality "1.0.0"]
   [crypto-random "1.2.0"]
   [ring/ring-codec "1.0.1"]
 [thheller/shadow-cljs "2.5.1"]
   [com.cognitect/transit-clj "0.8.309"]
     [com.cognitect/transit-java "0.8.332"]
       [com.fasterxml.jackson.core/jackson-core "2.8.7"]
       [commons-codec "1.10"]
       [org.msgpack/msgpack "0.6.12"]
         [com.googlecode.json-simple/json-simple "1.1.1" :exclusions [[junit]]]
         [org.javassist/javassist "3.18.1-GA"]
   [com.cognitect/transit-cljs "0.8.256"]
     [com.cognitect/transit-js "0.8.846"]
   [com.google.javascript/closure-compiler-unshaded "v20180805"]
     [args4j "2.0.26"]
     [com.google.code.findbugs/jsr305 "3.0.1"]
     [com.google.code.gson/gson "2.7"]
     [com.google.errorprone/error_prone_annotations "2.0.18"]
     [com.google.guava/guava "25.1-jre"]
       [com.google.j2objc/j2objc-annotations "1.1"]
       [org.checkerframework/checker-qual "2.0.0"]
       [org.codehaus.mojo/animal-sniffer-annotations "1.14"]
     [com.google.javascript/closure-compiler-externs "v20180805"]
     [com.google.jsinterop/jsinterop-annotations "1.0.0"]
     [com.google.protobuf/protobuf-java "3.0.2"]
   [expound "0.7.1"]
   [fipp "0.6.12"]
     [org.clojure/core.rrb-vector "0.0.11"]
   [hawk "0.2.11"]
     [net.incongru.watchservice/barbary-watchservice "1.0"]
       [net.java.dev.jna/jna "3.2.2"]
   [hiccup "1.0.5"]
   [io.undertow/undertow-core "2.0.11.Final"]
     [org.jboss.logging/jboss-logging "3.3.2.Final"]
     [org.jboss.xnio/xnio-api "3.3.8.Final"]
     [org.jboss.xnio/xnio-nio "3.3.8.Final" :scope "runtime"]
   [nrepl "0.4.4"]
     [org.clojure/tools.logging "0.4.1"]
   [org.clojure/clojurescript "1.10.339" :classifier "slim" :exclusions [[com.google.javascript/closure-compiler-unshaded]]]
     [org.clojure/google-closure-library "0.0-20170809-b9c14c6b"]
       [org.clojure/google-closure-library-third-party "0.0-20170809-b9c14c6b"]
     [org.mozilla/rhino "1.7R5"]
   [org.clojure/core.async "0.4.474"]
     [org.clojure/tools.analyzer.jvm "0.7.0"]
       [org.clojure/core.memoize "0.5.9"]
         [org.clojure/core.cache "0.6.5"]
           [org.clojure/data.priority-map "0.0.7"]
       [org.clojure/tools.analyzer "0.6.9"]
       [org.ow2.asm/asm-all "4.2"]
   [org.clojure/data.json "0.2.6"]
   [org.clojure/tools.cli "0.3.7"]
   [org.clojure/tools.reader "1.3.0"]
   [thheller/shadow-client "1.3.2"]
   [thheller/shadow-cljsjs "0.0.15"]
   [thheller/shadow-util "0.7.0"]
```

The main project source is in `src/main`.

```
.
├── Makefile           ; i18n extract/generate and CI test running
├── karma.conf.js      ; CI Runner config
├── package.json       ; NPM modules
├── project.clj        ; Leiningen project file
├── resources
|   ├── i18n               ; directory for i18n extract/translate/serve
|   │   ├── es.po          ; spanish translations
|   │   └── messages.pot   ; extracted strings (template)
|   └── public
│       ├── cards.html    ; page for mounting dev cards
│       ├── index.html    ; main app index page
│       └── js
│           └── test
│               └── index.html ; custom test page for running tests in dev mode
├── shadow-cljs.edn    ; Shadow-cljs configuration file. CLJS builds.
└── src
    ├── cards
    │   └── fulcro_shadow_cljs_classpath
    │       ├── cards.cljs   ; Main for devcards
    │       └── intro.cljs   ; A sample devcards file
    ├── dev
    │   └── user.clj         ; Functions for running web server in development mode
    ├── main
    │   ├── config           ; configuration files for web server
    │   │   ├── defaults.edn
    │   │   ├── dev.edn
    │   │   └── prod.edn
    │   └── fulcro_shadow_cljs_classpath
    │       ├── api
    │       │   ├── mutations.clj          ; server-side implementation of mutations
    │       │   ├── mutations.cljs         ; client-side implementation of mutations
    │       │   └── read.clj               ; server-side reads
    │       ├── client.cljs                ; file that creates the Fulcro client
    │       ├── development-preload.cljs   ; code to run in development mode before anything else
    │       ├── server.clj                 ; file that creates the web server
    │       ├── server_main.clj            ; production server entry point
    │       └── ui
    │           ├── components.cljc  ; Sample reusable component
    │           └── root.cljc        ; Main UI
    └── test
        └── fulcro_shadow_cljs_classpath
            ├── client_test_main.cljs  ; setup for dev mode tests
            └── sample_spec.cljc       ; a sample spec in fulcro-spec
```

## Setting Up

The shadow-cljs compiler uses all cljsjs and NPM js dependencies through
NPM. If you use a library that is in cljsjs you will also have to add
it to your `package.json`.

You also cannot compile this project until you install the ones it
depends on already:

```
$ npm install
```

or if you prefer `yarn`:

```
$ yarn install
```

Adding NPM Javascript libraries is as simple as adding them to your
`package.json` file and requiring them! See the
[the Shadow-cljs User's Guide](https://shadow-cljs.github.io/docs/UsersGuide.html#_javascript)
for more information.

## Development Mode

Shadow-cljs handles the client-side development build. The file
`src/main/fulcro_shadow_cljs_classpath/client.cljs` contains the code to start and refresh
the client for hot code reload.

Running all client development builds:

```
$ npx shadow-cljs watch main cards test
...
shadow-cljs - HTTP server for ":main" available at http://localhost:8020
shadow-cljs - HTTP server for ":test" available at http://localhost:8022
shadow-cljs - HTTP server for ":cards" available at http://localhost:8023
...
```

The compiler will detect which builds are affected by a change and will minimize
incremental build time.

NOTE: The server wil start a web server for all three builds (on different ports).
You typically do not need the one for main because you'll be running your
own server, but it is there in case you are only going to be writing
a client-side app that has no server API.

The URLs for working with cards and tests are:

- Cards: [http://localhost:8023/cards.html](http://localhost:8023/cards.html)
- Tests: [http://localhost:8022/index.html](http://localhost:8022/index.html)
- Main: [http://localhost:8020/index.html](http://localhost:8020/index.html) (NO API SERVER)

See the server section below for working on the full-stack app itself.

### Client REPL

The shadow-cljs compiler starts an nREPL. It is configured to start on
port 9000 (in `shadow-cljs.edn`).

In IntelliJ, simply add a *remote* Clojure REPL configuration with
host `localhost` and port `9000`.

If you're using CIDER
see [the Shadow-cljs User's Guide](https://shadow-cljs.github.io/docs/UsersGuide.html#_cider)
for more information.

### The API Server

The shadow-cljs compiler starts a server for serving development files,
but you usually will not use it. Instead you'll start your own server
that can also serve your application's API.

Start a clj REPL in IntelliJ, or from the command line:

```bash
$ lein repl
user=> (go)
...
user=> (restart) ; stop, reload server code, and go again
user=> (tools-ns/refresh) ; retry code reload if hot server reload fails
```

The URL to work on your application is then
[http://localhost:3000](http://localhost:3000).

Hot code reload, preloads, and such are all coded into the javascript,
so serving the files from the alternate server is fine.

### Preloads

There is a preload file that is used on the development build of the
application `fulcro-shadow-cljs-classpath.development-preload`. You can add code here that
you want to execute before the application initializes in development
mode.

### Fulcro Inspect

The Fulcro inspect will preload on the development build of the main
application and cards. You can activate it by pressing CTRL-F while in
the application. If you need a different keyboard shortcut (e.g. for
Windows) see the docs on github.

## Tests

Tests are in `src/test`

```
src/test
└── fulcro_shadow_cljs_classpath
    ├── client_test_main.cljs     entry point for dev-mode client tests
    └── sample_spec.cljs          spec runnable by client and server.
```

### Server tests:

Interacting with tests resuts via a browser (also allows test focusing, etc):

From a CLJ REPL:

```
user=> (start-server-tests) ; start a server on port 8888 showing the server tests
```

then navigate to [http://localhost:8888/fulcro-spec-server-tests.html](http://localhost:8888/fulcro-spec-server-tests.html)

If you'd instead like to see them pop up over and over again in a terminal:

```
lein test-refresh
```

### CI Tests

Use the Makefile target `tests`:

```
make test
```

You must have `npm` and Chrome installed. The tests use the `npm`
utility Karma for actually running the tests. This target will run
both client and server tests.

## Dev Cards

The source is in `src/cards`. Remember to add devcard files here, and add
a require the for new card namespace to the `cards.cljs` file.

## I18N

The i18n process is codified into a Makefile. The target extracts strings from
the source (which must build the js, and run xgettext on it, which you must
have installed, perhaps from brew):

```
make i18n-extract
```

and gives you instructions on generating translations.

The translations (po files) are then places into `resources/i18n` and will
be automatically served to the client when the client changes to that locale.

See the Developer's Guide for more details.

## Standalone Runnable Jar (Production, with advanced optimized client js)

```
lein uberjar
java -jar target/fulcro_shadow_cljs_classpath.jar
```
