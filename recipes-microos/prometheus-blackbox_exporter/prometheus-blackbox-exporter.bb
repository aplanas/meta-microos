SUMMARY = "Prometheus blackbox prober exporter"
DESCRIPTION = "Prometheus blackbox exporter allows blackbox probing of endpoints over HTTP, HTTPS, DNS, TCP and ICMP."
LICENSE = "Apache-2.0"

PV = "0.19.0"

RPM_NAME = "prometheus-blackbox_exporter-0.19.0-13.1.aarch64.rpm"
RPM_HASH = "e84d689a49fae35b9fcf89f59fa418d28ad9bcb1a253554760b97a28a5262da08f2daf89ea8dfb3c3bb234823d3aa093e1c15b102b59f7b780518643e336fd09"

RPROVIDES:${PN} += "config(prometheus-blackbox_exporter) prometheus-blackbox_exporter prometheus-blackbox_exporter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(prometheus) libc.so.6(GLIBC_2.34)(64bit) permissions user(prometheus)"

inherit rpm
