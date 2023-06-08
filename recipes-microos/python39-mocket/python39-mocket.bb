SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.0"

RPM_NAME = "python39-mocket-3.11.0-1.2.noarch.rpm"
RPM_HASH = "6a0a043e6841860c25501e891a690423df490e7c580ab17c16b614b25cf167562808ba21e3bd7b71404016091aaa401f0f56e3ccbde17514db7d797b051f70bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mocket) python39-mocket python3dist(mocket)"
RDEPENDS:${PN} += "python(abi) python39-decorator python39-http-parser python39-httptools python39-python-magic python39-urllib3"

inherit rpm
