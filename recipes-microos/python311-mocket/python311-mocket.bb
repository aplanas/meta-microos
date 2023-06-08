SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.0"

RPM_NAME = "python311-mocket-3.11.0-1.2.noarch.rpm"
RPM_HASH = "57b47d451d19ebc200c1e73d48a1784b58499de8b027fb6292ac63a27e3f308f21aeb0954b8361e1c7f8748a416aaacc283eab2809bec5d62ece826cc0c98e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mocket) python311-mocket python3dist(mocket)"
RDEPENDS:${PN} += "python(abi) python311-decorator python311-http-parser python311-httptools python311-python-magic python311-urllib3"

inherit rpm
