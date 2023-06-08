SUMMARY = "LogCLI tool"
DESCRIPTION = "Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. \
 \
This package contains the LogCLI command-line tool."
LICENSE = "Apache-2.0"

PV = "2.8.0+git.1680557182.90888a0c"

RPM_NAME = "logcli-2.8.0+git.1680557182.90888a0c-1.1.aarch64.rpm"
RPM_HASH = "e569b867ca02c14997bffca9402c288969f17a216a172a110e1bbf9255c70bc2875cb6af2138f7605478528b77a9e1782459635d7693780e7e6a42e08e16d016"

RPROVIDES:${PN} += "logcli logcli(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
