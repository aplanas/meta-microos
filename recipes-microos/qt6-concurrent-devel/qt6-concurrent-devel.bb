SUMMARY = "Development files for the Qt 6 Concurrent library"
DESCRIPTION = "Development files for the Qt 6 Concurrent library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-concurrent-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "bc158b5f0f7c7a49b270be929d4917bad973135449ff450635add37912025abbc8536af6dc6ecb2c9591c242d37b81c7c025de10d3da69e59dc4f380e170abdf"

RPROVIDES:${PN} += "cmake(Qt6Concurrent) pkgconfig(Qt6Concurrent) qt6-concurrent-devel qt6-concurrent-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Concurrent6 pkgconfig(Qt6Core)"

inherit rpm
