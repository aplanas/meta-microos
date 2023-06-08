SUMMARY = "Scalable datastore for metrics, events, and real-time analytics"
DESCRIPTION = "InfluxDB is an distributed time series database with no external dependencies. \
It's useful for recording metrics, events, and performing analytics."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "influxdb-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "fe9279d83589852cfd93c6491b18a2ef306d685db1fb447e69f2ad4937cb2ea9a18de4312e6c35849940d713bd630d79e47492ee4db73c2c4c813927cd5a028d"

RPROVIDES:${PN} += "config(influxdb) influxdb influxdb(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libflux.so.0.193.0()(64bit) shadow"

inherit rpm
