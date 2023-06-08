SUMMARY = "A composable build system for OCaml"
DESCRIPTION = "This package provides the dune binary and the documentation."
LICENSE = "MIT"

PV = "3.7.0"

RPM_NAME = "ocaml-dune-3.7.0-1.3.aarch64.rpm"
RPM_HASH = "23099ae1ac28dec5a02b4c8884f6b3686c363b393cfc0f722ba376a3a13a4f4dbfb741b6f190b3227e8699f8cdcbfcd2ad8411c94705267b7394015360a7df6d"

RPROVIDES:${PN} += "ocaml-dune ocaml-dune(aarch-64) ocaml-dune-bootstrap ocaml-dune-bootstrap-devel"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) ocamlfind(compiler-libs)"

inherit rpm
