SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.26.1"

RPM_NAME = "python39-starlette-0.26.1-1.3.noarch.rpm"
RPM_HASH = "c868d317bc25280e64a7529ceb6075af697e7ab6828a33f4bfe9442264ca085dd6ab857e64b8a588278cf9b97dc76a0217235907e19eabc4b30d8d993e21a07f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(starlette) python39-starlette python3dist(starlette)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 3.10.0 if python39-base < 3.10) python(abi) python39-anyio"

inherit rpm
