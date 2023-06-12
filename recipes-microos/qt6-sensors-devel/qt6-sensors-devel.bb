SUMMARY = "Qt 6 Sensors library - Development files"
DESCRIPTION = "Development files for the Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensors-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "60c2150f0a70749a436e26b32be1ee9ac414a91fa83f7adc326b24637dff421e6f6c9145ce7bd30872a79242928ea04cf1a2a3f12bc029f39b7064c3e36a9615"

RPROVIDES:${PN} += "cmake(Qt6Sensors) \
pkgconfig(Qt6Sensors) \
qt6-sensors-devel \
qt6-sensors-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
libQt6Sensors6 \
pkgconfig(Qt6Core)"

inherit rpm
