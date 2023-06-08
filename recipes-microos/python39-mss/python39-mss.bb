SUMMARY = "Python multiple screenshots module"
DESCRIPTION = "An ultra fast cross-platform multiple screenshots module in pure Python using ctypes."
LICENSE = "MIT"

PV = "7.0.1"

RPM_NAME = "python39-mss-7.0.1-1.4.noarch.rpm"
RPM_HASH = "45b1ee6f47be21a96b7c1cd703e87f77bc16159f28d7e66cf71a32d54eae4ed0b09475562f2c02b42eae453c53890600f6fad94316f9100015d73de45d25d11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mss) python39-mss python3dist(mss)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives xrandr"

inherit rpm
