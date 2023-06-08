SUMMARY = "Lightweight ASGI framework/toolkit"
DESCRIPTION = "Starlette is a lightweight ASGI framework/toolkit, which is ideal for \
building high performance asyncio services."
LICENSE = "BSD-3-Clause"

PV = "0.26.1"

RPM_NAME = "python311-starlette-0.26.1-1.3.noarch.rpm"
RPM_HASH = "00e4761bd1d2a0050f57f037accbb62fda8fdce68ca178b84ccd95da8cb241000011d79e4e18f327632318042b1b6626f1c0b91ea1fa710ef1e8278ccd622c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(starlette) python311-starlette python3dist(starlette)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 3.10.0 if python311-base < 3.10) python(abi) python311-anyio"

inherit rpm
