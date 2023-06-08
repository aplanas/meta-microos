SUMMARY = "Compatibility OCaml Result module"
DESCRIPTION = "Projects that want to use the new result type defined in OCaml >= 4.03 while \
staying compatible with older version of OCaml should use the Result module \
defined in this library."
LICENSE = "BSD-3-Clause"

PV = "1.5"

RPM_NAME = "ocaml-result-1.5-3.6.aarch64.rpm"
RPM_HASH = "649f6579a0b787ac54696be6f50d6d2e0bad435cc5f495ec35838e87c02b5943bc39ae109fda30eea1ab3dd2a1369308a42b4580de8b7b22c129e78c490d8abf"

RPROVIDES:${PN} += "ocaml-result ocaml-result(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
