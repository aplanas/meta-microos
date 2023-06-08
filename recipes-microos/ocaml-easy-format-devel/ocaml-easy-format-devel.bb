SUMMARY = "Development files for ocaml-easy-format"
DESCRIPTION = "The ocaml-easy-format-devel package contains libraries and signature files for \
developing applications that use ocaml-easy-format."
LICENSE = "BSD-3-Clause"

PV = "1.3.4"

RPM_NAME = "ocaml-easy-format-devel-1.3.4-1.4.aarch64.rpm"
RPM_HASH = "896e5c3adc62a3fb870ef7156734d5a151f65fc08ee489feb9816cd1d04a0a8df0ab3607ecf23355f7df24c48a859ca79c65937cdfa6ca3e0a916d0740462a20"

RPROVIDES:${PN} += "ocaml(Easy_format) ocaml-easy-format-devel ocaml-easy-format-devel(aarch-64) ocamlfind(easy-format) ocamlx(Easy_format)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Buffer) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__Hashtbl) ocaml(Stdlib__List) ocaml(Stdlib__Printf) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Uchar) ocaml-easy-format ocamlx(Stdlib) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Format) ocamlx(Stdlib__Hashtbl) ocamlx(Stdlib__List) ocamlx(Stdlib__Printf) ocamlx(Stdlib__String)"

inherit rpm
