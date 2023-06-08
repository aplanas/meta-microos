SUMMARY = "Python pytest plugin for aiohttp support"
DESCRIPTION = "A library that provides fixtures for creation test aiohttp server and client."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "python39-pytest-aiohttp-1.0.4-3.3.noarch.rpm"
RPM_HASH = "19cd3d1bb24948005a2bc37236fe0c47a53f955ebbbc1d6236ecb9b47d1a5b0ace95329548fb32f9d7133ca161fc04736fd65576d3a7bb1e67b96fd3e9576cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-aiohttp) python39-pytest-aiohttp python3dist(pytest-aiohttp)"
RDEPENDS:${PN} += "python(abi) python39-aiohttp python39-pytest python39-pytest-asyncio"

inherit rpm
