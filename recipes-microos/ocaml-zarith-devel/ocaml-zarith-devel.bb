SUMMARY = "Development files for ocaml-zarith"
DESCRIPTION = "The ocaml-zarith-devel package contains libraries and signature files for \
developing applications that use ocaml-zarith."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "1.12"

RPM_NAME = "ocaml-zarith-devel-1.12-1.15.aarch64.rpm"
RPM_HASH = "fd2593ad36e0722bb5e11cc3dc1bc373c17faa0b392d42f5b4e22b8f80bb730ad219734aa2dd4a36382616b9008503115b84b11e1ed58c979df8ca46e14fc80c"

RPROVIDES:${PN} += "ocaml(Big_int_Z) \
ocaml(Q) \
ocaml(Z) \
ocaml(Zarith_top) \
ocaml(Zarith_version) \
ocaml-zarith-devel \
ocaml-zarith-devel(aarch-64) \
ocamlfind(zarith) \
ocamlfind(zarith.top) \
ocamlx(Big_int_Z) \
ocamlx(Q) \
ocamlx(Z) \
ocamlx(Zarith_top) \
ocamlx(Zarith_version)"
RDEPENDS:${PN} += "gmp-devel \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
ocaml(Asttypes) \
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
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Obj) \
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
ocaml-zarith \
ocamlfind(compiler-libs.toplevel) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Callback) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Toploop)"

inherit rpm
