SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python311-anyio-3.6.2-4.1.noarch.rpm"
RPM_HASH = "b4aa096d79fe4519e8b5e7bd8ad8bb69fa765654953d8f16135cd8e720a99074b13cd4fab3549c929696cde2712e2c1e2a1102b2f1b37c1e17de2534d504e116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(anyio) python311-anyio python3dist(anyio)"
RDEPENDS:${PN} += "python(abi) python311-idna python311-sniffio"

inherit rpm
