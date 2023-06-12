SUMMARY = "Development files for the Qt5 XML library"
DESCRIPTION = "Development files for the Qt5 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Xml-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "2aade13b5772b9e9152d87043faaabf148272b825281d7deb28ce4464f2c68b4e22421d378eb017915156368d5bcc73394f0b0b5666a3fc7921c41fb4ab84616"

RPROVIDES:${PN} += "cmake(Qt5Xml) libQt5Xml-devel libQt5Xml-devel(aarch-64) pkgconfig(Qt5Xml)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Xml5 pkgconfig(Qt5Core)"

inherit rpm
