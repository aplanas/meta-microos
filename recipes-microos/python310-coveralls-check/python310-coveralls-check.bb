SUMMARY = "Coverage checking using https://coveralls.io/"
DESCRIPTION = "A helper to check https://coveralls.io for a given commit hash."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-coveralls-check-1.2.1-3.8.noarch.rpm"
RPM_HASH = "63ff55556946f5ba8902101da1332641eff495e1a9cb59dc9b852ea9dd7f50997f58a2da1d6e1a4702097bf79925d1e8197495a0021c665e0fe2fddf21c6cc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coveralls-check \
python3.10dist(coveralls-check) \
python310-coveralls-check \
python3dist(coveralls-check)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-backoff \
python310-requests \
python310-setuptools \
update-alternatives"

inherit rpm
