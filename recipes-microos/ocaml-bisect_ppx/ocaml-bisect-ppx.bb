SUMMARY = "Code coverage for OCaml and Reason"
DESCRIPTION = "Bisect_ppx is a code coverage tool for OCaml and Reason. It helps you test thoroughly by showing what's not tested."
LICENSE = "GPL-2.0-only"

PV = "2.8.2"

RPM_NAME = "ocaml-bisect_ppx-2.8.2-2.1.aarch64.rpm"
RPM_HASH = "6b444d76bf5e59e407e68ad12790091b5313583c6fd6af257bed1d08c5ce5da19b4562a2557d3bd82580fc4622b3d04117817a3949b7d1fb1a848168f0b65b03"

RPROVIDES:${PN} += "ocaml-bisect_ppx ocaml-bisect_ppx(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
