SUMMARY = "Generic build tool for building OCaml library and programs"
DESCRIPTION = "OCamlbuild is a generic build tool, that has built-in rules for \
building OCaml library and programs. \
 \
OCamlbuild was distributed as part of the OCaml distribution for \
OCaml versions between 3.10.0 and 4.02.3. Starting from OCaml \
4.03, it is now released separately."
LICENSE = "LGPL-2.0-only-WITH-OCaml-LGPL-linking-exception"

PV = "0.14.2"

RPM_NAME = "ocaml-ocamlbuild-0.14.2-1.4.aarch64.rpm"
RPM_HASH = "2e0138fc21597ae2c1b3e5940491c23d5f71e1963435e94c26789171e324878b2f8bcd082462e249ce84eddef4738cc92f19a0359dc19bc3b5cde2d6f21fe4c7"

RPROVIDES:${PN} += "ocaml-ocamlbuild \
ocaml-ocamlbuild(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/ocamlrun \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
ocaml-ocamlbuild-devel"

inherit rpm
