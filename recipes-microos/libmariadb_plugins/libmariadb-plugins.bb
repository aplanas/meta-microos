SUMMARY = "Plugins for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds MariaDB library plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "libmariadb_plugins-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "cb4c3f0264f4584d043c938c16d3ab3483a52777c7a0c016ac26587a345ddd753a93218ae13448574d5c1653a66183a32515291c9f8e76e24005f1a5f597dc52"

RPROVIDES:${PN} += "libmariadb_plugins libmariadb_plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit)"

inherit rpm
