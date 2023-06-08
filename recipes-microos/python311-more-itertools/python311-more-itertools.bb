SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python311-more-itertools-9.1.0-2.1.noarch.rpm"
RPM_HASH = "757604d17c0b7fbe92a39cdc20d0d6cc058aefa3feef0816972a3bb338f8a5a0d4c68c0c30ab7e17a83f5fdbc93ec8ce3e124cbf6a1f310293a03a8d2d0a3ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(more-itertools) python311-more-itertools python3dist(more-itertools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
