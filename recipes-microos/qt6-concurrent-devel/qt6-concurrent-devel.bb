SUMMARY = "Development files for the Qt 6 Concurrent library"
DESCRIPTION = "Development files for the Qt 6 Concurrent library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-concurrent-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4df388beaf87ad7a1f18b751b7259e4f40cb912d165e46e886260384cb5037a4f6e2188b9bc4713ae16e9a928bb39759506a386ce07a9750909c6bf5085a96a7"

RPROVIDES:${PN} += "cmake(Qt6Concurrent) pkgconfig(Qt6Concurrent) qt6-concurrent-devel qt6-concurrent-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Concurrent6 pkgconfig(Qt6Core)"

inherit rpm
