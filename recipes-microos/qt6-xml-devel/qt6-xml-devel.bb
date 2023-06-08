SUMMARY = "Development files for the Qt 6 XML library"
DESCRIPTION = "Development files for the Qt 6 XML library. \
 \
(The module is not actively maintained anymore. Please use the \
QXmlStreamReader and QXmlStreamWriter classes in Qt Core instead.)"
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-xml-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "c2f7ee5cfd4163b5dfeca8b550b991d74e2ae5c318b9b9e3878c557b64b915b5597a6a2522b7156cb090d4d3530c702a3155b50ba6c92c82f31f948d9c353060"

RPROVIDES:${PN} += "cmake(Qt6Xml) pkgconfig(Qt6Xml) qt6-xml-devel qt6-xml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Xml6 pkgconfig(Qt6Core)"

inherit rpm
