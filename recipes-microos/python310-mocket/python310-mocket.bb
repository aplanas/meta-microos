SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.0"

RPM_NAME = "python310-mocket-3.11.0-1.2.noarch.rpm"
RPM_HASH = "465ea4ee5506bababdd6f9316f20937a2186df9f793ea5b8e57851d353a8365ea15ebc084ae281d24bfafa93d78d1ce5ea59858396ec712e1bb8ba5e8a156f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mocket python3.10dist(mocket) python310-mocket python3dist(mocket)"
RDEPENDS:${PN} += "python(abi) python310-decorator python310-http-parser python310-httptools python310-python-magic python310-urllib3"

inherit rpm
