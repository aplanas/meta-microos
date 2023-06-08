SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.26.1"

RPM_NAME = "python310-starlette-0.26.1-1.3.noarch.rpm"
RPM_HASH = "fc874b3f32973e86098db9d3361561a32af695ec3f9b7c13a17682376a15db8671a0f72abd791ae3c63242ba7147df756e1dfef9bd93c2b1f015a36703e2495a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-starlette python3.10dist(starlette) python310-starlette python3dist(starlette)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 3.10.0 if python310-base < 3.10) python(abi) python310-anyio"

inherit rpm
