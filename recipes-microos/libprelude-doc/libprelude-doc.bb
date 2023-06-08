SUMMARY = "Libprelude documentation"
DESCRIPTION = "Libprelude documentation files."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude-doc-5.2.0-2.14.aarch64.rpm"
RPM_HASH = "75e16cbbf5dfd8eb6cca2ab1f460b2f6c8071f74b7d333b18d784fd7a3701c42f9431fe395265407d3f443ccec005fcd2d80a9443b8b94210e0651bb1022c7e8"

RPROVIDES:${PN} += "libprelude-doc libprelude-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
