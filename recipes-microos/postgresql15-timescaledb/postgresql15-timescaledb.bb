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

RPM_NAME = "postgresql15-timescaledb-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "a17c82c8fd4f53084fdf29941c64293dbf206a3ea16cb46ab41fef2df48b1f8b053615e672979be841e3705d0ed290e529b770284b4788039872aa047c89c912"

RPROVIDES:${PN} += "postgresql15-timescaledb postgresql15-timescaledb(aarch-64) postgresql15-timescaledb-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) postgresql15-server"

inherit rpm
