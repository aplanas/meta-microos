SUMMARY = "LR(1) parser generator for the OCaml programming language"
DESCRIPTION = "LR(1) parser generator"
LICENSE = "LGPL-2.0"

PV = "20220210"

RPM_NAME = "ocaml-menhir-20220210-1.11.aarch64.rpm"
RPM_HASH = "745988dcd76760a02afd6c92a71d63de563ecb6bfb2d43ff2ea68e2ba6e7bc5eb6352cc6573b21ab75359db0f97523e401712548e3b76f40ab3d25c1174ce709"

RPROVIDES:${PN} += "ocaml-menhir ocaml-menhir(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
