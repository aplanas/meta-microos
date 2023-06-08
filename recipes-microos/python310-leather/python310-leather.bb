SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-leather-0.3.4-1.6.noarch.rpm"
RPM_HASH = "e26c1b0239eadcf236290085248e60a2e78a92d2f83d85940f1d5d7d03a7087f163a02519610a10351bcdae61fb84a6a31af0a8f8c53b95fbdec04aa16ef6d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-leather python3.10dist(leather) python310-leather python3dist(leather)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
