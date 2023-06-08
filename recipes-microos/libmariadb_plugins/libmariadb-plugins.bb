SUMMARY = "Plugins for the MariaDB C Connector"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds MariaDB library plugins."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.4"

RPM_NAME = "libmariadb_plugins-3.3.4-1.3.aarch64.rpm"
RPM_HASH = "a85db0f4fd604a332e5d9e8dcff02db79263d9a9c2b99fe0802df6675811f272812048f674188b91f466078117337b22a2be91aaa2bd194d0f323c94fdeff268"

RPROVIDES:${PN} += "libmariadb_plugins libmariadb_plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit)"

inherit rpm
