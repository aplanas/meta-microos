SUMMARY = "Development files for the Qt5 XML library"
DESCRIPTION = "Development files for the Qt5 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Xml-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "1986ee0f206b67f42a9836fbb0d865f8a33073db63d34fcf5768433800939fa31e1cb929dcf916eaf1b9582b6cdaf6c583370c913957fa3e76121b0e305a2943"

RPROVIDES:${PN} += "cmake(Qt5Xml) libQt5Xml-devel libQt5Xml-devel(aarch-64) pkgconfig(Qt5Xml)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Xml5 pkgconfig(Qt5Core)"

inherit rpm
