SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.19.0"

RPM_NAME = "python310-matrix-nio-0.19.0-1.11.noarch.rpm"
RPM_HASH = "ac20ab841c33ee7e63991f20b680680a19afbff08f7839594b6b629809badc66682fbf44743643814b64c16b9ef6cb8cafbe790aacbd98c91449bcebeb178833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-nio python3.10dist(matrix-nio) python310-matrix-nio python3dist(matrix-nio)"
RDEPENDS:${PN} += "python(abi) python310-Logbook python310-aiofiles python310-aiohttp python310-aiohttp-socks python310-future python310-h11 python310-h2 python310-jsonschema python310-pycryptodome python310-unpaddedbase64"

inherit rpm
