SUMMARY = "Utilities for Chart Studio"
DESCRIPTION = "Utilities for interfacing with plotly's Chart Studio"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-chart-studio-1.1.0-3.1.noarch.rpm"
RPM_HASH = "93ab11cb160a72843d9f1d171fe5c9d6c3d5ab35dd8d6e3bbcc1430c9ad346b8481fed4ad6d6a2a463b3a6f5b3fb664242bc09022017224b541660ca0e2c27da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-chart-studio"
RDEPENDS:${PN} += "python39-plotly python39-requests python39-retrying"

inherit rpm
