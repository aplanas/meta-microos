SUMMARY = "OCAML bindings development files for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings development file \
for hivex. Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "ocaml-hivex-devel-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "5f7bd8e4292c6e7e527ccd97a8402ea91a92473762bf76892386e509b471b9b87d1ceb2bbbeef3ddf25ba6be235d4ed91edfac71ebaeac8f48229abdf7f912ae"

RPROVIDES:${PN} += "ocaml(Hivex) \
ocaml-hivex-devel \
ocaml-hivex-devel(aarch-64) \
ocamlfind(hivex) \
ocamlx(Hivex)"
RDEPENDS:${PN} += "hivex-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhivex.so.0()(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Complex) \
ocaml(Unix) \
ocaml-hivex \
ocamlfind(unix) \
ocamlx(Stdlib__Callback)"

inherit rpm
