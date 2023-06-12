SUMMARY = "Pure python logging handler for writing logs to the journald using native protocol"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python311-logging-journald-0.6.5-1.1.noarch.rpm"
RPM_HASH = "9d1b34a31fe056ea449fe590d668d3538957548499f4cbfaf6afff1050c8df0a0fdae9bafe239e1a4104c6a100f295628d8c8220c347c0724aa2df7799ab3aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(logging-journald) \
python311-logging-journald \
python3dist(logging-journald)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
