SUMMARY = "Standalone tool for opam install files"
DESCRIPTION = "Handles (un)installation of package files following instructions from \
OPAM *.install files."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.4"

RPM_NAME = "opam-installer-2.1.4-1.4.aarch64.rpm"
RPM_HASH = "304e67cbf55685f9ecf6540d8ed3ef6304f2da70f89d72d58e106d8990029ed36b1bbab10e9e4973906262e382d72aa3218eee3ddf7d86dd46450efe84726cb0"

RPROVIDES:${PN} += "opam-installer opam-installer(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) opam"

inherit rpm
