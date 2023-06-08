SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.17.8"

RPM_NAME = "python310-mautrix-0.17.8-1.5.noarch.rpm"
RPM_HASH = "ed4c29423e07fdb101940a2b65c875ae7ca32eb54fad82448b077fa730960215aec20f677dcc421de102b8a5dc290e44ef45e989ae6dfd0ea2eafef9141c2b3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mautrix python3.10dist(mautrix) python310-mautrix python3dist(mautrix)"
RDEPENDS:${PN} += "python(abi) python310-aiohttp python310-attrs python310-yarl"

inherit rpm
