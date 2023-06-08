SUMMARY = "A Python 3 asyncio Matrix framework"
DESCRIPTION = "A Python 3 asyncio Matrix framework."
LICENSE = "MPL-2.0"

PV = "0.17.8"

RPM_NAME = "python39-mautrix-0.17.8-1.5.noarch.rpm"
RPM_HASH = "59a646e7403deb342858fe197ec68add09e1e9aa46759176e55a83cee5b72a1dd74656ed3d7705c01576ad85b4ebf2733a389972ae0c506bbf645e8dc096c75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mautrix) python39-mautrix python3dist(mautrix)"
RDEPENDS:${PN} += "python(abi) python39-aiohttp python39-attrs python39-yarl"

inherit rpm
