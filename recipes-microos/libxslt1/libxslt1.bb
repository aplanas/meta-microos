SUMMARY = "XSL Transformation Library"
DESCRIPTION = "This C library allows you to transform XML files into other XML files \
(or HTML, text, and more) using the standard XSLT stylesheet \
transformation mechanism. \
 \
It is based on libxml (version 2) for XML parsing, tree manipulation, \
and XPath support. It is written in plain C, making as few assumptions \
as possible and sticks closely to ANSI C/POSIX for easy embedding. \
It includes support for the EXSLT set of extension functions as well \
as some common extensions present in other XSLT engines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.37"

RPM_NAME = "libxslt1-1.1.37-1.3.aarch64.rpm"
RPM_HASH = "e6dacbf178eed087f05661d4eae96df29f3f8e6a43029b4cf780b99e95b316a06efde4e9ab05c131332b094fffa6a124d2e2776bffc53a4b632277a5dc87dd74"

RPROVIDES:${PN} += "libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.12)(64bit) libxslt.so.1(LIBXML2_1.0.13)(64bit) libxslt.so.1(LIBXML2_1.0.16)(64bit) libxslt.so.1(LIBXML2_1.0.17)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit) libxslt.so.1(LIBXML2_1.0.24)(64bit) libxslt.so.1(LIBXML2_1.0.30)(64bit) libxslt.so.1(LIBXML2_1.0.32)(64bit) libxslt.so.1(LIBXML2_1.0.33)(64bit) libxslt.so.1(LIBXML2_1.1.0)(64bit) libxslt.so.1(LIBXML2_1.1.1)(64bit) libxslt.so.1(LIBXML2_1.1.18)(64bit) libxslt.so.1(LIBXML2_1.1.2)(64bit) libxslt.so.1(LIBXML2_1.1.20)(64bit) libxslt.so.1(LIBXML2_1.1.23)(64bit) libxslt.so.1(LIBXML2_1.1.24)(64bit) libxslt.so.1(LIBXML2_1.1.25)(64bit) libxslt.so.1(LIBXML2_1.1.26)(64bit) libxslt.so.1(LIBXML2_1.1.27)(64bit) libxslt.so.1(LIBXML2_1.1.3)(64bit) libxslt.so.1(LIBXML2_1.1.30)(64bit) libxslt.so.1(LIBXML2_1.1.34)(64bit) libxslt.so.1(LIBXML2_1.1.5)(64bit) libxslt.so.1(LIBXML2_1.1.7)(64bit) libxslt.so.1(LIBXML2_1.1.9)(64bit) libxslt1 libxslt1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.4)(64bit) libxml2.so.2(LIBXML2_2.5.6)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.15)(64bit) libxml2.so.2(LIBXML2_2.6.17)(64bit) libxml2.so.2(LIBXML2_2.6.25)(64bit) libxml2.so.2(LIBXML2_2.6.27)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit)"

inherit rpm
