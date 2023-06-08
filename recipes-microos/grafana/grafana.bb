SUMMARY = "The open-source platform for monitoring and observability"
DESCRIPTION = "A graph and dashboard builder for visualizing time series metrics. \
 \
Grafana provides ways to create, explore, and share \
dashboards and data with teams."
LICENSE = "AGPL-3.0-only"

PV = "9.5.1"

RPM_NAME = "grafana-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "b56ae2ab17c3111d98885b87afcd033d04e180f1d4933ca75307946944bd81e1cef04a5ad43c8a0dd3d14289ab03368fc9f246dd06f27f77fd8b693123671918"

RPROVIDES:${PN} += "config(grafana) grafana grafana(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env /usr/bin/mkdir /usr/bin/touch fillup group(grafana) libc.so.6(GLIBC_2.34)(64bit) user(grafana)"

inherit rpm
