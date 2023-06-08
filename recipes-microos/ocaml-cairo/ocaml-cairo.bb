SUMMARY = "Binding to Cairo, a 2D Vector Graphics Library."
DESCRIPTION = "This is an OCaml binding for the Cairo library, a 2D graphics library with support for multiple output devices."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.4"

RPM_NAME = "ocaml-cairo-0.6.4-2.3.aarch64.rpm"
RPM_HASH = "b628f8bf31610d81b1c97365dde5e03feb54380419a7766b928fd432e2f7da740427246eb2666894ce1b9f719731ee65f29635e78cd3c071f7e8354ebf84183b"

RPROVIDES:${PN} += "ocaml-cairo ocaml-cairo(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit)"

inherit rpm
