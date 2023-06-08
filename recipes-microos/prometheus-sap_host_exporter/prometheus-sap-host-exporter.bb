SUMMARY = "Prometheus exporter for SAP systems (a.k.a. NetWeaver)"
DESCRIPTION = "Prometheus exporter for Pacemaker HA clusters metrics"
LICENSE = "Apache-2.0"

PV = "0.5.1+git.1593777035.a5d05f8"

RPM_NAME = "prometheus-sap_host_exporter-0.5.1+git.1593777035.a5d05f8-1.10.aarch64.rpm"
RPM_HASH = "7d8b0d97241ef88f782438f7ac203cd532a1fd746b3fa928d94b79d4c95ea7e053f6cbf6a24a8543bb4ab3dd8bbe673db1667bc48e1c0f2136bd210ddf53b70f"

RPROVIDES:${PN} += "config(prometheus-sap_host_exporter) prometheus(sap_host_exporter) prometheus-sap_host_exporter prometheus-sap_host_exporter(aarch-64) prometheus-sap_host_exporter-devel prometheus-sap_host_exporter-devel-static sap_host_exporter"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
