SUMMARY = "Python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains the extension for QtRemoteObjects."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-remoteobjects-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "4a16e83087a2f3375a38429ac85f05dea193cf90fba2f1b3103753539636daad25260012f528c8f40e4b5abb3fa607717269c4d42b7e0a115357240b4fc5209b"

RPROVIDES:${PN} += "python3-qt5-remoteobjects \
python310-qt5-remoteobjects \
python310-qt5-remoteobjects(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5RemoteObjects.so.5()(64bit) \
libQt5RemoteObjects.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi) \
python310-qt5"

inherit rpm
