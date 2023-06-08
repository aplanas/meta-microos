SUMMARY = "Development files for ocaml-ppx_derivers"
DESCRIPTION = "The ocaml-ppx_derivers-devel package contains libraries and signature files for \
developing applications that use ocaml-ppx_derivers."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "ocaml-ppx_derivers-devel-1.2.1-4.9.aarch64.rpm"
RPM_HASH = "699b95d61eefa95f03f657edef9300b84658b8619edd760b102a73ffcda206acab03147157031628f28fab6c6d130bfb7b0eee8f33cadfac8935a89a1d9f16a7"

RPROVIDES:${PN} += "ocaml(Ppx_derivers) ocaml-ppx_derivers-devel ocaml-ppx_derivers-devel(aarch-64) ocamlfind(ppx_derivers) ocamlx(Ppx_derivers)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Buffer) ocaml(Stdlib__Either) ocaml(Stdlib__Hashtbl) ocaml(Stdlib__Printf) ocaml(Stdlib__Seq) ocaml(Stdlib__Uchar) ocaml-ppx_derivers ocamlx(Stdlib) ocamlx(Stdlib__Hashtbl) ocamlx(Stdlib__Printf)"

inherit rpm
