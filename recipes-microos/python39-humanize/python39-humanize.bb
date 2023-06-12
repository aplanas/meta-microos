SUMMARY = "Python humanize utilities"
DESCRIPTION = "This modest package contains various common humanization utilities, like turning \
a number into a fuzzy human readable duration ('3 minutes ago') or into a human \
readable size or throughput."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-humanize-4.4.0-1.3.noarch.rpm"
RPM_HASH = "8a8e40fb57ec32c1f514b9e198352b3f8dbca3c898f11040ac0d1f52a0d7e90033b31ab77c64b97a23fcd746c47472b3033bcdde1e5b7cdcdeff82913393073b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(humanize) \
python39-humanize \
python3dist(humanize)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
