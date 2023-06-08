SUMMARY = "Jinja2 template renderer for aiohttp.web"
DESCRIPTION = "Jinja2 template renderer for aiohttp.web."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python39-aiohttp-jinja2-1.5.1-1.3.noarch.rpm"
RPM_HASH = "19e5b1a3993a88e91dffc0981671287d5da6aeee37d231b0d8a0d85d50e0f09d630df82923fed3596a6c9191674d0c33fe2a465787da409fd59c0faf14cac110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aiohttp-jinja2) python39-aiohttp-jinja2 python3dist(aiohttp-jinja2)"
RDEPENDS:${PN} += "python(abi) python39-Jinja2 python39-aiohttp"

inherit rpm
