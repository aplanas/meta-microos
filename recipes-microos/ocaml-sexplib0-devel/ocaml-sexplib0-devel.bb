SUMMARY = "Development files for ocaml-sexplib0"
DESCRIPTION = "The ocaml-sexplib0-devel package contains libraries and signature files for \
developing applications that use ocaml-sexplib0."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "ocaml-sexplib0-devel-0.16.0-1.1.aarch64.rpm"
RPM_HASH = "0ca22f58df4413b6a4a79ff4847d36730806fedfda34c2c3e558f80302a681f725caaade4c8a12e33e8eb9ee15c321916eb89cb2c7e1f831e097f1ce2ca5c94e"

RPROVIDES:${PN} += "ocaml(Sexplib0) ocaml(Sexplib0__) ocaml(Sexplib0__Sexp) ocaml(Sexplib0__Sexp_conv) ocaml(Sexplib0__Sexp_conv_error) ocaml(Sexplib0__Sexp_conv_grammar) ocaml(Sexplib0__Sexp_conv_record) ocaml(Sexplib0__Sexp_grammar) ocaml(Sexplib0__Sexpable) ocaml-sexplib0-devel ocaml-sexplib0-devel(aarch-64) ocamlfind(sexplib0) ocamlx(Sexplib0) ocamlx(Sexplib0__) ocamlx(Sexplib0__Sexp) ocamlx(Sexplib0__Sexp_conv) ocamlx(Sexplib0__Sexp_conv_error) ocamlx(Sexplib0__Sexp_conv_grammar) ocamlx(Sexplib0__Sexp_conv_record) ocamlx(Sexplib0__Sexp_grammar) ocamlx(Sexplib0__Sexpable)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(CamlinternalLazy) ocaml(Stdlib) ocaml(Stdlib__Arg) ocaml(Stdlib__ArrayLabels) ocaml(Stdlib__Buffer) ocaml(Stdlib__Bytes) ocaml(Stdlib__BytesLabels) ocaml(Stdlib__Char) ocaml(Stdlib__Either) ocaml(Stdlib__Ephemeron) ocaml(Stdlib__Format) ocaml(Stdlib__Hashtbl) ocaml(Stdlib__Int32) ocaml(Stdlib__Int64) ocaml(Stdlib__Lazy) ocaml(Stdlib__Lexing) ocaml(Stdlib__ListLabels) ocaml(Stdlib__Map) ocaml(Stdlib__MoreLabels) ocaml(Stdlib__Nativeint) ocaml(Stdlib__Obj) ocaml(Stdlib__Option) ocaml(Stdlib__Parsing) ocaml(Stdlib__Printexc) ocaml(Stdlib__Printf) ocaml(Stdlib__Queue) ocaml(Stdlib__Scanf) ocaml(Stdlib__Seq) ocaml(Stdlib__Set) ocaml(Stdlib__Stack) ocaml(Stdlib__StdLabels) ocaml(Stdlib__StringLabels) ocaml(Stdlib__Sys) ocaml(Stdlib__Uchar) ocaml-sexplib0 ocamlx(CamlinternalLazy) ocamlx(Stdlib) ocamlx(Stdlib__Arg) ocamlx(Stdlib__ArrayLabels) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Bytes) ocamlx(Stdlib__BytesLabels) ocamlx(Stdlib__Char) ocamlx(Stdlib__Ephemeron) ocamlx(Stdlib__Format) ocamlx(Stdlib__Int32) ocamlx(Stdlib__Int64) ocamlx(Stdlib__Lazy) ocamlx(Stdlib__ListLabels) ocamlx(Stdlib__MoreLabels) ocamlx(Stdlib__Nativeint) ocamlx(Stdlib__Obj) ocamlx(Stdlib__Option) ocamlx(Stdlib__Parsing) ocamlx(Stdlib__Printexc) ocamlx(Stdlib__Printf) ocamlx(Stdlib__Queue) ocamlx(Stdlib__Scanf) ocamlx(Stdlib__Stack) ocamlx(Stdlib__StringLabels) ocamlx(Stdlib__Sys)"

inherit rpm
