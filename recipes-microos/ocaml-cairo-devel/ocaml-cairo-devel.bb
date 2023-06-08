SUMMARY = "Development files for ocaml-cairo"
DESCRIPTION = "The ocaml-cairo-devel package contains libraries and signature files for \
developing applications that use ocaml-cairo."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.4"

RPM_NAME = "ocaml-cairo-devel-0.6.4-2.3.aarch64.rpm"
RPM_HASH = "569a21bb79c234816157e355b5fc94de17201b0878ad226af93fa33a64c6e287d92406752d5f7880fd2933934f2917ea4b3daa3f52a5671a0d7f21495248ac82"

RPROVIDES:${PN} += "ocaml(Cairo) ocaml-cairo-devel ocaml-cairo-devel(aarch-64) ocamlfind(cairo2) ocamlx(Cairo)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Bigarray) ocaml(Stdlib__Buffer) ocaml(Stdlib__Callback) ocaml(Stdlib__Complex) ocaml(Stdlib__Either) ocaml(Stdlib__Int32) ocaml(Stdlib__List) ocaml(Stdlib__Printexc) ocaml(Stdlib__Printf) ocaml(Stdlib__Seq) ocaml(Stdlib__Uchar) ocaml-cairo ocamlfind(bigarray) ocamlx(Stdlib) ocamlx(Stdlib__Callback) ocamlx(Stdlib__List) ocamlx(Stdlib__Printexc) ocamlx(Stdlib__Printf) pkgconfig(cairo)"

inherit rpm
