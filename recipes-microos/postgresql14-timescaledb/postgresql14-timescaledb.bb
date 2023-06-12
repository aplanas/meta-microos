SUMMARY = "A time-series database extension for PostgreSQL"
DESCRIPTION = "TimescaleDB is a database for making SQL more scalable for \
time-series data. It is engineered up from PostgreSQL, providing \
automatic partitioning across time and space (partitioning key), as \
well as full SQL support. \
 \
TimescaleDB is packaged as a PostgreSQL extension. \
 \
This build includes only Apache2 modules; \
TSL (timescale licenced modules are not built)."
LICENSE = "Apache-2.0"

PV = "2.10.2"

RPM_NAME = "postgresql14-timescaledb-2.10.2-1.2.aarch64.rpm"
RPM_HASH = "9aca00bef7e9acdb680186b534c96eabf8d5bd1699c926ea31598d60fcfb0e2b13b3adbefc5141aaccf3736a79ac6aa81cf60d8fcbabc9bc1f60a6cd0d91c2cb"

RPROVIDES:${PN} += "postgresql14-timescaledb postgresql14-timescaledb(aarch-64) postgresql14-timescaledb-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) postgresql14-server"

inherit rpm
