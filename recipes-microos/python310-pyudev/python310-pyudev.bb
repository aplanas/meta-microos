SUMMARY = "Udev bindings for Python"
DESCRIPTION = "A Python binding to libudev, the hardware management library and service found \
in modern linux systems."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.1"

RPM_NAME = "python310-pyudev-0.24.1-1.1.noarch.rpm"
RPM_HASH = "aacf34ff43aef571a669e6f55eb11d1f49bad8d8c4781a8c8562a3235ea745b04adc3de19c31f2bb7ba7f270af490aabe327bdc0cff30521a12c4c578379cfae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyudev python3.10dist(pyudev) python310-pyudev python3dist(pyudev)"
RDEPENDS:${PN} += "libudev1 python(abi)"

inherit rpm
