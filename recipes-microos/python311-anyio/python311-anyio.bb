SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python311-anyio-3.6.2-5.1.noarch.rpm"
RPM_HASH = "b12fc42b9e8d9eaa70d33efe71096dd5dd24111d4f5ab23e62b7cb199933a1f931c1c06994835dc4f008d842645cee7b6fad3f90bc8e6c5537f03b7815d22471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(anyio) python311-anyio python3dist(anyio)"
RDEPENDS:${PN} += "python(abi) python311-idna python311-sniffio"

inherit rpm
