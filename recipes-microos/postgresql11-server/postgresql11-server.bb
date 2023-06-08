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

PV = "11.19"

RPM_NAME = "postgresql11-server-11.19-2.1.aarch64.rpm"
RPM_HASH = "9b90760afd71f033f5c90807a9e697073bf549ac52b8a8b7875c4e1b0e0dedc2e1f0ab1a4dd536640ff8301e99bfc80e09e9a7115c17b2928cf1747b8eed6902"

RPROVIDES:${PN} += "libpqwalreceiver.so()(64bit) postgresql-server-implementation postgresql11-server postgresql11-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh glibc-locale ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpq.so.5()(64bit) libpq5 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) postgresql postgresql-noarch postgresql-server-noarch timezone"

inherit rpm
