SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "python311-jaraco.context-4.1.1-1.4.noarch.rpm"
RPM_HASH = "46ec94aa3de29224af0a3f08e8faabe25d809ffebc2d739eb10e44619381be84dcfd1a665fb674250fcc2b1e5b80056a2b3112d04457f9738731378e3e60a3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.context) python311-jaraco.context python3dist(jaraco.context)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
