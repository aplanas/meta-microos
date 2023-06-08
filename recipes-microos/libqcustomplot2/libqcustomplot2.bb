SUMMARY = "Qt widget for plotting and data visualization"
DESCRIPTION = "QCustomPlot is a Qt C++ widget for plotting and data visualization. \
This plotting library focuses on making good looking, publication quality 2D \
plots, graphs and charts, as well as offering high performance for realtime \
visualization applications."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "libqcustomplot2-2.1.1-2.3.aarch64.rpm"
RPM_HASH = "bb642c85abf057c44b775481e4bcb309e24dbb245012ac655a192f94da591f957bf2126232d35c489918efe94259e64725b2ef007c96379d92b2634fafc73710"

RPROVIDES:${PN} += "libqcustomplot libqcustomplot-2 libqcustomplot.so.2()(64bit) libqcustomplot2 libqcustomplot2(aarch-64) qcustomplot qcustomplot-qt5"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
