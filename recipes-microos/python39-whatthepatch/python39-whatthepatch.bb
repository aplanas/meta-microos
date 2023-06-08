SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python39-whatthepatch-1.0.3-1.4.noarch.rpm"
RPM_HASH = "7535ec03de584ab3f7b3c2656ca179b3806e1498128a33946922ec2937387746011cfb60125a93abf5a5d65dee412f83c3681f52e016bfad657f7ee214568c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(whatthepatch) python39-whatthepatch python3dist(whatthepatch)"
RDEPENDS:${PN} += "ed patch python(abi)"

inherit rpm
