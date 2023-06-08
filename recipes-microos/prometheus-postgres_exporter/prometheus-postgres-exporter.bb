SUMMARY = "Prometheus exporter for PostgreSQL"
DESCRIPTION = "Prometheus exporter for PostgreSQL server metrics. Supported PostgreSQL versions: 9.1 and up."
LICENSE = "Apache-2.0"

PV = "0.10.1"

RPM_NAME = "prometheus-postgres_exporter-0.10.1-3.1.aarch64.rpm"
RPM_HASH = "2f59bc39f7e74f9b0caba307ac76d35bc9912cd4ce8672f538828b4d4c476746d0c3a51e153c2f566def8d4ce8d7d784c0e5e01f2d65857a48adfb1d525e08d4"

RPROVIDES:${PN} += "golang-github-wrouesnel-postgres_exporter prometheus-postgres_exporter prometheus-postgres_exporter(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(prometheus) shadow systemd user(prometheus)"

inherit rpm
