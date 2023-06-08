SUMMARY = "Simple software installation management software"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "packagekitqt5-devel-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "32ae86d61aa3472d69d8b613f0ee36d41290074abaaa4d712cd18e72abb9931e619691874a2deef467da1294d5b0d171ee269acef14b5d740cec934ad04c74f7"

RPROVIDES:${PN} += "PackageKit-Qt-devel PackageKit-Qt5-devel cmake(packagekitqt5) packagekitqt5-devel packagekitqt5-devel(aarch-64) pkgconfig(packagekitqt5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpackagekitqt5-1 pkgconfig(Qt5Core) pkgconfig(Qt5DBus)"

inherit rpm
