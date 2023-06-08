SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python39-anyio-3.6.2-4.1.noarch.rpm"
RPM_HASH = "4336ba8187f4566ea2eb1167ce45a9a1b61e65e87565618a01806e37dad9e6f89d19de660a7ad3f83ca811dcd5b43b32658f201ced0cf69e69ee8048184649f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(anyio) python39-anyio python3dist(anyio)"
RDEPENDS:${PN} += "python(abi) python39-idna python39-sniffio"

inherit rpm
