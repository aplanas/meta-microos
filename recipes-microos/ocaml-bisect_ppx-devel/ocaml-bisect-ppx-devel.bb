SUMMARY = "Development files for ocaml-bisect_ppx"
DESCRIPTION = "The ocaml-bisect_ppx-devel package contains libraries and signature files for \
developing applications that use ocaml-bisect_ppx."
LICENSE = "GPL-2.0-only"

PV = "2.8.2"

RPM_NAME = "ocaml-bisect_ppx-devel-2.8.2-2.1.aarch64.rpm"
RPM_HASH = "e870f91e6c666cec3f6edf61c2a0038ff12ea63069bbb51266eb219d6246e4cb026434fc92ed97bd30c73b7c0c2986dbd4c92af36969fdba6d2925c88c481ae4"

RPROVIDES:${PN} += "ocaml(Bisect) \
ocaml(Bisect__Runtime) \
ocaml(Bisect_common) \
ocaml(Bisect_ppx) \
ocaml(Bisect_ppx__Exclude) \
ocaml(Bisect_ppx__Exclude_lexer) \
ocaml(Bisect_ppx__Exclude_parser) \
ocaml(Bisect_ppx__Exclusions) \
ocaml(Bisect_ppx__Instrument) \
ocaml(Bisect_ppx__Register) \
ocaml-bisect_ppx-devel \
ocaml-bisect_ppx-devel(aarch-64) \
ocamlfind(bisect_ppx) \
ocamlfind(bisect_ppx.common) \
ocamlfind(bisect_ppx.runtime) \
ocamlx(Bisect) \
ocamlx(Bisect__Runtime) \
ocamlx(Bisect_common) \
ocamlx(Bisect_ppx) \
ocamlx(Bisect_ppx__Exclude) \
ocamlx(Bisect_ppx__Exclude_lexer) \
ocamlx(Bisect_ppx__Exclude_parser) \
ocamlx(Bisect_ppx__Exclusions) \
ocamlx(Bisect_ppx__Instrument) \
ocamlx(Bisect_ppx__Register)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
ocaml(Astlib) \
ocaml(Astlib__) \
ocaml(Astlib__Ast_402) \
ocaml(Astlib__Ast_403) \
ocaml(Astlib__Ast_404) \
ocaml(Astlib__Ast_405) \
ocaml(Astlib__Ast_406) \
ocaml(Astlib__Ast_407) \
ocaml(Astlib__Ast_408) \
ocaml(Astlib__Ast_409) \
ocaml(Astlib__Ast_410) \
ocaml(Astlib__Ast_411) \
ocaml(Astlib__Ast_412) \
ocaml(Astlib__Ast_413) \
ocaml(Astlib__Ast_414) \
ocaml(Astlib__Ast_500) \
ocaml(Astlib__Location) \
ocaml(Astlib__Longident) \
ocaml(Astlib__Parse) \
ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalOO) \
ocaml(Clflags) \
ocaml(Cmi_format) \
ocaml(Compmisc) \
ocaml(Env) \
ocaml(Ident) \
ocaml(Identifiable) \
ocaml(Load_path) \
ocaml(Location) \
ocaml(Longident) \
ocaml(Misc) \
ocaml(Ocaml_common) \
ocaml(Ocaml_shadow) \
ocaml(Outcometree) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Ppxlib) \
ocaml(Ppxlib__) \
ocaml(Ppxlib__Ast_builder) \
ocaml(Ppxlib__Ast_builder_generated) \
ocaml(Ppxlib__Ast_builder_intf) \
ocaml(Ppxlib__Ast_pattern) \
ocaml(Ppxlib__Ast_pattern0) \
ocaml(Ppxlib__Ast_pattern_generated) \
ocaml(Ppxlib__Ast_traverse) \
ocaml(Ppxlib__Ast_traverse0) \
ocaml(Ppxlib__Attribute) \
ocaml(Ppxlib__Code_path) \
ocaml(Ppxlib__Common) \
ocaml(Ppxlib__Context_free) \
ocaml(Ppxlib__Driver) \
ocaml(Ppxlib__Expansion_context) \
ocaml(Ppxlib__Extension) \
ocaml(Ppxlib__Import) \
ocaml(Ppxlib__Loc) \
ocaml(Ppxlib__Location) \
ocaml(Ppxlib__Longident) \
ocaml(Ppxlib__Name) \
ocaml(Ppxlib__Utils) \
ocaml(Ppxlib_ast) \
ocaml(Ppxlib_ast__) \
ocaml(Ppxlib_ast__Ast) \
ocaml(Ppxlib_ast__Ast_helper_lite) \
ocaml(Ppxlib_ast__Import) \
ocaml(Ppxlib_ast__Versions) \
ocaml(Ppxlib_traverse_builtins) \
ocaml(Primitive) \
ocaml(Profile) \
ocaml(Sexplib0) \
ocaml(Sexplib0__) \
ocaml(Sexplib0__Sexp) \
ocaml(Sexplib0__Sexp_conv) \
ocaml(Sexplib0__Sexp_conv_grammar) \
ocaml(Sexplib0__Sexp_grammar) \
ocaml(Sexplib0__Sexpable) \
ocaml(Shape) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__BytesLabels) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__ListLabels) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Obj) \
ocaml(Stdlib__Parsing) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__StdLabels) \
ocaml(Stdlib__String) \
ocaml(Stdlib__StringLabels) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Stdppx) \
ocaml(Str) \
ocaml(Subst) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Unix) \
ocaml(Warnings) \
ocaml-bisect_ppx \
ocamlfind(ppxlib) \
ocamlfind(ppxlib.ast) \
ocamlfind(str) \
ocamlfind(unix) \
ocamlx(CamlinternalLazy) \
ocamlx(CamlinternalOO) \
ocamlx(Ppxlib__Ast_builder) \
ocamlx(Ppxlib__Ast_traverse) \
ocamlx(Ppxlib__Driver) \
ocamlx(Ppxlib__Expansion_context) \
ocamlx(Ppxlib__Location) \
ocamlx(Ppxlib__Longident) \
ocamlx(Ppxlib_ast__Ast_helper_lite) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Arg) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Parsing) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Random) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Str) \
ocamlx(Unix)"

inherit rpm
