SUMMARY = "Code coverage for OCaml and Reason"
DESCRIPTION = "Bisect_ppx is a code coverage tool for OCaml and Reason. It helps you test thoroughly by showing what's not tested."
LICENSE = "GPL-2.0-only"

PV = "2.8.1"

RPM_NAME = "ocaml-bisect_ppx-2.8.1-2.5.aarch64.rpm"
RPM_HASH = "004431b77cf3792c8c4261c9d77fb6532e5e94c2d588c48c86836bb90bda9bde15bc2e7f9640f7c5d15562673a46ef68ef9ba4755dfddecf6177bb055f19a15c"

RPROVIDES:${PN} += "ocaml-bisect_ppx ocaml-bisect_ppx(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
