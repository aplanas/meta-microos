SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python39-agate-1.7.1-2.2.noarch.rpm"
RPM_HASH = "7cefb17bbcc08c9fbcc017b8d0d344d715a8b9c21bf5523e8890ed9fd6f4a3afe8966b458c871e5255de9560e8634b18d9280e80c26d45e0929dd093a0f74377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(agate) python39-agate python3dist(agate)"
RDEPENDS:${PN} += "python(abi) python39-Babel python39-isodate python39-leather python39-parsedatetime python39-python-slugify python39-pytimeparse"

inherit rpm
