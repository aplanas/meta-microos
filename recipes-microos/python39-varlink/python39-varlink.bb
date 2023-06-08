SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python39-varlink-31.0.0-1.6.noarch.rpm"
RPM_HASH = "2bb28a0eec74327866f2b6a78ac1f53f4d9921498cd9f4603b0f7858090425e97f7231d3cc25abbb6496252d6f3c5f074f86da86c6b200dc80e3230e34b0e245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(varlink) python39-varlink python3dist(varlink)"
RDEPENDS:${PN} += "/usr/bin/env python(abi) python39-future"

inherit rpm
