SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "1.5.8"

RPM_NAME = "python39-simplebayes-1.5.8-2.32.noarch.rpm"
RPM_HASH = "709f197332bde502cfc090fcdbe6e0af681810889edeceb919c90fe5593d56045772cac6f338c6d56e58f8a046c8264a2a39338553d314a823887d61642ea9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(simplebayes) \
python39-simplebayes \
python3dist(simplebayes)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
