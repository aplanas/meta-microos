SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python39-qt5-quick3d-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "f9ffa75a7dd63235d9829830093ea90d9cf571f8c73e79e063ea508219301c6bf088760f79deff4ae36ce85d99b0cb73fedc8478419317c45b5161c22ab700a7"

RPROVIDES:${PN} += "python39-qt5-quick3d python39-qt5-quick3d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Quick3D.so.5()(64bit) libQt5Quick3D.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python39-qt5"

inherit rpm
