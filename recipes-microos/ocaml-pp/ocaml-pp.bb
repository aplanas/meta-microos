SUMMARY = "Pretty-printing library"
DESCRIPTION = "This library provides a lean alternative to the Format 1 module of the OCaml standard library. \
 \
Pp uses the same concepts of boxes and break hints, and the final rendering is done to formatter from the Format module."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ocaml-pp-1.1.2-3.6.aarch64.rpm"
RPM_HASH = "9dc7ac38576c38d383b39630018407e9f3b75e75e1824e7a03fc2a4b42adf6f2257fffb183cd4224ad9c7faf7e89b5719df6cdb3c29d4952cb91948fe1cab6a3"

RPROVIDES:${PN} += "ocaml-pp ocaml-pp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
