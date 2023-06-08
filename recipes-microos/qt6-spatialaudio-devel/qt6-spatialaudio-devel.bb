SUMMARY = "Qt 6 SpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-spatialaudio-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "504b8600e9331796f48b7d05916f02230b9e33c3cd2ec166c340ee3993dbdaa3bb468e3ab8c43a8477799310fded5888b91335ca9de7d07204393989d1f8f1e3"

RPROVIDES:${PN} += "cmake(Qt6SpatialAudio) pkgconfig(Qt6SpatialAudio) qt6-spatialaudio-devel qt6-spatialaudio-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) cmake(Qt6Network) libQt6SpatialAudio6 pkgconfig(Qt6Multimedia)"

inherit rpm
