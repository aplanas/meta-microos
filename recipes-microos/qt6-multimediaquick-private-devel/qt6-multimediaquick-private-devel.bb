SUMMARY = "Qt 6 MultimediaQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimediaquick-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "de046c482dab0a059a986555ce8ff45aa7081eb479e3d2bb9361c59863c3e8c866bdb431b9b9b100df5bc1e03a696267d33e0e50c862d34bae0340bd4a3737d2"

RPROVIDES:${PN} += "cmake(Qt6MultimediaQuickPrivate) qt6-multimediaquick-private-devel qt6-multimediaquick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick) libQt6MultimediaQuick6 qt6-multimedia-private-devel"

inherit rpm
