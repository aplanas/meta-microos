SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-requests-unixsocket-0.3.0-2.1.noarch.rpm"
RPM_HASH = "13d23d465b5d42a10dbbaad9525605f168fe3b60f7f909265f0ed87594a8b3b0ee84ec25be3e898002cb79ac669d58b949c0fc0113ff2cdbaaef316a0331d849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-unixsocket \
python3.10dist(requests-unixsocket) \
python310-requests-unixsocket \
python3dist(requests-unixsocket)"
RDEPENDS:${PN} += "/usr/bin/env \
python(abi) \
python310-requests"

inherit rpm
