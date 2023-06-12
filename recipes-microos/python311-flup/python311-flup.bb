SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python311-flup-1.0.3.dev20161029-3.1.noarch.rpm"
RPM_HASH = "103a3b89f5be6318c9b40384c0e0d26face5386ba96d9ae6b88754ce91b75333ddaf5bf2a57ce4143b1c27d85e0860f4a68f661678947c84a001cc60dfa59865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flup) python311-flup python3dist(flup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
