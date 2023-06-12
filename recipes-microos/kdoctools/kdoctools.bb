SUMMARY = "Tools to create documentation from DocBook"
DESCRIPTION = "Provides tools to generate documentation in various format from DocBook files."
LICENSE = "LGPL-2.1-or-later & MIT"

PV = "5.106.0"

RPM_NAME = "kdoctools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "fc3fb022e10da57e791059a70b5ec07b49a24f25c5c702e4b53f19fab518edabb70ae6308c53a67b192f9ce560807d3950bcf6b8e8904727b7c63f8603c4ffb8"

RPROVIDES:${PN} += "kdoctools kdoctools(aarch-64)"
RDEPENDS:${PN} += "docbook-xsl-stylesheets ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexslt.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit)"

inherit rpm
