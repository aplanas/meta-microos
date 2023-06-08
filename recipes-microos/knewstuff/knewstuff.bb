SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "knewstuff-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "39703c11409cd336d067108fcf427cb9aa09d76ccdbb18bc3551cddbd3d0bc3be0fccc6788a1f6e9e87f2b33f7c92168e0bfadd79b0126d318648fd3b2495e3c"

RPROVIDES:${PN} += "application() application(org.kde.knewstuff-dialog.desktop) knewstuff knewstuff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
