SUMMARY = "Prometheus exporter for ICMP echo requests"
DESCRIPTION = "This is a simple server that scrapes go-ping stats and exports them via HTTP \
for Prometheus consumption."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "golang-github-czerwonk-ping_exporter-0.4.5-3.6.aarch64.rpm"
RPM_HASH = "7bedbe4608024b8fc44e70e69344c137d0b4f90bd7cbb23cd2ef240efd339f469c79b4684fc9e2f7b9c01b77aa77508938b92676383ed4627285f41378951b2d"

RPROVIDES:${PN} += "config(golang-github-czerwonk-ping_exporter) golang-github-czerwonk-ping_exporter golang-github-czerwonk-ping_exporter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
