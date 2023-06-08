SUMMARY = "Development files for ocaml-cppo"
DESCRIPTION = "The ocaml-cppo-devel package contains libraries and signature files for \
developing applications that use ocaml-cppo."
LICENSE = "BSD-3-Clause"

PV = "1.6.9"

RPM_NAME = "ocaml-cppo-devel-1.6.9-1.4.aarch64.rpm"
RPM_HASH = "9dff52c2a50dcf44e561aadcd15def73c737a7feab71b2689a01a3a6064cfefce40875a76bbc462c56fcc7e7d9e96dc31fa13f30c167ac3f63ad436de6ec26c9"

RPROVIDES:${PN} += "ocaml-cppo-devel ocaml-cppo-devel(aarch-64) ocamlfind(cppo)"
RDEPENDS:${PN} += "ocaml-cppo"

inherit rpm
