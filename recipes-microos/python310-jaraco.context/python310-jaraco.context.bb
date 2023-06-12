SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python310-jaraco.context-4.3.0-1.1.noarch.rpm"
RPM_HASH = "ee6e256fba8d220d52854002f5413e69d2b5382ead04e935ab93c9bcc9ae9f16f57d3bd27a0619eac707192b95b40a2881f9ea0617b416edeb8288422a6e5c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.context python3.10dist(jaraco.context) python310-jaraco.context python3dist(jaraco.context)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
