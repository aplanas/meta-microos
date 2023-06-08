SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python310-asdf-astropy-0.3.0-1.3.noarch.rpm"
RPM_HASH = "022bde38a35b009dfd67402c3a21ef5f8de6dae1fa7933fce742094b754c8c2b08ba391c46c8d15a9535798540803c7ddfc1aaceed27b24f2111e2edef7ee2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-astropy python3.10dist(asdf-astropy) python310-asdf-astropy python3dist(asdf-astropy)"
RDEPENDS:${PN} += "python(abi) python310-asdf python310-asdf-coordinates-schemas python310-asdf-transform-schemas python310-astropy python310-numpy python310-packaging"

inherit rpm
