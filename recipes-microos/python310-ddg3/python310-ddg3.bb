SUMMARY = "Library for querying the Duck Duck Go API"
DESCRIPTION = "A Python3 library for querying the Duck Duck Go API."
LICENSE = "BSD-3-Clause"

PV = "0.6.6git~20170824T092521~0ef6b2f"

RPM_NAME = "python310-ddg3-0.6.6git~20170824T092521~0ef6b2f-2.13.noarch.rpm"
RPM_HASH = "5c505b8cdd217b06bb7e654770edb346e123add3b380581784ffb5771039498193c6d38b66f4024617c842339ff41ff8e9efd366e8a1982be4cdfbbb7e50fa26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddg3 python3.10dist(ddg3) python310-ddg3 python3dist(ddg3)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-requests update-alternatives"

inherit rpm
