SUMMARY = "Development files for the opam file syntax parser"
DESCRIPTION = "This is a parser and a printer for the opam file syntax. \
 \
This package contains development files for package opam-file-format."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-file-format-devel-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "6a50dac24f8a04979f129b91ce459cce394fab266435b657083184b134a2d73fe859b7139807e986163e310aa912f04591452576d2dab5bd08423ec69eade5a5"

RPROVIDES:${PN} += "ocaml(OpamBaseParser) ocaml(OpamLexer) ocaml(OpamParser) ocaml(OpamParserTypes) ocaml(OpamPrinter) ocamlfind(opam-file-format) ocamlx(OpamBaseParser) ocamlx(OpamLexer) ocamlx(OpamParser) ocamlx(OpamParserTypes) ocamlx(OpamPrinter) opam-file-format-devel opam-file-format-devel(aarch-64)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Array) ocaml(Stdlib__Buffer) ocaml(Stdlib__Char) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__Hashtbl) ocaml(Stdlib__Int32) ocaml(Stdlib__Lexing) ocaml(Stdlib__List) ocaml(Stdlib__Obj) ocaml(Stdlib__Parsing) ocaml(Stdlib__Printf) ocaml(Stdlib__Scanf) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Sys) ocaml(Stdlib__Uchar) ocaml(Stdlib__Weak) ocamlx(Stdlib) ocamlx(Stdlib__Array) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Char) ocamlx(Stdlib__Format) ocamlx(Stdlib__Hashtbl) ocamlx(Stdlib__Lexing) ocamlx(Stdlib__List) ocamlx(Stdlib__Parsing) ocamlx(Stdlib__Printf) ocamlx(Stdlib__Scanf) ocamlx(Stdlib__String) ocamlx(Stdlib__Sys) ocamlx(Stdlib__Weak) opam-file-format"

inherit rpm
