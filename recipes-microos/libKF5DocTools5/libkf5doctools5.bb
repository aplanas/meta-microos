SUMMARY = "Library to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.105.0"

RPM_NAME = "libKF5DocTools5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "067732d2ea341b43e8686eaffd33e852718d9fc4037750f219a79c07a1f9be754bdca702a5a36fe4b8b437af754f99ad53b485b10fa5a785b6ec6326d6dfeacd"

RPROVIDES:${PN} += "libKF5DocTools.so.5()(64bit) libKF5DocTools5 libKF5DocTools5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit)"

inherit rpm
