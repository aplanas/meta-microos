SUMMARY = "An OCaml dependency toolkit"
DESCRIPTION = "Dose3 is a framework made of several OCaml libraries for managing distribution \
packages and their dependencies. \
 \
Though not tied to any particular distribution, dose3 constitutes a pool of \
libraries which enable analyzing packages coming from various distributions. \
 \
Besides basic functionalities for querying and setting package properties, \
dose3 also implements algorithms for solving more complex problems (monitoring \
package evolutions, correct and complete dependency resolution, repository-wide \
uninstallability checks)."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.0"

RPM_NAME = "ocaml-dose-7.0.0-1.12.aarch64.rpm"
RPM_HASH = "7424c20b3f5f8b565a842a6a0606abafbd1e5cef3a83881bdff8d0bfbfb45d627c1b86f764252f97050e39a71fc2bec22eb6fab9fc31176b4a6722b56c2f880c"

RPROVIDES:${PN} += "ocaml-dose ocaml-dose(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
