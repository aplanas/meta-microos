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

RPM_NAME = "postgresql12-timescaledb-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "9e8d761b4e50aa5c5a14fc9fe4b04293cbd594dd40a60122eb416beeef9b9be05ec21f8a321b9e039c207081a90480ed21f703524df991f3da28b68cfdb825ff"

RPROVIDES:${PN} += "postgresql12-timescaledb postgresql12-timescaledb(aarch-64) postgresql12-timescaledb-llvmjit"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) postgresql12-server"

inherit rpm
