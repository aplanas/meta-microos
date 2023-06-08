SUMMARY = "Development files for ocaml-re"
DESCRIPTION = "The ocaml-re-devel package contains libraries and signature files for \
developing applications that use ocaml-re."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "1.10.4"

RPM_NAME = "ocaml-re-devel-1.10.4-1.5.aarch64.rpm"
RPM_HASH = "96fd8d4a06f6dc279427539a1f560df3a2d7fb6bb2260db8adc7737d8cf50b2256e80e06a2c5d5f6c87f4eb53f6e70090d6a88e5777f4c93d655c7a4ead56f13"

RPROVIDES:${PN} += "ocaml(Re) ocaml(Re__) ocaml(Re__Automata) ocaml(Re__Category) ocaml(Re__Color_map) ocaml(Re__Core) ocaml(Re__Cset) ocaml(Re__Emacs) ocaml(Re__Fmt) ocaml(Re__Glob) ocaml(Re__Group) ocaml(Re__Pcre) ocaml(Re__Perl) ocaml(Re__Pmark) ocaml(Re__Posix) ocaml(Re__Str) ocaml(Re_emacs) ocaml(Re_glob) ocaml(Re_pcre) ocaml(Re_perl) ocaml(Re_posix) ocaml(Re_str) ocaml-re-devel ocaml-re-devel(aarch-64) ocamlfind(re) ocamlfind(re.emacs) ocamlfind(re.glob) ocamlfind(re.pcre) ocamlfind(re.perl) ocamlfind(re.posix) ocamlfind(re.str) ocamlx(Re) ocamlx(Re__) ocamlx(Re__Automata) ocamlx(Re__Category) ocamlx(Re__Color_map) ocamlx(Re__Core) ocamlx(Re__Cset) ocamlx(Re__Emacs) ocamlx(Re__Fmt) ocamlx(Re__Glob) ocamlx(Re__Group) ocamlx(Re__Pcre) ocamlx(Re__Perl) ocamlx(Re__Pmark) ocamlx(Re__Posix) ocamlx(Re__Str) ocamlx(Re_emacs) ocamlx(Re_glob) ocamlx(Re_pcre) ocamlx(Re_perl) ocamlx(Re_posix) ocamlx(Re_str)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(CamlinternalLazy) ocaml(Stdlib) ocaml(Stdlib__Array) ocaml(Stdlib__Buffer) ocaml(Stdlib__Bytes) ocaml(Stdlib__Char) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__Hashtbl) ocaml(Stdlib__Lazy) ocaml(Stdlib__List) ocaml(Stdlib__Map) ocaml(Stdlib__Seq) ocaml(Stdlib__Set) ocaml(Stdlib__String) ocaml(Stdlib__Uchar) ocaml-re ocamlfind(seq) ocamlx(CamlinternalLazy) ocamlx(Stdlib) ocamlx(Stdlib__Array) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Bytes) ocamlx(Stdlib__Char) ocamlx(Stdlib__Format) ocamlx(Stdlib__Hashtbl) ocamlx(Stdlib__List) ocamlx(Stdlib__Map) ocamlx(Stdlib__Seq) ocamlx(Stdlib__Set) ocamlx(Stdlib__String)"

inherit rpm
