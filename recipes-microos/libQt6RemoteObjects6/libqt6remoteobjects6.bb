SUMMARY = "Qt 6 RemoteObjects library"
DESCRIPTION = "The Qt 6 RemoteObjects library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6RemoteObjects6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9092ab6d99dc202abcdc79e2ffc9a0a2dc94fdd5881db0d01a8b6dfb77e35d8ed598fb22d89bcf13ded9b8fc29eeaf5286b81493f3f56f2c6e6c5ee51a8a0205"

RPROVIDES:${PN} += "libQt6RemoteObjects.so.6()(64bit) \
libQt6RemoteObjects.so.6(Qt_6)(64bit) \
libQt6RemoteObjects.so.6(Qt_6.0)(64bit) \
libQt6RemoteObjects.so.6(Qt_6.1)(64bit) \
libQt6RemoteObjects.so.6(Qt_6.2)(64bit) \
libQt6RemoteObjects.so.6(Qt_6.3)(64bit) \
libQt6RemoteObjects.so.6(Qt_6.4)(64bit) \
libQt6RemoteObjects.so.6(Qt_6.5)(64bit) \
libQt6RemoteObjects.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6RemoteObjects6 \
libQt6RemoteObjects6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
