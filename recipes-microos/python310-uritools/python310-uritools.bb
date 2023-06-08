SUMMARY = "URI parsing, classification and composition"
DESCRIPTION = "URI parsing, classification and composition."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-uritools-4.0.0-1.3.noarch.rpm"
RPM_HASH = "00ceec2b52528331ca4463313fd0e8f465b5a0666e7e49e63d899d326d41e3641806821dc65bd0fc705e5dea372e7f3e84fe0d4330e4513232b55a85c853501d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uritools python3.10dist(uritools) python310-uritools python3dist(uritools)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
