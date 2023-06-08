SUMMARY = "A memory-based, optional-persistence naïve bayesian text classifier"
DESCRIPTION = "A memory-based, optional-persistence naïve bayesian text classifier \
heavily inspired by the python 'redisbayes' module."
LICENSE = "MIT"

PV = "1.5.8"

RPM_NAME = "python310-simplebayes-1.5.8-2.32.noarch.rpm"
RPM_HASH = "f2d6c780bd8e653e5d3ff2c24127fed656ae89df844ce6eb01a360098da060e16081515e5cf4eda077c70cdc4235d97347245822d919eb575a4177791baa8a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-simplebayes python3.10dist(simplebayes) python310-simplebayes python3dist(simplebayes)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
