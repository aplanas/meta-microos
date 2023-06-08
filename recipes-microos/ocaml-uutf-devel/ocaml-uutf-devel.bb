SUMMARY = "Development files for ocaml-uutf"
DESCRIPTION = "The ocaml-uutf-devel package contains libraries and signature files for \
developing applications that use ocaml-uutf."
LICENSE = "ISC"

PV = "1.0.3"

RPM_NAME = "ocaml-uutf-devel-1.0.3-1.9.aarch64.rpm"
RPM_HASH = "1e63e131ee7d350b8e398bf266f441f471324944617f866baa802d001bd139ef2694613246a11159c7906e89392b29280744d91d8d749c469c0905bb75bc6b7d"

RPROVIDES:${PN} += "ocaml(Uutf) ocaml-uutf-devel ocaml-uutf-devel(aarch-64) ocamlfind(uutf) ocamlx(Uutf)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Array) ocaml(Stdlib__Buffer) ocaml(Stdlib__Bytes) ocaml(Stdlib__Char) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__Printf) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Uchar) ocaml-uutf ocamlx(Stdlib) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Bytes) ocamlx(Stdlib__Format) ocamlx(Stdlib__Printf) ocamlx(Stdlib__String) ocamlx(Stdlib__Uchar)"

inherit rpm
