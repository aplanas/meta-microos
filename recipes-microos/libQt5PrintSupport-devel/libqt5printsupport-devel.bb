SUMMARY = "Development files for the Qt5 print support library"
DESCRIPTION = "Development files for the Qt5 print support library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5PrintSupport-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "b45d2388ca375ecb073d58e33ccb36c449f8d35fd9d3044eab96534c4aebadaa96892bf1a03bb7244f46d55dc7eca6748521c50fdf763d4c34bcd5c71960f105"

RPROVIDES:${PN} += "cmake(Qt5PrintSupport) libQt5PrintSupport-devel libQt5PrintSupport-devel(aarch-64) pkgconfig(Qt5PrintSupport)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Gui-devel libQt5PrintSupport5 libQt5Widgets-devel pkgconfig(Qt5Core) pkgconfig(Qt5Gui) pkgconfig(Qt5Widgets)"

inherit rpm
