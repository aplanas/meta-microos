SUMMARY = "Build environment for the KDE data plotting library"
DESCRIPTION = "Development files for KPlotWidget, which is a QWidget-derived class \
that provides a virtual base class for data plotting."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kplotting-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "dd1cff28bd104e14086a8e4d921665716bf068637d43d79e6ee4975b35c3f5581475626113bfe2087ceb127798029d9aa884786cd8743d6c20a78c7c7b030d4d"

RPROVIDES:${PN} += "cmake(KF5Plotting) kplotting-devel kplotting-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Plotting.so.5()(64bit) libKF5Plotting5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
