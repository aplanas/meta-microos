SUMMARY = "Scalable datastore for metrics, events, and real-time analytics"
DESCRIPTION = "InfluxDB is an distributed time series database with no external dependencies. \
It's useful for recording metrics, events, and performing analytics."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "influxdb-1.11.0-1.2.aarch64.rpm"
RPM_HASH = "ba78ea6be7b8101626c3ae0d32110b2ed023b35ed26f4a9bc4ab02d2945985cdde6a50c206fb82d6233203c8a52d266329116f5daf3a2febb3278b89654d78c2"

RPROVIDES:${PN} += "config(influxdb) influxdb influxdb(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libflux.so.0.193.0()(64bit) shadow"

inherit rpm
