SUMMARY = "Development files for ocaml-qtest"
DESCRIPTION = "The ocaml-qtest-devel package contains libraries and signature files for \
developing applications that use ocaml-qtest."
LICENSE = "GPL-3.0-or-later"

PV = "2.11.2"

RPM_NAME = "ocaml-qtest-devel-2.11.2-1.12.aarch64.rpm"
RPM_HASH = "1f90f5642f11b7a4e5615963ac8c4ad14c406f219b2573317959b8f7d302330053d6a392e1bd642d7bc916231fd39edbb1c44518956e3170420fed1ec97759ec"

RPROVIDES:${PN} += "ocaml(Qtestlib) ocaml-qtest-devel ocaml-qtest-devel(aarch-64) ocamlfind(qtest) ocamlfind(qtest.lib) ocamlx(Qtestlib)"
RDEPENDS:${PN} += "ocaml-qtest"

inherit rpm
