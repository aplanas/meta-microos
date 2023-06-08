SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python310-expects-0.9.0-1.16.noarch.rpm"
RPM_HASH = "c02fbdb5390f50b783483f9ad6c762786e260724e8d2a673dfbc8a4ecca49b04a90538e82e0930d13309065b87b2e1fbf08bc62f1bf4921455d2aeafba28418e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-expects python3.10dist(expects) python310-expects python3dist(expects)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
