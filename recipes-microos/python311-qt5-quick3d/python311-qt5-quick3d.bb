SUMMARY = "Python bindings for QtQuick3D"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtQuick3D."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-quick3d-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "b70ee259a8924f8d2a1dc8514d338fec0c3b467368a194a36887dcb704e8c95f00b375c0ade7da7b9f5458ef0cc3598b4d914ac0ccf94878d5380e179b1b0c9b"

RPROVIDES:${PN} += "python311-qt5-quick3d python311-qt5-quick3d(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Quick3D.so.5()(64bit) libQt5Quick3D.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python311-qt5"

inherit rpm
