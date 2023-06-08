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

PV = "15.2"

RPM_NAME = "postgresql15-contrib-15.2-3.1.aarch64.rpm"
RPM_HASH = "30a7e2791ed208b08f8ff6df64e154a542530dcf66ce98b758573a7307c2f06eb1050ae7ee2f3b7c3b8e79a8bc83e4f61177246c01a52c125fe511038f846869"

RPROVIDES:${PN} += "postgresql-contrib-implementation postgresql15-contrib postgresql15-contrib(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libperl.so()(64bit) libpq.so.5()(64bit) libpython3.10.so.1.0()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit) libz.so.1()(64bit) postgresql-contrib-noarch postgresql15 postgresql15-server"

inherit rpm
