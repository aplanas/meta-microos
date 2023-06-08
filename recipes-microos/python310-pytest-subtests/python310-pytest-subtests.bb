SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-pytest-subtests-0.10.0-2.1.noarch.rpm"
RPM_HASH = "ce6108986ee358aa21d060ae088b635af0ba92d55fd653afe3198b40454b2124a677499572297a20bdd639405208d90c2eda2935bff01d217b434f91615d323b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-subtests python3.10dist(pytest-subtests) python310-pytest-subtests python3dist(pytest-subtests)"
RDEPENDS:${PN} += "python(abi) python310-pytest"

inherit rpm
