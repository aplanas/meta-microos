SUMMARY = "Development files for the Qt5 Concurrent library"
DESCRIPTION = "Development files for the Qt5 Concurrent library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Concurrent-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "46ec50dd0af51a48d7636fdbca5ac4bc335f301c6e31df6c557ae63c637d75eca7b32b5b5b590d62d8be8e1013e4122738646e16b304e6a978ae4209abaf84a7"

RPROVIDES:${PN} += "cmake(Qt5Concurrent) \
libQt5Concurrent-devel \
libQt5Concurrent-devel(aarch-64) \
pkgconfig(Qt5Concurrent)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Concurrent5 \
libQt5Core-devel \
pkgconfig(Qt5Core)"

inherit rpm
