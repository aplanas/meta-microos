SUMMARY = "WebSocket client and server library for Python"
DESCRIPTION = "Python library providing an implementation of the WebSocket protocol \
defined in RFC 6455."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "python311-ws4py-0.5.1-3.5.noarch.rpm"
RPM_HASH = "3c0388af25a7f5caa90d98fb98af7ee358bd7996f1efd74d9f2a5333bd3bb35b8a7c9cb5980e854c3088eff583ed709051cc9b3748aba563e4d8d0d41b2d5afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ws4py) \
python311-ws4py \
python3dist(ws4py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
