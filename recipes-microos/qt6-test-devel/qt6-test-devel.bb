SUMMARY = "Development files for the Qt 6 Test library"
DESCRIPTION = "Development files for the Qt 6 Test library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-test-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "c829e3318584a4c4bf6c6f3ff2474227c9065f895e6c7b56a0da7c706873a2abf6c1eb1cf7024da1ebc217ac7c9c838cf86c6cdcf0d053a760f2e2349f747072"

RPROVIDES:${PN} += "cmake(Qt6Test) pkgconfig(Qt6Test) qt6-test-devel qt6-test-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Test6 pkgconfig(Qt6Core)"

inherit rpm
