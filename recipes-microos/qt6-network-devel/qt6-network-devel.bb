SUMMARY = "Development files for the Qt 6 Network library"
DESCRIPTION = "Development files for the Qt 6 Network library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-network-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6933f90e94988873d27e8cd83d3e329620d313824b75e2876c788d691f58a562af282800fb37953ee13c96c8e961aee323673563a528f95d81fc132d69b181ae"

RPROVIDES:${PN} += "cmake(Qt6Network) \
pkgconfig(Qt6Network) \
qt6-network-devel \
qt6-network-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
libQt6Network6 \
pkgconfig(Qt6Core)"

inherit rpm
