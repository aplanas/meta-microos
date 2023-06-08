SUMMARY = "Prometheus exporter for Pacemaker HA clusters metrics"
DESCRIPTION = "Prometheus exporter for Pacemaker HA clusters metrics"
LICENSE = "Apache-2.0"

PV = "1.3.2+git.1683043996.b95b03e"

RPM_NAME = "prometheus-ha_cluster_exporter-1.3.2+git.1683043996.b95b03e-1.1.aarch64.rpm"
RPM_HASH = "8526434f3958141ee95f0ad7eb5cf9928b915a8c521c000d2b1384eb923027f4b66bdbb259abf61830743cd389c7861315a6e1fcd0a1ea4346899d01508a9b52"

RPROVIDES:${PN} += "ha_cluster_exporter prometheus(ha_cluster_exporter) prometheus-ha_cluster_exporter prometheus-ha_cluster_exporter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup"

inherit rpm
