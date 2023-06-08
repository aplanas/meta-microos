SUMMARY = "Development files for ocaml-pp"
DESCRIPTION = "The ocaml-pp-devel package contains libraries and signature files for \
developing applications that use ocaml-pp."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "ocaml-pp-devel-1.1.2-3.6.aarch64.rpm"
RPM_HASH = "9e650e2d0b55f7968206ead537d911f3056a75cb086d07efa187d3ffcebbaa8633bec66a422eede79ac24f0f85200a465fb08cc0ec4a47f91b14ddf297f88fee"

RPROVIDES:${PN} += "ocaml(Pp) ocaml-pp-devel ocaml-pp-devel(aarch-64) ocamlfind(pp) ocamlx(Pp)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Buffer) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__ListLabels) ocaml(Stdlib__Printf) ocaml(Stdlib__Seq) ocaml(Stdlib__Uchar) ocaml-pp ocamlx(Stdlib) ocamlx(Stdlib__Format) ocamlx(Stdlib__ListLabels) ocamlx(Stdlib__Printf)"

inherit rpm
