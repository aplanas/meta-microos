SUMMARY = "Development files for ocaml-gen"
DESCRIPTION = "The ocaml-gen-devel package contains libraries and signature files for \
developing applications that use ocaml-gen."
LICENSE = "BSD-2-Clause"

PV = "1.0"

RPM_NAME = "ocaml-gen-devel-1.0-1.10.aarch64.rpm"
RPM_HASH = "ee61d3f4ed0784a83b74e041017ceb70bddf6dcc59cd06170cbbcc9643b0c1ae2bc06d342321930a0054711bafeb7e31fd37249f8fe32682ad17c06fd76afdac"

RPROVIDES:${PN} += "ocaml(Gen) ocaml(GenClone) ocaml(GenLabels) ocaml(GenLabels_intf) ocaml(GenM) ocaml(GenMList) ocaml(GenM_intf) ocaml(GenShims_) ocaml(Gen_intf) ocaml-gen-devel ocaml-gen-devel(aarch-64) ocamlfind(gen) ocamlx(Gen) ocamlx(GenClone) ocamlx(GenLabels) ocamlx(GenLabels_intf) ocamlx(GenM) ocamlx(GenMList) ocamlx(GenM_intf) ocamlx(GenShims_) ocamlx(Gen_intf)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(CamlinternalOO) ocaml(Stdlib) ocaml(Stdlib__Array) ocaml(Stdlib__Buffer) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__Int32) ocaml(Stdlib__Int64) ocaml(Stdlib__List) ocaml(Stdlib__Nativeint) ocaml(Stdlib__Obj) ocaml(Stdlib__Queue) ocaml(Stdlib__Random) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Uchar) ocaml-gen ocamlfind(bytes) ocamlfind(seq) ocamlx(CamlinternalOO) ocamlx(Stdlib) ocamlx(Stdlib__Array) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Format) ocamlx(Stdlib__List) ocamlx(Stdlib__Queue) ocamlx(Stdlib__Random)"

inherit rpm
