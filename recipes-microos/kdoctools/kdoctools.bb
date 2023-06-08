SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.105.0"

RPM_NAME = "kdoctools-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "3e0253a664b2ccc738a0dddd9fd5d8698f2b5381049b8311cc73c290a2b3784e62a8087c91ba230f03008cc4c0c2bd170595ed1b1d35c7212c8a6cd01f2defa5"

RPROVIDES:${PN} += "kdoctools kdoctools(aarch-64)"
RDEPENDS:${PN} += "docbook-xsl-stylesheets ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexslt.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit)"

inherit rpm
