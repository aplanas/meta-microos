SUMMARY = "Qt 5 Style Plugins"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains additional style plugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.0.0+git20170311"

RPM_NAME = "libqt5-qtstyleplugins-5.0.0+git20170311-10.10.aarch64.rpm"
RPM_HASH = "e1f82d310a4aac5db4bac632a6bc4b836842cb3e2d6c0d0b052fba38e542cd333f01c7f6efc41813c3af46fb275e89ab784ee1c4203e2a0373c836b0b5c34913"

RPROVIDES:${PN} += "libbb10styleplugin.so()(64bit) libqcleanlooksstyle.so()(64bit) libqmotifstyle.so()(64bit) libqplastiquestyle.so()(64bit) libqt5-qtstyleplugins libqt5-qtstyleplugins(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
