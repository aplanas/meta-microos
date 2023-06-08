SUMMARY = "Utilities for graphical user interfaces: Build Environment"
DESCRIPTION = "The KDE GUI addons provide utilities for graphical user interfaces in the areas \
of colors, fonts, text, images, keyboard input. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kguiaddons-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "362dc156156fcf00c3a3518f703b6463583baa9f32833361d0269ca4b0bc5981f2234ad59819a912b8f3fb5f1a7bc5889104685f9563aecbe352307cd6f1a65d"

RPROVIDES:${PN} += "cmake(KF5GuiAddons) kguiaddons-devel kguiaddons-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Gui) extra-cmake-modules libKF5GuiAddons5"

inherit rpm
