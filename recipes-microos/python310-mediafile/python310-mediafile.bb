SUMMARY = "Handles low-level interfacing for files' tags Wraps Mutagen to"
DESCRIPTION = "Handles low-level interfacing for files' tags. Wraps Mutagen to"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python310-mediafile-0.11.0-2.1.noarch.rpm"
RPM_HASH = "23ee7562075ef78410e65b85bf1587e8fb06ca471310d682e95876a37f3afd63dfe2db9897a3110d1a6a7767f6cff267754b95eb0fe497747cf83a1908b84e48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mediafile python3.10dist(mediafile) python310-mediafile python3dist(mediafile)"
RDEPENDS:${PN} += "python(abi) python310-mutagen"

inherit rpm
