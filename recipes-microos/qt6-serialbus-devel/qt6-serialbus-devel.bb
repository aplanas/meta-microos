SUMMARY = "Qt 6 SerialBus library - Development files"
DESCRIPTION = "Development files for the Qt 6 SerialBus library."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "738cc5bb5cc872a78c127df682938f70b0e179f312d07857e8be5625e99670ac9665d7a8f1bc587aa4b8998eec823977c5b6a5539ea5244d6f3b788292ddeb45"

RPROVIDES:${PN} += "cmake(Qt6SerialBus) \
pkgconfig(Qt6SerialBus) \
qt6-serialbus-devel \
qt6-serialbus-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Network) \
cmake(Qt6SerialPort) \
libQt6SerialBus6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Network) \
pkgconfig(Qt6SerialPort) \
qt6-serialbus"

inherit rpm
