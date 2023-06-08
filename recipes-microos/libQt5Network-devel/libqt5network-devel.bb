SUMMARY = "Development files for the Qt5 network library"
DESCRIPTION = "Development files for the Qt5 network library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Network-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "54e8a4820d5e3d4234eaefd41f0edf391b74db62254fde3d0c8d047f501c1b372f328ae620345af01e548f83c88198eb9b5e1c4ae21dc6c89c6e90d6f529f498"

RPROVIDES:${PN} += "cmake(Qt5Network) libQt5Network-devel libQt5Network-devel(aarch-64) pkgconfig(Qt5Network)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Network5 pkgconfig(Qt5Core)"

inherit rpm
