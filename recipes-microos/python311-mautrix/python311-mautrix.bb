SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.17.8"

RPM_NAME = "python311-mautrix-0.17.8-1.5.noarch.rpm"
RPM_HASH = "92c8646893e139bde45b50c0ab4e3373c40be76017bba38122907ed8c2ffbef279f56cd20e9fc1d1e03e1a3ea259ace2456511491dfde61c92d9ce9c9ba1d309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mautrix) python311-mautrix python3dist(mautrix)"
RDEPENDS:${PN} += "python(abi) python311-aiohttp python311-attrs python311-yarl"

inherit rpm
