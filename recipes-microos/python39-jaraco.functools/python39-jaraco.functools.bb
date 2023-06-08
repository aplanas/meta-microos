SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python39-jaraco.functools-3.6.0-2.1.noarch.rpm"
RPM_HASH = "b50ef895ff3b06f0e8fb2242f4deff3f0119789257050e7bff692e46c15718c4ba67db4517326e81782ffb1b8d3177d56426957a9a8ba8fdc6177fbd2f52aca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jaraco.functools) python39-jaraco.functools python3dist(jaraco.functools)"
RDEPENDS:${PN} += "python(abi) python39-jaraco.packaging python39-more-itertools"

inherit rpm
