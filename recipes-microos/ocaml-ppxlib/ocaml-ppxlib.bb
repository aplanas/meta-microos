SUMMARY = "Base library and tools for ppx rewriters"
DESCRIPTION = "The ppxlib project provides the basis for the ppx system, which is \
currently the officially supported method for meta-programming in \
OCaml. It offers a principled way to generate code at compile time in \
OCaml projects."
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "ocaml-ppxlib-0.29.1-1.3.aarch64.rpm"
RPM_HASH = "9841f1c07cdac39d88941835f1b13e9629ab2c68ef8082ac1d1c20d54c2752e287326e603cbf9f72653c8827f273bdc42ff73089e29208534385fe452eefb35e"

RPROVIDES:${PN} += "ocaml-ppxlib ocaml-ppxlib(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
