SUMMARY = "Loki: like Prometheus, but for logs"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the Loki server"
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "loki-2.8.0+git.1680557182.90888a0c-1.1.aarch64.rpm"
RPM_HASH = "0e5c0480d35a26ad5ae29700fd8cc9e73e69ed180bc654df6239bda782f5963ddbf4c3de8fa0904a649a2d82b23fd2799fa039e58b044cc082d63a601364db68"

RPROVIDES:${PN} += "config(loki) loki loki(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup group(loki) logcli user(loki)"

inherit rpm
