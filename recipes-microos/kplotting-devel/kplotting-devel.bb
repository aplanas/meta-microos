SUMMARY = "Build environment for the KDE data plotting library"
DESCRIPTION = "Development files for KPlotWidget, which is a QWidget-derived class \
that provides a virtual base class for data plotting."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kplotting-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "daee4382879e20bd74161482dc24bcac6e543c0a4ac80d80bbb90a39f86b41c7c97f31a134326ef216f3788b17d07af266df4f9474a9f0c467849215fcc7f39d"

RPROVIDES:${PN} += "cmake(KF5Plotting) \
kplotting-devel \
kplotting-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) \
extra-cmake-modules \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Plotting.so.5()(64bit) \
libKF5Plotting5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
