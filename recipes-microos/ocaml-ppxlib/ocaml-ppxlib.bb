SUMMARY = "Base library and tools for ppx rewriters"
DESCRIPTION = "The ppxlib project provides the basis for the ppx system, which is \
currently the officially supported method for meta-programming in \
OCaml. It offers a principled way to generate code at compile time in \
OCaml projects."
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "ocaml-ppxlib-0.29.1-3.1.aarch64.rpm"
RPM_HASH = "fca3c7dc3f7dae6e3403fec80794cb9c297b27495827759fa7b669914a9d344efcd4991053f35956d6bd8b7c4b60887424d6bb79f1c786ebb34136b7417ca676"

RPROVIDES:${PN} += "ocaml-ppxlib ocaml-ppxlib(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
