SUMMARY = "Python implementation of hashids"
DESCRIPTION = "Python implementation of hashids (http://www.hashids.org)."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python310-hashids-1.3.1-1.18.noarch.rpm"
RPM_HASH = "4f9a10e7d718a113da5435c51106280133728b67e5b6b3b2b99d40be6a3e28087b8721c1d8d7ebeab238436c3ec19a54b35ac95ceb7d7182362126c0314269b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hashids python3.10dist(hashids) python310-hashids python3dist(hashids)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
