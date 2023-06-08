SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python310-mss-7.0.1-1.4.noarch.rpm"
RPM_HASH = "fd622ce4cf8d3eb42dfbdb009fd775462e2d4fa9cb2773ec3385a15a6fd18eb1f23b465a3e7ca86b7ac4c671a929487c95ed1d2816f621ad2fd0d95797e8d951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mss python3.10dist(mss) python310-mss python3dist(mss)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives xrandr"

inherit rpm
