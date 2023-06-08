SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-marathon-0.13.0-2.6.noarch.rpm"
RPM_HASH = "d2d2fbf068768136af9759efa3b2198e98272a35e9783e174f1c3d3332fcb59147314df36b5c03b5d7f24fdc5125916f6d2e3d18d6744cec060817c5ae1ba7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(marathon) python39-marathon python3dist(marathon)"
RDEPENDS:${PN} += "python(abi) python39-requests python39-requests-toolbelt"

inherit rpm
