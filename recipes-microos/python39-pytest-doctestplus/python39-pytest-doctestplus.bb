SUMMARY = "Pytest plugin with advanced doctest features"
DESCRIPTION = "This package contains a plugin for the pytest framework that provides \
advanced doctest support and enables the testing of reStructuredText \
('.rst') files."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-pytest-doctestplus-0.12.1-1.1.noarch.rpm"
RPM_HASH = "97596ba433fbc7cabbb149a6eeb524b1763e8ffad3c4fb0f172f2e4761c12641d07a2961aabf6d6185f772bc3d630cc8b2bf46eb80ce01bc78cd76e80fa4ffdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-doctestplus) \
python39-pytest-doctestplus \
python3dist(pytest-doctestplus)"
RDEPENDS:${PN} += "python(abi) \
python39-packaging \
python39-pytest \
python39-setuptools"

inherit rpm
