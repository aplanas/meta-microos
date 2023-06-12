SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "python39-python-bidi-0.4.2-3.11.noarch.rpm"
RPM_HASH = "a0f31d45c00c76811158dd9840e13a5b6f08a9a59b6f100e7601e9c18ce912c94ca891621481d74ab97ae1b0d3052f488dfcd83b1419d499a772105f7ecaaa66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-bidi) \
python39-python-bidi \
python3dist(python-bidi)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-six \
update-alternatives"

inherit rpm
