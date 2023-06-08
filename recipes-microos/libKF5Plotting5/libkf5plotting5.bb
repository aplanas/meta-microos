SUMMARY = "KDE Data plotting library"
DESCRIPTION = "KPlotWidget is a QWidget-derived class that provides a virtual base \
class for data plotting. The idea behind KPlotWidget is that a \
developer only has to specify information in 'data units', i.e. the \
natural units of the data being plotted. KPlotWidget automatically \
converts everything to screen pixel units."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Plotting5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "29ce4c24753993df6048dd08290d6f22f31996645542f8c0cb46cc441d155cc72df0b2bffc7e1282bffb3a57cb47a67ec1b0c79f9de72287a90ce8fbc6d836e5"

RPROVIDES:${PN} += "libKF5Plotting.so.5()(64bit) libKF5Plotting5 libKF5Plotting5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets5 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
