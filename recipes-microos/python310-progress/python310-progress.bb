SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python310-progress-1.6-1.8.noarch.rpm"
RPM_HASH = "db2895906c19a824dc80a7e79c1666dd0d084d7312d6e3d2e9c5028e3fa4a69da749c225ebfcc32e712223b2d7b5b3cb3f8695f9a358f5dc4eba394aedba00d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progress python3.10dist(progress) python310-progress python3dist(progress)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
