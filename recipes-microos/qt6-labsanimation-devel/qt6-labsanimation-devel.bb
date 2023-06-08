SUMMARY = "Qt 6 LabsAnimation library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsAnimation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labsanimation-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "274138184db605893d3a60c7fb14f9f797d153671fd9f7d212c86117dceb60e4634bac710a2c7e06604e313bc8cd01b96fe63af9cf74f8978a374b600d9f0d55"

RPROVIDES:${PN} += "cmake(Qt6LabsAnimation) pkgconfig(Qt6LabsAnimation) qt6-labsanimation-devel qt6-labsanimation-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt6LabsAnimation6 pkgconfig(Qt6Qml) pkgconfig(Qt6Quick) qt6-qml-private-devel qt6-quick-private-devel"

inherit rpm
