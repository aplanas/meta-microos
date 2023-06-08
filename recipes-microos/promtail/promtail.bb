SUMMARY = "Promtail Client"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Promtail client."
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "promtail-2.8.0+git.1680557182.90888a0c-1.1.aarch64.rpm"
RPM_HASH = "7fb0dcbb732f94591fe77f73245eb7de9dab81d9819ccb61ba2ac922202a25832c374743b0f44133e2003fd5aff8e4755a0f7271a01e2a9398b05329131e10ae"

RPROVIDES:${PN} += "config(promtail) promtail promtail(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
