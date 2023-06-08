SUMMARY = "Qt 6 QuickTimeline library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quicktimeline-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "7f28dbc74fa99da79c87552aa0125ca852273cf8c7c53b3a1ac4b1703e3fbf34d63ec97c3aa461d1ba6d73f73c249f534e7b2bd049ba06b777ab355db3ab7fe5"

RPROVIDES:${PN} += "cmake(Qt6QuickTimeline) pkgconfig(Qt6QuickTimeline) qt6-quicktimeline-devel qt6-quicktimeline-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Qml) cmake(Qt6Quick) libQt6QuickTimeline6 pkgconfig(Qt6Core) pkgconfig(Qt6Qml) pkgconfig(Qt6Quick)"

inherit rpm
