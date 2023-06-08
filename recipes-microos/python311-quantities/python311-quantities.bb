SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python311-quantities-0.14.0-1.5.noarch.rpm"
RPM_HASH = "aedfe2a422dfd4bdf2ecc1cf136522577cb2e6f3065f97e15a2ca27b034c5eb4fa6088fff62a35e85f8432630eef8a4e947ef3167d607b570519e0d294313b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(quantities) python311-quantities python3dist(quantities)"
RDEPENDS:${PN} += "python(abi) python311-numpy"

inherit rpm
