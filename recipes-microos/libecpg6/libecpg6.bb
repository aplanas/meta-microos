SUMMARY = "Shared Libraries Required for PostgreSQL Clients"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, user-defined types \
and functions. \
 \
This package provides the runtime library of the embedded SQL C \
preprocessor for PostgreSQL."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "libecpg6-15.2-3.1.aarch64.rpm"
RPM_HASH = "9267bb19a743f467cf13503d0f5375cb602db647bd4aa47223de91028b5d42c99f142084c7e52cff81e2b92e1dcba60bb6af727ab4fc8bae51dc569504b28f9c"

RPROVIDES:${PN} += "libecpg.so.6()(64bit) libecpg6 libecpg6(aarch-64) libecpg_compat.so.3()(64bit) libpgtypes.so.3()(64bit) postgresql-libs:/usr/lib64/libecpg.so.6"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpq.so.5()(64bit)"

inherit rpm
