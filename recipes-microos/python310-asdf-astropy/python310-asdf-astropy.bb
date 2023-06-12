SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-asdf-astropy-0.4.0-1.1.noarch.rpm"
RPM_HASH = "e3708d2cf4c4011749d702305187e6a61dba582e782fe2f374578a1190a5bb8ac48c592877b78f8a4ac5ebc9b2f2652c00e2b298381d972deeb86551dab061e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-astropy python3.10dist(asdf-astropy) python310-asdf-astropy python3dist(asdf-astropy)"
RDEPENDS:${PN} += "python(abi) python310-asdf python310-asdf-coordinates-schemas python310-asdf-transform-schemas python310-astropy python310-numpy python310-packaging"

inherit rpm
