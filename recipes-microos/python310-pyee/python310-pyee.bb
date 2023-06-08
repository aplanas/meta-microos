SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "9.0.4"

RPM_NAME = "python310-pyee-9.0.4-1.3.noarch.rpm"
RPM_HASH = "f221dd417c8dc8ee09db0f8f7d8e9ae02fb022f23cdde8cf5e4f700f0a0943f42c837cc6f62097df453170b51b27f88f52cc4e287f3dec04e7f180e407d06f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyee python3.10dist(pyee) python310-pyee python3dist(pyee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
