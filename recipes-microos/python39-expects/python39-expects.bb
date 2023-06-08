SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python39-expects-0.9.0-1.16.noarch.rpm"
RPM_HASH = "5bbd08fdfa930f9279fc59277d476d3c180936ffe67c9c307b8f6a215dc8b0df8289994839c36a6c9f6610e8812883b21eff60d1d87e4ddc69ea017ef8ff4d5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(expects) python39-expects python3dist(expects)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
