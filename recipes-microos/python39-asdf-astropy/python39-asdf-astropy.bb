SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python39-asdf-astropy-0.3.0-1.3.noarch.rpm"
RPM_HASH = "c9fbbea2b136ee31a1954d00827d13288b7ca570e6604d5585fbd2ad09b69da5cb93b8208cf4085d0cf94f2756861b31c14d74e10f9ff11cdb08ea9b49ef7b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf-astropy) python39-asdf-astropy python3dist(asdf-astropy)"
RDEPENDS:${PN} += "python(abi) python39-asdf python39-asdf-coordinates-schemas python39-asdf-transform-schemas python39-astropy python39-numpy python39-packaging"

inherit rpm
