SUMMARY = "KIO slave for stashing temporary files"
DESCRIPTION = "This KIO slave can be used to stash files in a virtual \
folder temporarily. It requires use of a KIO-compatible \
file manager, like dolphin."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "kio-stash-1.0-1.29.aarch64.rpm"
RPM_HASH = "3c4adc2e544aed0dedd8bc34f07a954d12b06e7938a762c3719b7e0b312c80362fed2e1012d1681d15524ec7001c25ce088c1bac9ef500e801036672267f6096"

RPROVIDES:${PN} += "kio-stash kio-stash(aarch-64) metainfo() metainfo(org.kde.filestash.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.33)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
