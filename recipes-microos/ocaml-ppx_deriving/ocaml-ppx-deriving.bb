SUMMARY = "Type-driven code generation"
DESCRIPTION = "ppx_deriving provides common infrastructure for generating \
code based on type definitions, and a set of useful plugins \
for common tasks."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "ocaml-ppx_deriving-5.2.1-2.1.aarch64.rpm"
RPM_HASH = "f87f5f26bee3d88e87edf912b19ed207ef860dc7cd6d31335181743c34e5ba19e31a265c7e696e61959fed348eb321e025e88e79152a54bbb9c2f9823a54926d"

RPROVIDES:${PN} += "ocaml-ppx_deriving \
ocaml-ppx_deriving(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
