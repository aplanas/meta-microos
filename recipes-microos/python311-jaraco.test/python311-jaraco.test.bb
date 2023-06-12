SUMMARY = "Testing support by jaraco"
DESCRIPTION = "Testing support by jaraco"
LICENSE = "MIT"

PV = "5.3.0"

RPM_NAME = "python311-jaraco.test-5.3.0-1.1.noarch.rpm"
RPM_HASH = "11b2a3f7782a6b24a0e3af868481c5b6d4c3be0aaaa2a5d668811f3cecf2365d6251a17150489191ebfbc1891dfb2ce7f88121522942e407620e264c8c401d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.test) \
python311-jaraco.test \
python3dist(jaraco.test)"
RDEPENDS:${PN} += "python(abi) \
python311-jaraco.context \
python311-jaraco.functools"

inherit rpm
