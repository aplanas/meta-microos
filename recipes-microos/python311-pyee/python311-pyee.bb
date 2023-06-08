SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "9.0.4"

RPM_NAME = "python311-pyee-9.0.4-1.3.noarch.rpm"
RPM_HASH = "35f93579740dc1577f9264f66d09d31c75a992e127f86bdbc67a913f5d427cb3b40c8a40ac6d21873d911ef7040bdf34e77eac85781aa127db2f18a4019f736c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyee) python311-pyee python3dist(pyee)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
