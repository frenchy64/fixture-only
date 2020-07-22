# fixture-only

If a test fixture in Leiningen throws an exception, a strange
`lein test :only` suggestion is printed where the name and
namespace of the suggestion symbol is identical.


```clojure
lein test
AMBONNAI-M-F0Y6 fixture-only$ lein test

lein test fixture-only.core-test

lein test :only fixture-only.core-test/fixture-only.core-test

ERROR in (fixture-only.core-test) (core_test.clj:4)
Uncaught exception in test fixture
expected: nil
  actual: java.lang.Exception: null
 at fixture_only.core_test$fixture.invokeStatic (core_test.clj:4)
    fixture_only.core_test$fixture.invoke (core_test.clj:4)
    clojure.test$compose_fixtures$fn__9731$fn__9732.invoke (test.clj:694)
    clojure.test$default_fixture.invokeStatic (test.clj:687)
    clojure.test$default_fixture.invoke (test.clj:683)
    clojure.test$compose_fixtures$fn__9731.invoke (test.clj:694)
    clojure.test$test_vars.invokeStatic (test.clj:731)
    clojure.test$test_all_vars.invokeStatic (test.clj:737)
    clojure.test$test_ns.invokeStatic (test.clj:758)
    clojure.test$test_ns.invoke (test.clj:743)
    user$eval224$fn__285.invoke (form-init5593054482259167404.clj:1)
    clojure.lang.AFn.applyToHelper (AFn.java:156)
    clojure.lang.AFn.applyTo (AFn.java:144)
    clojure.core$apply.invokeStatic (core.clj:667)
    clojure.core$apply.invoke (core.clj:660)
    leiningen.core.injected$compose_hooks$fn__154.doInvoke (form-init5593054482259167404.clj:1)
    clojure.lang.RestFn.applyTo (RestFn.java:137)
    clojure.core$apply.invokeStatic (core.clj:665)
    clojure.core$apply.invoke (core.clj:660)
    leiningen.core.injected$run_hooks.invokeStatic (form-init5593054482259167404.clj:1)
    leiningen.core.injected$run_hooks.invoke (form-init5593054482259167404.clj:1)
    leiningen.core.injected$prepare_for_hooks$fn__159$fn__160.doInvoke (form-init5593054482259167404.clj:1)
    clojure.lang.RestFn.applyTo (RestFn.java:137)
    clojure.lang.AFunction$1.doInvoke (AFunction.java:31)
    clojure.lang.RestFn.invoke (RestFn.java:408)
    clojure.core$map$fn__5866.invoke (core.clj:2755)
    clojure.lang.LazySeq.sval (LazySeq.java:42)
    clojure.lang.LazySeq.seq (LazySeq.java:51)
    clojure.lang.Cons.next (Cons.java:39)
    clojure.lang.RT.boundedLength (RT.java:1792)
    clojure.lang.RestFn.applyTo (RestFn.java:130)
    clojure.core$apply.invokeStatic (core.clj:667)
    clojure.test$run_tests.invokeStatic (test.clj:768)
    clojure.test$run_tests.doInvoke (test.clj:768)
    clojure.lang.RestFn.applyTo (RestFn.java:137)
    clojure.core$apply.invokeStatic (core.clj:665)
    clojure.core$apply.invoke (core.clj:660)
    user$eval224$fn__297$fn__330.invoke (form-init5593054482259167404.clj:1)
    user$eval224$fn__297$fn__298.invoke (form-init5593054482259167404.clj:1)
    user$eval224$fn__297.invoke (form-init5593054482259167404.clj:1)
    user$eval224.invokeStatic (form-init5593054482259167404.clj:1)
    user$eval224.invoke (form-init5593054482259167404.clj:1)
    clojure.lang.Compiler.eval (Compiler.java:7177)
    clojure.lang.Compiler.eval (Compiler.java:7167)
    clojure.lang.Compiler.load (Compiler.java:7636)
    clojure.lang.Compiler.loadFile (Compiler.java:7574)
    clojure.main$load_script.invokeStatic (main.clj:475)
    clojure.main$init_opt.invokeStatic (main.clj:477)
    clojure.main$init_opt.invoke (main.clj:477)
    clojure.main$initialize.invokeStatic (main.clj:508)
    clojure.main$null_opt.invokeStatic (main.clj:542)
    clojure.main$null_opt.invoke (main.clj:539)
    clojure.main$main.invokeStatic (main.clj:664)
    clojure.main$main.doInvoke (main.clj:616)
    clojure.lang.RestFn.applyTo (RestFn.java:137)
    clojure.lang.Var.applyTo (Var.java:705)
    clojure.main.main (main.java:40)

Ran 0 tests containing 1 assertions.
0 failures, 1 errors.
Tests failed.
```

## License

Copyright © 2020 Ambrose Bonnaire-Sergeant

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
