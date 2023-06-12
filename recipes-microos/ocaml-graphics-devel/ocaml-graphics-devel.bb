SUMMARY = "Development files for ocaml-graphics"
DESCRIPTION = "The ocaml-graphics-devel package contains libraries and signature files for \
developing applications that use ocaml-graphics."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "5.1.2"

RPM_NAME = "ocaml-graphics-devel-5.1.2-2.8.aarch64.rpm"
RPM_HASH = "a8975a4a246b2815b97eea06c040bc61fa8de42f1867735d54cdf48e0cc3a734fdb36c86906c1d802c755464fe1f354cd9703f616bf0b250544b4df29d6e3429"

RPROVIDES:${PN} += "ocaml(Graphics) \
ocaml(GraphicsX11) \
ocaml-graphics-devel \
ocaml-graphics-devel(aarch-64) \
ocaml-x11 \
ocamlfind(graphics) \
ocamlx(Graphics) \
ocamlx(GraphicsX11)"
RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Sys) \
ocaml-graphics \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Callback) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Sys)"

inherit rpm
