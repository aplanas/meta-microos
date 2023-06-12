SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python310-ws4py-0.5.1-3.5.noarch.rpm"
RPM_HASH = "88a8e2b1e951a955e21491ab6958772f2ee18e21933188b435d05489d797e00754dea65d306ef4210312eb39cd77014c69fdb53c9b529f6cb644f146d00ef67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ws4py \
python3.10dist(ws4py) \
python310-ws4py \
python3dist(ws4py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
