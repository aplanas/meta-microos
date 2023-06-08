SUMMARY = "Libraries for gsettings-qt"
DESCRIPTION = "Qt/QML bindings for GSettings. \
 \
This package is Libraries for gsettings-qt."
LICENSE = "GPL-3.0+"

PV = "0.2"

RPM_NAME = "libgsettings-qt1-0.2-1.9.aarch64.rpm"
RPM_HASH = "0b2778f0ede06ccb856096089aab01bf818f0917398848a47682a1537dfba5102873f37d6cf9aa34d9282e04aa8968933a055de16fd77979a4b253548a4448de"

RPROVIDES:${PN} += "libgsettings-qt.so.1()(64bit) libgsettings-qt1 libgsettings-qt1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
