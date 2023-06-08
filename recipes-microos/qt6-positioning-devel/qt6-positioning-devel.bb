SUMMARY = "Qt 6 Positioning library - Development files"
DESCRIPTION = "Development files for the Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-positioning-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8a49376364ca086a96bcc47e3e0d9eef22ca782e173751456c13bf30a12df7a0be43f4b69019402c93c39e746ff591dfa8ee9513404d7c288f547f9f86759d49"

RPROVIDES:${PN} += "cmake(Qt6Positioning) pkgconfig(Qt6Positioning) qt6-positioning-devel qt6-positioning-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Core) libQt6Positioning6 pkgconfig(Qt6Core)"

inherit rpm
