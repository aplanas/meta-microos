SUMMARY = "Development files for the Qt 6 Network library"
DESCRIPTION = "Development files for the Qt 6 Network library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-network-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "5994c5a525d08b9fe36d1096175f193067f5f940c2d8a5de38885aaca6c4acae17e3f1914edeeff1b5feae692bc27d9759794bec89cc56bc2f270d787d5524c1"

RPROVIDES:${PN} += "cmake(Qt6Network) pkgconfig(Qt6Network) qt6-network-devel qt6-network-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Network6 pkgconfig(Qt6Core)"

inherit rpm
