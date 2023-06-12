SUMMARY = "Promtail Client"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Promtail client."
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "promtail-2.8.0+git.1680557182.90888a0c-1.2.aarch64.rpm"
RPM_HASH = "f2302fae2fc7df603a58bf4277532c88e0232880cb4caf157e3df878c63fab5870d7958b5ee84485946ee6e7b827d7a90c519cd27901a0350e787d605d68a75d"

RPROVIDES:${PN} += "config(promtail) promtail promtail(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
