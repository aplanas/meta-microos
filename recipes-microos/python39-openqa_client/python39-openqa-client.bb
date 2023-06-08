SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python39-openqa_client-4.2.1-1.3.noarch.rpm"
RPM_HASH = "dd7cf772307a1344c0dc444f53b3fc4ee58f18e37cf7b251843dcf308ae8f3679496b45bc693cf9d035f5b5219d29f59b8bf1ff40fac3ac04bfb7cfcf95d039a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(openqa-client) python39-openqa_client python3dist(openqa-client)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-requests python39-typing_extensions"

inherit rpm
