SUMMARY = "Result value combinators for OCaml"
DESCRIPTION = "Rresult is an OCaml module for handling computation results and errors in an \
explicit and declarative manner, without resorting to exceptions. It defines \
combinators to operate on the result type available from OCaml 4.03 in the \
standard library."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "ocaml-rresult-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "9044a6e7c34bf83ad9ca66752decb37fb7089ab157d11eacb2e1d1518f47b3c2afc299db28ed82b8cd904abde621d222dac7503f9c28a42cbb21d611c8945db9"

RPROVIDES:${PN} += "ocaml-rresult ocaml-rresult(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
