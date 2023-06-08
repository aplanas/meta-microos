SUMMARY = "Framework to integrate services and actions - GUI library"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need. \
 \
This package contains the library files of the package needed to use GUI widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5PurposeWidgets5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "6ab640df2db776e31e2aa7220c7bcbd887db383f0b0f20443c94956aae130fc07b2b67ba6fb0b56c6de8a6bd57b885e3e9b65737bb926c35c8aa53879f516658"

RPROVIDES:${PN} += "libKF5PurposeWidgets.so.5()(64bit) libKF5PurposeWidgets5 libKF5PurposeWidgets5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5Purpose.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
