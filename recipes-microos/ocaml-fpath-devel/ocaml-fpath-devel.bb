SUMMARY = "Development files for ocaml-fpath"
DESCRIPTION = "The ocaml-fpath-devel package contains libraries and signature files for \
developing applications that use ocaml-fpath."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "ocaml-fpath-devel-0.7.3-2.9.aarch64.rpm"
RPM_HASH = "80578db4c8bfbc3da9023282e521bef9ff91e71ea784316b1cd19b052c71e005e4d344e5cd6206d14292e265462a3067b4049d8bfdaef1cef0e5f150f9fe6d7e"

RPROVIDES:${PN} += "ocaml(Fpath) \
ocaml(Fpath_top) \
ocaml-fpath-devel \
ocaml-fpath-devel(aarch-64) \
ocamlfind(fpath) \
ocamlfind(fpath.top) \
ocamlx(Fpath) \
ocamlx(Fpath_top)"
RDEPENDS:${PN} += "ocaml(Astring) \
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
ocaml(Stdlib__Bytes) \
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
ocaml-fpath \
ocamlfind(astring) \
ocamlfind(astring.top) \
ocamlfind(compiler-libs.toplevel) \
ocamlfind(result) \
ocamlx(Astring) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__Sys) \
ocamlx(Toploop)"

inherit rpm
