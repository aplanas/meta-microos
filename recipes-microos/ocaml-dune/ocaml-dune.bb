SUMMARY = "A composable build system for OCaml"
DESCRIPTION = "This package provides the dune binary and the documentation."
LICENSE = "MIT"

PV = "3.7.1"

RPM_NAME = "ocaml-dune-3.7.1-1.1.aarch64.rpm"
RPM_HASH = "6b1c8d709b4a7c723b3023ed77938d4738eb0fa48784dd052558f363ce463a690a375cb023b13d970c27cbacbc6f440fd4497e5df6ac73a22b307120b8be0966"

RPROVIDES:${PN} += "ocaml-dune ocaml-dune(aarch-64) ocaml-dune-bootstrap ocaml-dune-bootstrap-devel"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) ocamlfind(compiler-libs)"

inherit rpm
