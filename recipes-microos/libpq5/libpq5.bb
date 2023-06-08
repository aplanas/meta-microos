SUMMARY = "Shared Libraries Required for PostgreSQL Clients"
DESCRIPTION = " \
PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, user-defined types \
and functions. \
 \
This package provides the client library that most PostgreSQL client \
program or language bindings are using."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "libpq5-15.2-3.1.aarch64.rpm"
RPM_HASH = "8aa22e98a9d197458d5285846cfc46ff2b1c61c5a6b589694792705ca2c80827705ea14017ee66a5140bdedf2728e74a67593b4a7b4decef96360c5f83e28417"

RPROVIDES:${PN} += "libpq.so.5()(64bit) libpq5 libpq5(aarch-64) postgresql-libs:/usr/lib64/libpq.so.5"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
