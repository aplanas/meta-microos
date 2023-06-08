SUMMARY = "Development files for ocaml-csexp"
DESCRIPTION = "The ocaml-csexp-devel package contains libraries and signature files for \
developing applications that use ocaml-csexp."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ocaml-csexp-devel-1.5.1-3.6.aarch64.rpm"
RPM_HASH = "972926b1733089d9c2bcdec412e57fc5a73a25dc53115e93906bb42be7af32f441e2569fe577add0c5de70ff238126c2d006fdcad46cd60b1ef94308e593ba8b"

RPROVIDES:${PN} += "ocaml(Csexp) ocaml-csexp-devel ocaml-csexp-devel(aarch-64) ocamlfind(csexp) ocamlx(Csexp)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Buffer) ocaml(Stdlib__Char) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__List) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Sys) ocaml(Stdlib__Uchar) ocaml-csexp ocamlx(Stdlib) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Format) ocamlx(Stdlib__List) ocamlx(Stdlib__String) ocamlx(Stdlib__Sys)"

inherit rpm
