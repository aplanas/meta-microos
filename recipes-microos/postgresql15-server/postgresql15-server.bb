SUMMARY = "The Programs Needed to Create and Run a PostgreSQL Server"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package includes the programs needed to create and run a \
PostgreSQL server, which will in turn allow you to create and maintain \
PostgreSQL databases."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "postgresql15-server-15.2-3.1.aarch64.rpm"
RPM_HASH = "e5c45f409b8d903aeede383b757a652abfb56d854f60e9b79447a8de7d77dca4d4242a27d5fca4cf052e6b95e0db9f583e25010caa41de2967d7acc37b570536"

RPROVIDES:${PN} += "libpqwalreceiver.so()(64bit) postgresql-server-implementation postgresql15-server postgresql15-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh glibc-locale ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpq.so.5()(64bit) libpq5 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) postgresql postgresql-noarch postgresql-server-noarch timezone"

inherit rpm
