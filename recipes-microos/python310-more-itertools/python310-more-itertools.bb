SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python310-more-itertools-9.1.0-2.1.noarch.rpm"
RPM_HASH = "a0a75f9cb5183135c2cd2245b0623405fc159548d2feae483706b6f2e002897e35ad5cdeb5b90d4b2b4d77ea5ff2bb4037e2cd21b886a41fb75cc1f4ced504c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-more-itertools \
python3.10dist(more-itertools) \
python310-more-itertools \
python3dist(more-itertools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
