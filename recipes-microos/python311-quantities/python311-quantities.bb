SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python311-quantities-0.14.1-1.1.noarch.rpm"
RPM_HASH = "850334b9730e4ce69d61c6a67beffe08fc4e4a4e5ff1f58c654cadeb17364096ca4d1af5a68a4a5e16dcca3d0632c7236bf41a79320975403c657c381319b436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(quantities) python311-quantities python3dist(quantities)"
RDEPENDS:${PN} += "python(abi) python311-numpy"

inherit rpm
