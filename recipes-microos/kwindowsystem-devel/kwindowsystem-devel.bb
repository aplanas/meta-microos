SUMMARY = "KDE Access to window manager: Build Environment"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kwindowsystem-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "919a955e7e5bc9c19874f8c715ee77f07d6bdf4fb92c0006d4aecac15e5382270f2356018620ddc167406020e1c6c5b6905fd45beb33616137a150a10aa8e66a"

RPROVIDES:${PN} += "cmake(KF5WindowSystem) kwindowsystem-devel kwindowsystem-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) cmake(Qt5Widgets) extra-cmake-modules libKF5WindowSystem5 pkgconfig(x11) pkgconfig(xcb)"

inherit rpm
