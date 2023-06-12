SUMMARY = "HTTP User Agent Bot Detection"
DESCRIPTION = "Library for detecting if a HTTP User Agent header is likely to be a bot."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "python310-robot-detection-0.4.0-2.8.noarch.rpm"
RPM_HASH = "7f0824d4a8af86a05a2592e02dfe863731acd875160372a20f0ae44e5baf496ba4e0c7fa5afd362e782527be8449a7181ec858e3f136e7cf0ce39c1472ecb518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-robot-detection \
python3.10dist(robot-detection) \
python310-robot-detection \
python3dist(robot-detection)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
