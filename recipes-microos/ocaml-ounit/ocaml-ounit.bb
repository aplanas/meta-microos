SUMMARY = "Ocaml OUnit test framework"
DESCRIPTION = "OUnit is a unit test framework for OCaml. It allows one to easily \
create unit-tests for OCaml code. It is based on HUnit, a unit testing \
framework for Haskell. It is similar to JUnit, and other xUnit testing \
frameworks."
LICENSE = "MIT"

PV = "2.2.6"

RPM_NAME = "ocaml-ounit-2.2.6-1.9.aarch64.rpm"
RPM_HASH = "f5f5cefcee360cbd0ff3298ee3f090203bdbf88eec9d49764aef1edf77c704b2e0ea451d2c54a85173356f88bbaf3ed0ac2fe265c2dae842575cd68a8961aa86"

RPROVIDES:${PN} += "ocaml-ounit ocaml-ounit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
