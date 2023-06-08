SUMMARY = "Timestamp input"
DESCRIPTION = "tj adds a timestamp to the beginning of each line of input. \
It supports several time-formats and can also colorize the output. \
Users could also define custom output formats via templates."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "tj-7.0.0-2.9.aarch64.rpm"
RPM_HASH = "25f4c41484640a1afbb41484ae64e189cf2c28fcc2e7cae4502ee10846ec230461f874241808d9ca4169c476ef850b318a3c57f93ad8b28cdbd5284074ada342"

RPROVIDES:${PN} += "golang(github.com/sgreben/tj/cmd/tj) golang(github.com/sgreben/tj/pkg/color) tj tj(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
