SUMMARY = "Libraries for qtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libQt5Xdg3-3.11.0-1.2.aarch64.rpm"
RPM_HASH = "eab3b2f45550a3e11271a08db239b2dd867bb6cb8815755b92c71b05b9fe1d2be4f1d7d45ebdb3dcdc27be76a31124435031a2fd289be43c5c110cafce3cd819"

RPROVIDES:${PN} += "config(libQt5Xdg3) libQt5Xdg.so.3()(64bit) libQt5Xdg3 libQt5Xdg3(aarch-64) libqtxdg"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5XdgIconLoader.so.3()(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit)"

inherit rpm
