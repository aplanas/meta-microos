SUMMARY = "File support for asyncio"
DESCRIPTION = "aiofiles: file support for asyncio"
LICENSE = "Apache-2.0"

PV = "23.1.0"

RPM_NAME = "python310-aiofiles-23.1.0-1.2.noarch.rpm"
RPM_HASH = "317b8809148e4352eda4ff0be37f90d307d1c9fc85dc032a14092bb6699b7042c33389327cd9eb8747f86d875ef9aa7da772a34d1659f503c264cb84a0ca0270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiofiles python3.10dist(aiofiles) python310-aiofiles python3dist(aiofiles)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
