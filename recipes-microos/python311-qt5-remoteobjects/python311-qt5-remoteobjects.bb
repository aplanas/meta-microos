SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-remoteobjects-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "8aea7b4f6537e4ef00fa6e43b77a9b9a62ddcf1822b2cdd776021a5827514430515968026791ec318b7e3721d5b719c9a6d93682888986f7b3a55e9a9dc39f40"

RPROVIDES:${PN} += "python311-qt5-remoteobjects python311-qt5-remoteobjects(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5RemoteObjects.so.5()(64bit) libQt5RemoteObjects.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi) python311-qt5"

inherit rpm
