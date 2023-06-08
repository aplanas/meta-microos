SUMMARY = "Concurrent I/O library for Python 3"
DESCRIPTION = "Curio is a library for performing concurrent I/O with coroutines in Python 3."
LICENSE = "BSD-Source-Code"

PV = "1.6"

RPM_NAME = "python310-curio-1.6-3.1.noarch.rpm"
RPM_HASH = "27e64a76557db577794597b7f2287606db8c3220c1a55d787d8b015621011bedc3afec456af94c31652e4d8896f2cd002d84ca2a2a85cba9739aa35d8c49a9fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-curio python3.10dist(curio) python310-curio python3dist(curio)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
