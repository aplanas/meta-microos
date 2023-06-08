SUMMARY = "Grafana Piechart panel"
DESCRIPTION = "Pie chart panel for grafana"
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "grafana-piechart-panel-1.6.1-3.2.noarch.rpm"
RPM_HASH = "8150761a40fdad1e3d5b295649aabbf9bcb2481ba2cb45e6e4e57f03e49f8caba00ea4b09dcb1fc1bf315c43a26e4840269839f4163444fa72658116576414f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grafana-piechart-panel"
RDEPENDS:${PN} += "grafana"

inherit rpm
