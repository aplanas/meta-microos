SUMMARY = "MediaWiki API client"
DESCRIPTION = "MediaWiki API client"
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python311-mwclient-0.10.1-1.7.noarch.rpm"
RPM_HASH = "f0e16c1a297593fc6d362300227453000033a5ae9d06eb2c815a4fdc16b7357e4c131b04b41ff451200f0091df06de311a604e95deea86960efd3e6f1c7a218b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mwclient) python311-mwclient python3dist(mwclient)"
RDEPENDS:${PN} += "python(abi) python311-requests-oauthlib python311-six"

inherit rpm
