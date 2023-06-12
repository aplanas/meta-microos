SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python39-compat-patcher-core-2.1-1.3.noarch.rpm"
RPM_HASH = "8a1edb6b287b384058208aab2b19cc25015ba45a5e97d74f55cbe569ccec114f35b085bd2b086ce6900c63d0199d99e6352a2a30e6646a20801f44dd060c4554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(compat-patcher-core) \
python39-compat-patcher-core \
python3dist(compat-patcher-core)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
