SUMMARY = "Development files for ocaml-rope"
DESCRIPTION = "The ocaml-rope-devel package contains libraries and signature files for \
developing applications that use ocaml-rope."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "0.6.2"

RPM_NAME = "ocaml-rope-devel-0.6.2-3.24.aarch64.rpm"
RPM_HASH = "ff2570bc1395786ae537c87863966053586544b9bf2247e63629b5b9b7ba6352a33d38a0ead3d7774cc1430d610b2d0f0e6b32fcac6a6b0a2d0b25b915fb5118"

RPROVIDES:${PN} += "ocaml(Rope) \
ocaml(Rope_top) \
ocaml-rope-devel \
ocaml-rope-devel(aarch-64) \
ocamlfind(rope) \
ocamlfind(rope.top) \
ocamlx(Rope)"
RDEPENDS:${PN} += "ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Cmi_format) \
ocaml(Env) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Load_path) \
ocaml(Location) \
ocaml(Longident) \
ocaml(Misc) \
ocaml(Outcometree) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Primitive) \
ocaml(Shape) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Pervasives) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Subst) \
ocaml(Toploop) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Warnings) \
ocaml-rope \
ocamlfind(bytes) \
ocamlfind(compiler-libs.toplevel) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys)"

inherit rpm
