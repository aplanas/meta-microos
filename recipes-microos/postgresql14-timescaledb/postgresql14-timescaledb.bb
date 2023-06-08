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

RPM_NAME = "postgresql14-timescaledb-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "38ad83587a66c8aecffb695870a83935764062143f6522bdd9baf91458203640981e2b416cb04de8362c77e34857367a732edd3fda3f5d897430c6c21ac69795"

RPROVIDES:${PN} += "postgresql14-timescaledb postgresql14-timescaledb(aarch-64) postgresql14-timescaledb-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) postgresql14-server"

inherit rpm
