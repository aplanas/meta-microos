SUMMARY = "Development files for ocaml-ppxlib"
DESCRIPTION = "The ocaml-ppxlib-devel package contains libraries and signature files for \
developing applications that use ocaml-ppxlib."
LICENSE = "MIT"

PV = "0.29.1"

RPM_NAME = "ocaml-ppxlib-devel-0.29.1-3.1.aarch64.rpm"
RPM_HASH = "49ad065a828d0786236743651c735d0ecdf46f654a5f3f161895d4a950a70c842c2cc4f78034cec9c0c6fa8e6592f442db095f661c76c3022389e9e02baef8ad"

RPROVIDES:${PN} += "ocaml(Astlib) \
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
ocaml(Astlib__Ast_metadata) \
ocaml(Astlib__Config) \
ocaml(Astlib__Keyword) \
ocaml(Astlib__Location) \
ocaml(Astlib__Longident) \
ocaml(Astlib__Migrate_402_403) \
ocaml(Astlib__Migrate_403_402) \
ocaml(Astlib__Migrate_403_404) \
ocaml(Astlib__Migrate_404_403) \
ocaml(Astlib__Migrate_404_405) \
ocaml(Astlib__Migrate_405_404) \
ocaml(Astlib__Migrate_405_406) \
ocaml(Astlib__Migrate_406_405) \
ocaml(Astlib__Migrate_406_407) \
ocaml(Astlib__Migrate_407_406) \
ocaml(Astlib__Migrate_407_408) \
ocaml(Astlib__Migrate_408_407) \
ocaml(Astlib__Migrate_408_409) \
ocaml(Astlib__Migrate_409_408) \
ocaml(Astlib__Migrate_409_410) \
ocaml(Astlib__Migrate_410_409) \
ocaml(Astlib__Migrate_410_411) \
ocaml(Astlib__Migrate_411_410) \
ocaml(Astlib__Migrate_411_412) \
ocaml(Astlib__Migrate_412_411) \
ocaml(Astlib__Migrate_412_413) \
ocaml(Astlib__Migrate_413_412) \
ocaml(Astlib__Migrate_413_414) \
ocaml(Astlib__Migrate_414_413) \
ocaml(Astlib__Migrate_414_500) \
ocaml(Astlib__Migrate_500_414) \
ocaml(Astlib__Parse) \
ocaml(Astlib__Pprintast) \
ocaml(Astlib__Stdlib0) \
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
ocaml(Ppxlib__Caller_id) \
ocaml(Ppxlib__Code_matcher) \
ocaml(Ppxlib__Code_path) \
ocaml(Ppxlib__Common) \
ocaml(Ppxlib__Context_free) \
ocaml(Ppxlib__Deriving) \
ocaml(Ppxlib__Driver) \
ocaml(Ppxlib__Expansion_context) \
ocaml(Ppxlib__Expansion_helpers) \
ocaml(Ppxlib__Extension) \
ocaml(Ppxlib__Ignore_unused_warning) \
ocaml(Ppxlib__Import) \
ocaml(Ppxlib__Keyword) \
ocaml(Ppxlib__Loc) \
ocaml(Ppxlib__Location) \
ocaml(Ppxlib__Location_check) \
ocaml(Ppxlib__Longident) \
ocaml(Ppxlib__Merlin_helpers) \
ocaml(Ppxlib__Name) \
ocaml(Ppxlib__Options) \
ocaml(Ppxlib__Quoter) \
ocaml(Ppxlib__Reconcile) \
ocaml(Ppxlib__Skip_hash_bang) \
ocaml(Ppxlib__Spellcheck) \
ocaml(Ppxlib__Utils) \
ocaml(Ppxlib_ast) \
ocaml(Ppxlib_ast__) \
ocaml(Ppxlib_ast__Ast) \
ocaml(Ppxlib_ast__Ast_helper_lite) \
ocaml(Ppxlib_ast__Import) \
ocaml(Ppxlib_ast__Location_error) \
ocaml(Ppxlib_ast__Stdlib0) \
ocaml(Ppxlib_ast__Versions) \
ocaml(Ppxlib_ast__Warn) \
ocaml(Ppxlib_metaquot) \
ocaml(Ppxlib_metaquot_lifters) \
ocaml(Ppxlib_print_diff) \
ocaml(Ppxlib_runner) \
ocaml(Ppxlib_runner__Ppx_driver_runner) \
ocaml(Ppxlib_runner_as_ppx) \
ocaml(Ppxlib_runner_as_ppx__Ppx_driver_runner_as_ppx) \
ocaml(Ppxlib_traverse) \
ocaml(Ppxlib_traverse_builtins) \
ocaml(Stdppx) \
ocaml-ppxlib-devel \
ocaml-ppxlib-devel(aarch-64) \
ocamlfind(ppxlib) \
ocamlfind(ppxlib.ast) \
ocamlfind(ppxlib.astlib) \
ocamlfind(ppxlib.metaquot) \
ocamlfind(ppxlib.metaquot_lifters) \
ocamlfind(ppxlib.print_diff) \
ocamlfind(ppxlib.runner) \
ocamlfind(ppxlib.runner_as_ppx) \
ocamlfind(ppxlib.stdppx) \
ocamlfind(ppxlib.traverse) \
ocamlfind(ppxlib.traverse_builtins) \
ocamlx(Astlib) \
ocamlx(Astlib__) \
ocamlx(Astlib__Ast_402) \
ocamlx(Astlib__Ast_403) \
ocamlx(Astlib__Ast_404) \
ocamlx(Astlib__Ast_405) \
ocamlx(Astlib__Ast_406) \
ocamlx(Astlib__Ast_407) \
ocamlx(Astlib__Ast_408) \
ocamlx(Astlib__Ast_409) \
ocamlx(Astlib__Ast_410) \
ocamlx(Astlib__Ast_411) \
ocamlx(Astlib__Ast_412) \
ocamlx(Astlib__Ast_413) \
ocamlx(Astlib__Ast_414) \
ocamlx(Astlib__Ast_500) \
ocamlx(Astlib__Ast_metadata) \
ocamlx(Astlib__Config) \
ocamlx(Astlib__Keyword) \
ocamlx(Astlib__Location) \
ocamlx(Astlib__Longident) \
ocamlx(Astlib__Migrate_402_403) \
ocamlx(Astlib__Migrate_403_402) \
ocamlx(Astlib__Migrate_403_404) \
ocamlx(Astlib__Migrate_404_403) \
ocamlx(Astlib__Migrate_404_405) \
ocamlx(Astlib__Migrate_405_404) \
ocamlx(Astlib__Migrate_405_406) \
ocamlx(Astlib__Migrate_406_405) \
ocamlx(Astlib__Migrate_406_407) \
ocamlx(Astlib__Migrate_407_406) \
ocamlx(Astlib__Migrate_407_408) \
ocamlx(Astlib__Migrate_408_407) \
ocamlx(Astlib__Migrate_408_409) \
ocamlx(Astlib__Migrate_409_408) \
ocamlx(Astlib__Migrate_409_410) \
ocamlx(Astlib__Migrate_410_409) \
ocamlx(Astlib__Migrate_410_411) \
ocamlx(Astlib__Migrate_411_410) \
ocamlx(Astlib__Migrate_411_412) \
ocamlx(Astlib__Migrate_412_411) \
ocamlx(Astlib__Migrate_412_413) \
ocamlx(Astlib__Migrate_413_412) \
ocamlx(Astlib__Migrate_413_414) \
ocamlx(Astlib__Migrate_414_413) \
ocamlx(Astlib__Migrate_414_500) \
ocamlx(Astlib__Migrate_500_414) \
ocamlx(Astlib__Parse) \
ocamlx(Astlib__Pprintast) \
ocamlx(Astlib__Stdlib0) \
ocamlx(Ppxlib) \
ocamlx(Ppxlib__) \
ocamlx(Ppxlib__Ast_builder) \
ocamlx(Ppxlib__Ast_builder_generated) \
ocamlx(Ppxlib__Ast_builder_intf) \
ocamlx(Ppxlib__Ast_pattern) \
ocamlx(Ppxlib__Ast_pattern0) \
ocamlx(Ppxlib__Ast_pattern_generated) \
ocamlx(Ppxlib__Ast_traverse) \
ocamlx(Ppxlib__Ast_traverse0) \
ocamlx(Ppxlib__Attribute) \
ocamlx(Ppxlib__Caller_id) \
ocamlx(Ppxlib__Code_matcher) \
ocamlx(Ppxlib__Code_path) \
ocamlx(Ppxlib__Common) \
ocamlx(Ppxlib__Context_free) \
ocamlx(Ppxlib__Deriving) \
ocamlx(Ppxlib__Driver) \
ocamlx(Ppxlib__Expansion_context) \
ocamlx(Ppxlib__Expansion_helpers) \
ocamlx(Ppxlib__Extension) \
ocamlx(Ppxlib__Ignore_unused_warning) \
ocamlx(Ppxlib__Import) \
ocamlx(Ppxlib__Keyword) \
ocamlx(Ppxlib__Loc) \
ocamlx(Ppxlib__Location) \
ocamlx(Ppxlib__Location_check) \
ocamlx(Ppxlib__Longident) \
ocamlx(Ppxlib__Merlin_helpers) \
ocamlx(Ppxlib__Name) \
ocamlx(Ppxlib__Options) \
ocamlx(Ppxlib__Quoter) \
ocamlx(Ppxlib__Reconcile) \
ocamlx(Ppxlib__Skip_hash_bang) \
ocamlx(Ppxlib__Spellcheck) \
ocamlx(Ppxlib__Utils) \
ocamlx(Ppxlib_ast) \
ocamlx(Ppxlib_ast__) \
ocamlx(Ppxlib_ast__Ast) \
ocamlx(Ppxlib_ast__Ast_helper_lite) \
ocamlx(Ppxlib_ast__Import) \
ocamlx(Ppxlib_ast__Location_error) \
ocamlx(Ppxlib_ast__Stdlib0) \
ocamlx(Ppxlib_ast__Versions) \
ocamlx(Ppxlib_ast__Warn) \
ocamlx(Ppxlib_metaquot) \
ocamlx(Ppxlib_metaquot_lifters) \
ocamlx(Ppxlib_print_diff) \
ocamlx(Ppxlib_runner) \
ocamlx(Ppxlib_runner__Ppx_driver_runner) \
ocamlx(Ppxlib_runner_as_ppx) \
ocamlx(Ppxlib_runner_as_ppx__Ppx_driver_runner_as_ppx) \
ocamlx(Ppxlib_traverse) \
ocamlx(Ppxlib_traverse_builtins) \
ocamlx(Stdppx)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
ocaml(Ast_mapper) \
ocaml(Asttypes) \
ocaml(Build_path_prefix_map) \
ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(CamlinternalOO) \
ocaml(Clflags) \
ocaml(Cmi_format) \
ocaml(Compmisc) \
ocaml(Config) \
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
ocaml(Parse) \
ocaml(Parsetree) \
ocaml(Path) \
ocaml(Ppx_derivers) \
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
ocaml(Stdlib__ArrayLabels) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__BytesLabels) \
ocaml(Stdlib__Char) \
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
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__StdLabels) \
ocaml(Stdlib__String) \
ocaml(Stdlib__StringLabels) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Subst) \
ocaml(Type_immediacy) \
ocaml(Types) \
ocaml(Warnings) \
ocaml-ppxlib \
ocamlfind(compiler-libs.common) \
ocamlfind(ocaml-compiler-libs.common) \
ocamlfind(ocaml-compiler-libs.shadow) \
ocamlfind(ppx_derivers) \
ocamlfind(sexplib0) \
ocamlfind(stdlib-shims) \
ocamlx(Ast_mapper) \
ocamlx(CamlinternalLazy) \
ocamlx(CamlinternalOO) \
ocamlx(Compmisc) \
ocamlx(Config) \
ocamlx(Location) \
ocamlx(Longident) \
ocamlx(Ocaml_shadow) \
ocamlx(Parse) \
ocamlx(Ppx_derivers) \
ocamlx(Sexplib0__Sexp) \
ocamlx(Sexplib0__Sexp_conv) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Arg) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__ArrayLabels) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__BytesLabels) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Int32) \
ocamlx(Stdlib__Int64) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__ListLabels) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Nativeint) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__StringLabels) \
ocamlx(Stdlib__Sys)"

inherit rpm
