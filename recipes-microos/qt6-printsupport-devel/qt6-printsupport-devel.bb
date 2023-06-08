SUMMARY = "Development files for the Qt 6 PrintSupport library"
DESCRIPTION = "Development files for the Qt 6 PrintSupport library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-printsupport-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "4ac0ddedaba8980fb037c9f74bb9e7e1a2d00d58ec22b92f3b3a831214fa707e0fdb6fab0bd56cfd040c5075f44f96235550215341cc40d09f865ee2cec23689"

RPROVIDES:${PN} += "cmake(Qt6PrintSupport) pkgconfig(Qt6PrintSupport) qt6-printsupport-devel qt6-printsupport-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) cmake(Qt6Gui) cmake(Qt6Widgets) libQt6PrintSupport6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Widgets)"

inherit rpm
