SUMMARY = "QuickCheck inspired property-based testing for OCaml"
DESCRIPTION = "This module allows to check invariants (properties of some types) over \
randomly generated instances of the type. It provides combinators for \
generating instances and printing them."
LICENSE = "BSD-2-Clause"

PV = "0.20"

RPM_NAME = "ocaml-qcheck-0.20-1.5.aarch64.rpm"
RPM_HASH = "244a8b704deb4ca69384486db4cc4afed93b6c20ce3dbbb656694e58ecf53f31e7a6adea9385df7a9b3707d88df913f425b0a18bd8349e9d413a5d0bdfb7ad5d"

RPROVIDES:${PN} += "ocaml-qcheck ocaml-qcheck(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
