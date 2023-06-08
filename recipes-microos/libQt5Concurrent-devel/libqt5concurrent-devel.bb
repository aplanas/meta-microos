SUMMARY = "Development files for the Qt5 Concurrent library"
DESCRIPTION = "Development files for the Qt5 Concurrent library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Concurrent-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "f5e6b0dfdb04019f9ba1689bf78f21c98669a745894eae882ed39567873f52383e7e6c86f00177dbfbf058d017377e95595694a6534b7614b1229c8a555f5403"

RPROVIDES:${PN} += "cmake(Qt5Concurrent) libQt5Concurrent-devel libQt5Concurrent-devel(aarch-64) pkgconfig(Qt5Concurrent)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Concurrent5 libQt5Core-devel pkgconfig(Qt5Core)"

inherit rpm
