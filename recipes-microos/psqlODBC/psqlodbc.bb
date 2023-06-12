SUMMARY = "ODBC Driver for PostgreSQL"
DESCRIPTION = "This package contains the ODBC (Open DataBase Connectivity) driver and \
sample configuration files needed for applications to access a \
PostgreSQL database using ODBC."
LICENSE = "LGPL-2.1-or-later"

PV = "13.01.0000"

RPM_NAME = "psqlODBC-13.01.0000-1.10.aarch64.rpm"
RPM_HASH = "18caec3a4f755f319b5f3dc4bbd597cd41ff3e122478d70cc2d42fb98574ebfab21a519845df42666a0a732078172f950bdb3d4f3bbffa351efce66a98ae31a5"

RPROVIDES:${PN} += "pg_iface:/usr/lib/pgsql/odbcinst.ini \
pg_odbc \
postgresql-odbc \
psqlODBC \
psqlODBC(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/odbcinst \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libodbcinst.so.2()(64bit) \
libpq.so.5()(64bit)"

inherit rpm
