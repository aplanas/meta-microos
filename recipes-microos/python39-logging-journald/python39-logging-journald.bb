SUMMARY = "Pure python logging handler for writing logs to the journald using native protocol"
DESCRIPTION = "Pure python logging handler for writing logs to the journald using native protocol"
LICENSE = "MIT"

PV = "0.6.5"

RPM_NAME = "python39-logging-journald-0.6.5-1.1.noarch.rpm"
RPM_HASH = "8dd9bed915be5190741248b0c9e84c8a0a63b0f8d3ac9cad93251dbf80ad6dcf211a5c353765eedd6b894c34817bd93871ad510f2fa561bf0f4fe083c34cb72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(logging-journald) python39-logging-journald python3dist(logging-journald)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
