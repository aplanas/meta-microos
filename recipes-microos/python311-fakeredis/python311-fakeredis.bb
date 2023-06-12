SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.13.0"

RPM_NAME = "python311-fakeredis-2.13.0-1.1.noarch.rpm"
RPM_HASH = "141959df713bdbbc6f021792468126520d5476b699d69097f8688c5a8718806eb6a3f80db056b01ee24964d9a289145bafae148fa1b9e41067b333e35df07bcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fakeredis) python311-fakeredis python3dist(fakeredis)"
RDEPENDS:${PN} += "python(abi) python311-redis python311-sortedcontainers"

inherit rpm
