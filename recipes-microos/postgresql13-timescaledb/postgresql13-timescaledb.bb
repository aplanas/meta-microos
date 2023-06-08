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

RPM_NAME = "postgresql13-timescaledb-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "15f1929560fb2ba6a1d409c8c9caba311434c8ced1465aae05f925df6caa7875795375d21ed68714f8c5feccc76bb31d05ccafc47ebf8e2f19ce6f0706ede691"

RPROVIDES:${PN} += "postgresql13-timescaledb postgresql13-timescaledb(aarch-64) postgresql13-timescaledb-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) postgresql13-server"

inherit rpm
