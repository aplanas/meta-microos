SUMMARY = "A Tox plugin that builds and installs wheels instead of sdist"
DESCRIPTION = "A Tox plugin that builds and installs wheels instead of sdist."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "python310-tox-wheel-1.0.0-1.3.noarch.rpm"
RPM_HASH = "944dc90bab8343d40c7a75e4d45db29cfa256a945861e3357315e4420ac96deb17d1dd3de9cd14e8d613ebcfe55aff4e155c1b87794702fc3dddc9b58f85261d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tox-wheel \
python3.10dist(tox-wheel) \
python310-tox-wheel \
python3dist(tox-wheel)"
RDEPENDS:${PN} += "python(abi) \
python310-tox \
python310-wheel"

inherit rpm
