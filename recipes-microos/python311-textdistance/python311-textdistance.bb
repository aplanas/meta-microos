SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.5.0"

RPM_NAME = "python311-textdistance-4.5.0-1.3.noarch.rpm"
RPM_HASH = "7af2c461fa7a809ee7c31c250ee37bb6bbdfed354f73a9a76d62dd01fa0d8e4518efe743668fe474e7e6a4ceba7b5103b1d994c898d89ab0c275b560938d9e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(textdistance) python311-textdistance python3dist(textdistance)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
