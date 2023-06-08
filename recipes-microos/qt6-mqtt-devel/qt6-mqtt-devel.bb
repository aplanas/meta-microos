SUMMARY = "Qt 6 Mqtt library - Development files"
DESCRIPTION = "Development files for the Qt 6 Mqtt library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-mqtt-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "90f49f477774bc46838336d43e46ad768965a63939dc2a27703374abb9b51f4f20e839c6d34e79abeb0d153cbee04a61fa5fba33393c726fc43afd91faa05ea3"

RPROVIDES:${PN} += "cmake(Qt6Mqtt) pkgconfig(Qt6Mqtt) qt6-mqtt-devel qt6-mqtt-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) libQt6Mqtt6 pkgconfig(Qt6Core) pkgconfig(Qt6Network)"

inherit rpm
