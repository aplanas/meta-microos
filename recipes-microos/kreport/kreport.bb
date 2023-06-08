SUMMARY = "Framework for creation and generation of reports"
DESCRIPTION = "A framework for creation and generation of reports in multiple formats"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kreport-3.2.0-4.11.aarch64.rpm"
RPM_HASH = "c21eb6793344ab2e2e3b2777f499b57dca6ef691fd6afa3acab6df88c6354575cd2f8f9a1c4243565f875280c5873de326f336d61e0bdc75c9015b7f29940e98"

RPROVIDES:${PN} += "kreport kreport(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKPropertyCore3.so.4()(64bit) libKReport3.so.4()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmarblewidget-qt5.so.28()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
