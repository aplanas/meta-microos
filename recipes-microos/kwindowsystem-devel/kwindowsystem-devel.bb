SUMMARY = "KDE Access to window manager: Build Environment"
DESCRIPTION = "Convenience access to certain properties and features of the window manager. \
 \
KWindowSystem provides information about the state of the window manager and \
allows asking the window manager to change the using a more high-level \
interface than the NETWinInfo/NETRootInfo low-level classes. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwindowsystem-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d86333ccdb78517762053d9f69200f21401f93cd79631538ee4438de630f48cb49b3475c2f2caf720b464384a9dac47469b5dffb243b198c755f52325b411f17"

RPROVIDES:${PN} += "cmake(KF5WindowSystem) \
kwindowsystem-devel \
kwindowsystem-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
cmake(Qt5Widgets) \
extra-cmake-modules \
libKF5WindowSystem5 \
pkgconfig(x11) \
pkgconfig(xcb)"

inherit rpm
