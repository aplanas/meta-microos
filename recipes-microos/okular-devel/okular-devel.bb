SUMMARY = "Development files for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in various formats"
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "okular-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ac1da1f185cc1c35cad339732d2ba4d23d2fde0ca9e40e87faeb2a9ca08ccda85a9b086c96cc253e5d75f2ed597342c26c4026c28527aa3c7141c3a8e4a19619"

RPROVIDES:${PN} += "cmake(Okular5) okular-devel okular-devel(aarch-64) okular5-devel"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5CoreAddons) cmake(KF5XmlGui) cmake(Qt5Core) cmake(Qt5PrintSupport) cmake(Qt5Widgets) libQt5Core-private-headers-devel okular"

inherit rpm
