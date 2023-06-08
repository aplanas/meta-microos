SUMMARY = "High level compatibility layer for asynchronous event loop implementations"
DESCRIPTION = "Asynchronous compatibility API that allows applications and libraries written \
against it to run unmodified on asyncio, curio and trio."
LICENSE = "MIT"

PV = "3.6.2"

RPM_NAME = "python310-anyio-3.6.2-4.1.noarch.rpm"
RPM_HASH = "4dba11f8d567c4bab9cb94e023623fc3542f764af0b4b69cd6bebb3fdd63a80412b0e5fb8246155bb5e79cb830ffa6c72ee1b013777271dac59689f5902a545f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anyio python3.10dist(anyio) python310-anyio python3dist(anyio)"
RDEPENDS:${PN} += "python(abi) python310-idna python310-sniffio"

inherit rpm
