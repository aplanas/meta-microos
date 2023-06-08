SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python310-flup-1.0.3.dev20161029-2.20.noarch.rpm"
RPM_HASH = "97b8348eb33d0819b6a44b65db38e661e745a9c9987ab75f1c63567e99eda9d965bc332a2e24e477255dc78e6f85940128dcb4a21749a9be97564e5adc04d683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flup python3.10dist(flup) python310-flup python3dist(flup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
