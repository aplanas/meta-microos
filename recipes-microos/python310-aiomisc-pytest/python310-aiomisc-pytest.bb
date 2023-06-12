SUMMARY = "pytest integration for aiomisc"
DESCRIPTION = "This package contains a plugin for pytest."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-aiomisc-pytest-1.1.1-1.1.noarch.rpm"
RPM_HASH = "67a5417c32eb997c4ee52fc42b08c3854e661e859c79c7fbd9f20ae2498a392bd595453c255ec402e08674fb3eb772835b23860db20bdc486d90220d737e7369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiomisc-pytest python3.10dist(aiomisc-pytest) python310-aiomisc-pytest python3dist(aiomisc-pytest)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
