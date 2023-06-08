SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python39-mwclient-0.10.1-1.7.noarch.rpm"
RPM_HASH = "eb85a9f98d8519836db8bc1321e3b272dfe0f2666f9a804e935a6741d13b0005835ba17e75be74d09507affe8b174d4da630845323c1c82903ee8574677cc20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mwclient) python39-mwclient python3dist(mwclient)"
RDEPENDS:${PN} += "python(abi) python39-requests-oauthlib python39-six"

inherit rpm
