SUMMARY = "Development files for ocaml-cmdliner"
DESCRIPTION = "The ocaml-cmdliner-devel package contains libraries and signature files for \
developing applications that use ocaml-cmdliner."
LICENSE = "ISC"

PV = "1.1.1"

RPM_NAME = "ocaml-cmdliner-devel-1.1.1-1.9.aarch64.rpm"
RPM_HASH = "c26309c21a49433632f79f4be481afbacba1b7ef52383748234e1bd8b1d42db074a98c0fed4a61deec28e618894a875372938465d6e8640ab9ce33dcdd374001"

RPROVIDES:${PN} += "ocaml(Cmdliner) ocaml(Cmdliner_arg) ocaml(Cmdliner_base) ocaml(Cmdliner_cline) ocaml(Cmdliner_cmd) ocaml(Cmdliner_docgen) ocaml(Cmdliner_eval) ocaml(Cmdliner_exit) ocaml(Cmdliner_info) ocaml(Cmdliner_manpage) ocaml(Cmdliner_msg) ocaml(Cmdliner_term) ocaml(Cmdliner_term_deprecated) ocaml(Cmdliner_trie) ocaml-cmdliner-devel ocaml-cmdliner-devel(aarch-64) ocamlfind(cmdliner) ocamlx(Cmdliner) ocamlx(Cmdliner_arg) ocamlx(Cmdliner_base) ocamlx(Cmdliner_cline) ocamlx(Cmdliner_cmd) ocamlx(Cmdliner_docgen) ocamlx(Cmdliner_eval) ocamlx(Cmdliner_exit) ocamlx(Cmdliner_info) ocamlx(Cmdliner_manpage) ocamlx(Cmdliner_msg) ocamlx(Cmdliner_term) ocamlx(Cmdliner_term_deprecated) ocamlx(Cmdliner_trie)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(CamlinternalLazy) ocaml(Stdlib) ocaml(Stdlib__Array) ocaml(Stdlib__Buffer) ocaml(Stdlib__Bytes) ocaml(Stdlib__Char) ocaml(Stdlib__Either) ocaml(Stdlib__Filename) ocaml(Stdlib__Format) ocaml(Stdlib__Int) ocaml(Stdlib__Int32) ocaml(Stdlib__Int64) ocaml(Stdlib__Lazy) ocaml(Stdlib__List) ocaml(Stdlib__Map) ocaml(Stdlib__Nativeint) ocaml(Stdlib__Printexc) ocaml(Stdlib__Printf) ocaml(Stdlib__Result) ocaml(Stdlib__Seq) ocaml(Stdlib__Set) ocaml(Stdlib__String) ocaml(Stdlib__Sys) ocaml(Stdlib__Uchar) ocaml-cmdliner ocamlx(CamlinternalLazy) ocamlx(Stdlib) ocamlx(Stdlib__Array) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Bytes) ocamlx(Stdlib__Char) ocamlx(Stdlib__Filename) ocamlx(Stdlib__Format) ocamlx(Stdlib__Int) ocamlx(Stdlib__Int32) ocamlx(Stdlib__Int64) ocamlx(Stdlib__List) ocamlx(Stdlib__Map) ocamlx(Stdlib__Nativeint) ocamlx(Stdlib__Printexc) ocamlx(Stdlib__Printf) ocamlx(Stdlib__Result) ocamlx(Stdlib__Set) ocamlx(Stdlib__String) ocamlx(Stdlib__Sys)"

inherit rpm
