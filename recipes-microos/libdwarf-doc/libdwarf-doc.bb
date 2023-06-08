SUMMARY = "Documentation for libdwarf"
DESCRIPTION = "Documentation for libdwarf."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "libdwarf-doc-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "413290bd52d8072951af3a1b893ea8726aa1ceef25430776d79a6fa591734af4fb8e949df5504351d5dcbd333e83bf4466c3d53d4d2abc955f04501c1ca6b2ab"

RPROVIDES:${PN} += "libdwarf-doc libdwarf-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
