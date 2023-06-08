SUMMARY = "Prometheus exporter for machine metrics"
DESCRIPTION = "Prometheus exporter for hardware and OS metrics exposed by *NIX kernels, written in Go with pluggable metric collectors."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "golang-github-prometheus-node_exporter-1.5.0-4.1.aarch64.rpm"
RPM_HASH = "8186450130b0f259ebf4c76dbe556f2a0c298f56cdbd9b6af91c158a7dbd3879fae278fb347858ff4d64bdddc6cd700b91424ff8906ac89386bdc91a09ab6231"

RPROVIDES:${PN} += "golang-github-prometheus-node_exporter golang-github-prometheus-node_exporter(aarch-64) node_exporter prometheus(node_exporter)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup shadow"

inherit rpm
