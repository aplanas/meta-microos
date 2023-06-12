SUMMARY = "Documentation for libdwarf"
DESCRIPTION = "Documentation for libdwarf."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "libdwarf-doc-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "1a02da2d0347befd082461760ab7e696f7ecd2c0584bfa7e5a868e1f784fbe67fef2a2f9d8d1d6e58da8c3fdd7846be517b2a78b594938198d36dfe04a1e28e0"

RPROVIDES:${PN} += "libdwarf-doc libdwarf-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
