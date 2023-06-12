SUMMARY = "Flake8 lint for quotes"
DESCRIPTION = "Flake8 Extension to lint for quotes."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "python39-flake8-quotes-3.3.2-1.3.noarch.rpm"
RPM_HASH = "ccdd29609beca80ea36e14eac729bb86165115fbd5f2672591eac09246ffe57ce9a1b595526e5cc08fccf28e943900bb8720e3ce56ff1fb212f3dfa88da37ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-quotes) \
python39-flake8-quotes \
python3dist(flake8-quotes)"
RDEPENDS:${PN} += "python(abi) \
python39-flake8"

inherit rpm
