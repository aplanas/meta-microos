SUMMARY = "Qt 6 MultimediaQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-multimediaquick-private-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "c7c3a86457971b05fa03b87eb99af32f1c81fe9700ee8db2a8cf3a8078e0f7e0687adfb5378dbbdce49eff365fe924bb3832ee191880763f0529b5c951eb88d8"

RPROVIDES:${PN} += "cmake(Qt6MultimediaQuickPrivate) qt6-multimediaquick-private-devel qt6-multimediaquick-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick) libQt6MultimediaQuick6 qt6-multimedia-private-devel"

inherit rpm
