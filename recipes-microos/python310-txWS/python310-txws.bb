SUMMARY = "Twisted WebSockets wrapper"
DESCRIPTION = "txWS (Twisted WebSockets) is a library for \
adding WebSockets server support to Twisted applications."
LICENSE = "X11"

PV = "0.9.1"

RPM_NAME = "python310-txWS-0.9.1-3.15.noarch.rpm"
RPM_HASH = "01da5c9a4faaf86b6ca2b74cb81c46d676733cc33920fed34ec3b7f57046eb7ae4d114c4d403d5cefef753a078965eabde66ae704a37a6c6657325917cdf638f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-txWS python3.10dist(txws) python310-txWS python3dist(txws)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
