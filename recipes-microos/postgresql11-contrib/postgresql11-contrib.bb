SUMMARY = "Contributed Extensions and Additions to PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
The postgresql-contrib package includes extensions and additions that \
are distributed along with the PostgreSQL sources, but are not (yet) \
officially part of the PostgreSQL core. \
 \
Documentation for the modules contained in this package can be found in \
/usr/share/doc/packages/postgresql/contrib."
LICENSE = "PostgreSQL"

PV = "11.19"

RPM_NAME = "postgresql11-contrib-11.19-2.1.aarch64.rpm"
RPM_HASH = "e0e94526d0aa60922f2783981c458d0df97b5102d52621ca9bff411b9ac6a6056f3f32eae7c2518f9276ece6dfb33040ddb7637eb5506aa1a26f245bff57da32"

RPROVIDES:${PN} += "postgresql-contrib-implementation postgresql11-contrib postgresql11-contrib(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libperl.so()(64bit) libpq.so.5()(64bit) libpython3.10.so.1.0()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit) libz.so.1()(64bit) postgresql-contrib-noarch postgresql11 postgresql11-server"

inherit rpm
