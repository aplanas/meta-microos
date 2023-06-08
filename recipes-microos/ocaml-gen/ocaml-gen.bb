SUMMARY = "Simple, efficient iterators for OCaml"
DESCRIPTION = "Iterators for OCaml, both restartable and consumable. \
The implementation keeps a good balance between simplicity and performance."
LICENSE = "BSD-2-Clause"

PV = "1.0"

RPM_NAME = "ocaml-gen-1.0-1.10.aarch64.rpm"
RPM_HASH = "895d3313474a8db6e67e7314ce47c699c1aed1ef160bd9c168c2cf0f5891fdbaa95d1b85f4fc73fbb24ba575ccfa015036622fa280ff770a6721b28d2f7d91c1"

RPROVIDES:${PN} += "ocaml-gen ocaml-gen(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
