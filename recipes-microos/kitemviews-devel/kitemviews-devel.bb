SUMMARY = "Set of item views extending the Qt model-view framework"
DESCRIPTION = "KItemViews includes a set of views, which can be used with item models. It \
includes views for categorizing lists and to add search filters to flat and \
hierarchical lists. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kitemviews-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "d5fd13bcf352391b3c242ba4c7d2246223fc7227e9c91fd9f348a9cbb60adc426b75aa1c0a45a6633ab34abe665d556a0725f395b69907b5742f0c90940d8d50"

RPROVIDES:${PN} += "cmake(KF5ItemViews) kitemviews-devel kitemviews-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Widgets) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ItemViews.so.5()(64bit) libKF5ItemViews5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
