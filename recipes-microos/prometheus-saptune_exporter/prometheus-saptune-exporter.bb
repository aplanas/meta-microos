SUMMARY = "Prometheus exporter for saptune metrics"
DESCRIPTION = "Prometheus exporter for Saptune metrics"
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "prometheus-saptune_exporter-0.2-1.8.aarch64.rpm"
RPM_HASH = "9380707adfd7d75194d0a1bf33ea3186f50171933b0c6fe8de9629ca925747ce4002f75aab8be64bb29f0df744f6dd8a39ea56d86741d5deddc7f785bdedeb1a"

RPROVIDES:${PN} += "prometheus(saptune_exporter) prometheus-saptune_exporter prometheus-saptune_exporter(aarch-64) saptune_exporter"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
