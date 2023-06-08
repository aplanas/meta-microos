SUMMARY = "Module to get MAC addresses of remote hosts and local interfaces"
DESCRIPTION = "A Python module to get MAC addresses of remote hosts and local interfaces."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python39-getmac-0.8.3-1.4.noarch.rpm"
RPM_HASH = "c52e18a1e0a331ab02283b721c55aceb1b024edfc24c15e05e95ae01f2be274aa3f44e6a1f6053d2332b76cc19e3fca6101e1642c7a2eb87b81c036c665b8f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(getmac) python39-getmac python3dist(getmac)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
