SUMMARY = "System power status information in Python"
DESCRIPTION = "Python module that allows you to get power and battery status of the system."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-power-1.4-3.14.noarch.rpm"
RPM_HASH = "a78a603f59abf54ae5c6b01ad6b96899a0105ea5c8b88942fa595dc1377303b0e83c354d9173889c292781313ceb66e8f890a0e00373fb9f479a398a4ca50562"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(power) \
python39-power \
python3dist(power)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
