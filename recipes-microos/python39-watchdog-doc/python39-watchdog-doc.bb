SUMMARY = "Documentation and examples for python39-watchdog"
DESCRIPTION = "This package contains documentation and examples for python39-watchdog."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python39-watchdog-doc-3.0.0-1.2.noarch.rpm"
RPM_HASH = "d7b189adcf94d098f0076d018250ed36927f81ba3242aab435f08f66d10511d6e050e8d1dc0e73a8753e5fb1a0cd0e704fc97dc84e25987cf699c27815f22222"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-watchdog-doc"
RDEPENDS:${PN} += ""

inherit rpm
