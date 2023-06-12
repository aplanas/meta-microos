SUMMARY = "Pytest plugin for test session metadata"
DESCRIPTION = "Pytest plugin for test session metadata."
LICENSE = "MPL-2.0"

PV = "2.0.4"

RPM_NAME = "python310-pytest-metadata-2.0.4-2.1.noarch.rpm"
RPM_HASH = "da65783cec5ce5f706591a4514ab408617ff1443dffb3df40f22ce190029c80aaea124e19b2a05c62e307965544c0525a9a5646470d5c2530b63caab4fa41a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-metadata \
python3.10dist(pytest-metadata) \
python310-pytest-metadata \
python3dist(pytest-metadata)"
RDEPENDS:${PN} += "python(abi) \
python310-pytest"

inherit rpm
