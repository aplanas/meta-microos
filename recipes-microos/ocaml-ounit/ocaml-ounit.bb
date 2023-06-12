SUMMARY = "Ocaml OUnit test framework"
DESCRIPTION = "OUnit is a unit test framework for OCaml. It allows one to easily \
create unit-tests for OCaml code. It is based on HUnit, a unit testing \
framework for Haskell. It is similar to JUnit, and other xUnit testing \
frameworks."
LICENSE = "MIT"

PV = "2.2.7"

RPM_NAME = "ocaml-ounit-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "f5dca0dc7348653ce4c4e3723717bbc000bf080a4fb3e79d5b02a0aad399ea90fdd553f67febd7e7d6fd2c93f881b960d40b408714d29720ca3930b0989a3395"

RPROVIDES:${PN} += "ocaml-ounit \
ocaml-ounit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
