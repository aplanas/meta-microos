SUMMARY = "The archiver base class library"
DESCRIPTION = "The archiver base class, used by specific archive formats, is made \
available as a library in its own right so that support for other \
archive formats can be built outside the kio-extras source tree."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkioarchive5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "baa335e4554d0fc0f74e9300500f764cdc3a267e6ae4134dfd8b63d47eb70b4190a90016da3d1f71426bb9bd834fbfed301e1f02634435a930d5e42906045448"

RPROVIDES:${PN} += "libkioarchive.so.5()(64bit) libkioarchive5 libkioarchive5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.33)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit)"

inherit rpm
