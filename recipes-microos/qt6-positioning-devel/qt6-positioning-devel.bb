SUMMARY = "Qt 6 Positioning library - Development files"
DESCRIPTION = "Development files for the Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "802b1ba53ea541dce6f2aef021d1cccf6ad9b38f004a0419ea43885b66f31e512950920e591ac8b11ab5a37e8f0c380f394a09fdc5e2e63358a63a5f97f26630"

RPROVIDES:${PN} += "cmake(Qt6Positioning) pkgconfig(Qt6Positioning) qt6-positioning-devel qt6-positioning-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Positioning6 pkgconfig(Qt6Core)"

inherit rpm
