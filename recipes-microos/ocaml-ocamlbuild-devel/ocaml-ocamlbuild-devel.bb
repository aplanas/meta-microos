SUMMARY = "Development files for ocaml-ocamlbuild"
DESCRIPTION = "The ocaml-ocamlbuild-devel package contains libraries and signature files for \
developing applications that use ocaml-ocamlbuild."
LICENSE = "LGPL-2.0-only-WITH-OCaml-LGPL-linking-exception"

PV = "0.14.2"

RPM_NAME = "ocaml-ocamlbuild-devel-0.14.2-1.4.aarch64.rpm"
RPM_HASH = "867e0192286bc97b320c4c1a2582d1e1ac1124086bea95219f16e935bb6d5f4772118bdf2a94f3f841b038c360ed5846db6d08dac484b326636e68ca22ad2cd4"

RPROVIDES:${PN} += "ocaml(Ocamlbuild) \
ocaml(Ocamlbuild_executor) \
ocaml(Ocamlbuild_pack) \
ocaml(Ocamlbuild_plugin) \
ocaml(Ocamlbuild_unix_plugin) \
ocaml(Signatures) \
ocaml-ocamlbuild-devel \
ocaml-ocamlbuild-devel(aarch-64) \
ocamlfind(ocamlbuild) \
ocamlx(Ocamlbuild) \
ocamlx(Ocamlbuild_executor) \
ocamlx(Ocamlbuild_pack) \
ocamlx(Ocamlbuild_plugin) \
ocamlx(Ocamlbuild_unix_plugin)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(CamlinternalLazy) \
ocaml(Stdlib) \
ocaml(Stdlib__Arg) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bigarray) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Complex) \
ocaml(Stdlib__Digest) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Filename) \
ocaml(Stdlib__Format) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Lazy) \
ocaml(Stdlib__Lexing) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Map) \
ocaml(Stdlib__Printexc) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Queue) \
ocaml(Stdlib__Scanf) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Unix) \
ocaml-ocamlbuild \
ocamlfind(unix) \
ocamlx(CamlinternalLazy) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Arg) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Buffer) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Char) \
ocamlx(Stdlib__Digest) \
ocamlx(Stdlib__Filename) \
ocamlx(Stdlib__Format) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__Lexing) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Map) \
ocamlx(Stdlib__Printexc) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Queue) \
ocamlx(Stdlib__Scanf) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
ocamlx(Unix)"

inherit rpm
