SUMMARY = "Documentation for ProFTPD"
DESCRIPTION = "Here are Documentation for ProFTPD"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7f"

RPM_NAME = "proftpd-doc-1.3.7f-1.3.aarch64.rpm"
RPM_HASH = "f6ea2143d34fe4a22230d1c3a6fe680a01cde670aa608c63466f1a1f956d0f2ca85a9a4fa18f853502f7a7afd0d3aa5adc8a2b211b0c17c9307ca85a7b3f5ed7"

RPROVIDES:${PN} += "proftpd-doc proftpd-doc(aarch-64)"
RDEPENDS:${PN} += "proftpd"

inherit rpm
