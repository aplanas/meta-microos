SUMMARY = "Development files for ocaml-ptmap"
DESCRIPTION = "The ocaml-ptmap-devel package contains libraries and signature files for \
developing applications that use ocaml-ptmap."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-linking-exception"

PV = "2.0.5"

RPM_NAME = "ocaml-ptmap-devel-2.0.5-1.16.aarch64.rpm"
RPM_HASH = "f1b7837ffe698d3b91fc150e60d51ebd1f93db8c4139c47c96e612583e4a578db60d19ec5650103a23bfd2b03a756c8717c37b43b9efd02024b164309e3c09bb"

RPROVIDES:${PN} += "ocaml(Ptmap) ocaml-ptmap-devel ocaml-ptmap-devel(aarch-64) ocamlfind(ptmap) ocamlx(Ptmap)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Either) ocaml(Stdlib__Seq) ocaml-ptmap ocamlfind(seq) ocamlx(Stdlib) ocamlx(Stdlib__Seq)"

inherit rpm
