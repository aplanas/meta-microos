SUMMARY = "Python interface for gpsd"
DESCRIPTION = "Python interface for gpsd."
LICENSE = "MIT"

PV = "0.33.3+git.20171101"

RPM_NAME = "python311-gps3-0.33.3+git.20171101-1.19.noarch.rpm"
RPM_HASH = "dde823fc69e710eba07b30752aa13afbf5118d18d0d13e6d552c741f3096a53256e8baea55020df321f38ad09ae2dee1fb8e782ad8469be05bc6763c22b5cf15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gps3) python311-gps3 python3dist(gps3)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
