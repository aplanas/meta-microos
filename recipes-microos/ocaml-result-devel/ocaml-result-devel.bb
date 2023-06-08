SUMMARY = "Development files for the Compatibility OCaml Result module"
DESCRIPTION = "Projects that want to use the new result type defined in OCaml >= 4.03 while \
staying compatible with older version of OCaml should use the Result module \
defined in this library. \
 \
This package contains development files for ocaml-result."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ocaml-result-devel-1.5-3.6.aarch64.rpm"
RPM_HASH = "43472a4749f900a89496648b95d767915c9e21bceb29594e7a9d09dce7d2f90784ea02dc1811b9b92748bdd5c9cfc8e8b348110f7d8025e88573106cb9407b80"

RPROVIDES:${PN} += "ocaml(Result) ocaml-result-devel ocaml-result-devel(aarch-64) ocamlfind(result) ocamlx(Result)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Either) ocaml(Stdlib__Result) ocaml(Stdlib__Seq) ocaml-result ocamlx(Stdlib__Result)"

inherit rpm
