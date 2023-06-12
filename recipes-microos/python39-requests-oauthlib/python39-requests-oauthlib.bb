SUMMARY = "OAuthlib authentication support for Requests"
DESCRIPTION = "This project provides first-class OAuth library support for Requests."
LICENSE = "ISC"

PV = "1.3.1"

RPM_NAME = "python39-requests-oauthlib-1.3.1-3.1.noarch.rpm"
RPM_HASH = "2ec73438314f3585369ff7ddbce527307761c4a213192aef64062c11347ab5d049830a8197e0f46627e55c0eed7fb43fd279d2dc38c928624997397484025f9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(requests-oauthlib) \
python39-requests-oauthlib \
python3dist(requests-oauthlib)"
RDEPENDS:${PN} += "python(abi) \
python39-oauthlib \
python39-requests"

inherit rpm
