SUMMARY = "Declarative definition of command line interfaces for OCaml"
DESCRIPTION = "Cmdliner is a module for the declarative definition of command line interfaces. \
 \
It provides a simple and compositional mechanism to convert command line \
arguments to OCaml values and pass them to your functions. The module \
automatically handles syntax errors, help messages and UNIX man page \
generation. It supports programs with single or multiple commands and respects \
most of the POSIX and GNU conventions."
LICENSE = "ISC"

PV = "1.1.1"

RPM_NAME = "ocaml-cmdliner-1.1.1-1.9.aarch64.rpm"
RPM_HASH = "4740d4424f08d95d1266080d0e92199a32e43eaff9c4e111cb83405c43d62d9875ac1828b1055437d53914f911505c894b412d8aa96d19a215be35efcc07bbe0"

RPROVIDES:${PN} += "ocaml-cmdliner ocaml-cmdliner(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
