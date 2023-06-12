SUMMARY = "Shim to substitute Pervasives with Stdlib before 4.08"
DESCRIPTION = "Compiling against this library allows replacing uses of Pervasives \
with Stdlib before 4.08. For example, one can use Stdlib.compare \
instead of Pervasives.compare. It does not, however, provide \
the new functions and modules that were added in the Stdlib module."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-LGPL-linking-exception"

PV = "0.3.0"

RPM_NAME = "ocaml-stdlib-shims-0.3.0-1.11.aarch64.rpm"
RPM_HASH = "ea9564f14898fd1d5961e7e1f74fd8c5ae03cc66437b3d030217ca3630a65ecbe44450656b8b23357e60a41eda7acfa5bc77bd2f04b850de06c891aea7197bfa"

RPROVIDES:${PN} += "ocaml-stdlib-shims \
ocaml-stdlib-shims(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
