SUMMARY = "KDE PIM Libraries: IMAP library"
DESCRIPTION = "KIMAP provides libraries to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kimap-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "dc6b4272d4fbfb58ec4e28d1928c19c5edc9a01720aad2a866514f839f488f558e969e9725071693bcf26d3deb94ef05a270223a1312d4567f574f70b66b6800"

RPROVIDES:${PN} += "kimap kimap(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
