SUMMARY = "Type-driven code generation"
DESCRIPTION = "ppx_deriving provides common infrastructure for generating \
code based on type definitions, and a set of useful plugins \
for common tasks."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ocaml-ppx_deriving-5.2.1-1.6.aarch64.rpm"
RPM_HASH = "458ec99a63f3a78b90b72af73938e12628f78b7228f45a59aba808298d96d301cfccc40673f2ffffc843cbacdc199e5c29450f9c57cffe86f079d85cf44da944"

RPROVIDES:${PN} += "ocaml-ppx_deriving ocaml-ppx_deriving(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
