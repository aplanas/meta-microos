SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python311-habanero-1.2.3-1.3.noarch.rpm"
RPM_HASH = "815ea2c2d0b22acb73675c36dca85e4309647401233d5e25da6b6e80a78ef8e30f40145eb0ed501e38474b25523e191ef1dbb86f0e6465da13d66e6e3d5d6968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(habanero) python311-habanero python3dist(habanero)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-tqdm"

inherit rpm
