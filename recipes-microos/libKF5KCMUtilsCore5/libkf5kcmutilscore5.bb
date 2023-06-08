SUMMARY = "Core library of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. This package provides the main core library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5KCMUtilsCore5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "922c1189199a7b98aa7cf182e47ad1789fe01a39a067182e5bf6ba8a3516f476c5c6da479b56eba831dbb528905ca8139cf6542101fbd611d2f995b795b39900"

RPROVIDES:${PN} += "libKF5KCMUtilsCore.so.5()(64bit) libKF5KCMUtilsCore5 libKF5KCMUtilsCore5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Service.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
