SUMMARY = "A configurable sidebar-enabled Sphinx theme"
DESCRIPTION = "A configurable sidebar-enabled Sphinx theme used by aiohttp"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python310-aiohttp-theme-0.1.6-1.14.noarch.rpm"
RPM_HASH = "de84b8118db3d9a6a55c64eba2599f8f739131a74258fa790ce4589f8e4e4f98053beec53295f855c875e0cec9a5b2ccadc8bcf19cfd94d5b5f46b2ef36947d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-theme python3.10dist(aiohttp-theme) python310-aiohttp-theme python3dist(aiohttp-theme)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
