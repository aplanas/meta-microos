SUMMARY = "Ropes ('heavyweight strings') for OCaml"
DESCRIPTION = "Ropes ('heavyweight strings') are a scalable string implementation: \
they are designed for efficient operation that involve the string as \
a whole. Operations such as concatenation, and substring take time \
that is nearly independent of the length of the string. Unlike \
strings, ropes are a reasonable representation for very long strings \
such as edit buffers or mail messages."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "0.6.2"

RPM_NAME = "ocaml-rope-0.6.2-3.24.aarch64.rpm"
RPM_HASH = "d8ad97d1c9a86da4047dc1e0aec1f4578d81777a7671c1530d64ea550012898bd952e0a34281117e5f60243424e8622efd23c1276d0622a51e8ac2c01e5ea16f"

RPROVIDES:${PN} += "ocaml-rope ocaml-rope(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
