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

PV = "13.10"

RPM_NAME = "postgresql13-contrib-13.10-2.1.aarch64.rpm"
RPM_HASH = "0624f562a0815e040edce94ee2695a36034dde55f3b2e6aa9918baa979323fd74698be45407a5c794dec82ca73e43dd14b06ff6dcc57a934e5c6e9ee0e14a833"

RPROVIDES:${PN} += "postgresql-contrib-implementation postgresql13-contrib postgresql13-contrib(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libperl.so()(64bit) libpq.so.5()(64bit) libpython3.10.so.1.0()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit) libz.so.1()(64bit) postgresql-contrib-noarch postgresql13 postgresql13-server"

inherit rpm
