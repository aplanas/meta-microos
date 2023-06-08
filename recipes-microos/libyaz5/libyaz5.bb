SUMMARY = "Z39.50 protocol library"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "libyaz5-5.34.0-1.3.aarch64.rpm"
RPM_HASH = "fa4b41ba7a86c29486efc64e1324775f01ef34bc004d11188add8dc84ef90bc19ce1e877ca93e6c1253b2443859404dd95b3c46467ae19268d5a942c0a809a9c"

RPROVIDES:${PN} += "libyaz libyaz.so.5()(64bit) libyaz5 libyaz5(aarch-64) libyaz_icu.so.5()(64bit) libyaz_server.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexslt.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libwrap.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.1.18)(64bit)"

inherit rpm
