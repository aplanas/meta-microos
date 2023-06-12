SUMMARY = "Official Python API client for Discogs"
DESCRIPTION = "This is the official Discogs API client for Python. It enables you to query the \
Discogs database for information on artists, releases, labels, users, \
Marketplace listings, and more. It also supports OAuth 1.0a authorization, \
which allows you to change user data such as profile information, collections \
and wantlists, inventory, and orders."
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python39-discogs-client-2.3.0-1.3.noarch.rpm"
RPM_HASH = "125ed33e5b61c0fbbe8c35f7596449953ad3a9ab8e286c8d0e25a304502dbbff53818ad0039b087d6eb2b5b89f8c1ac7ffc34da7f38d42effcda47e524ab5e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(discogs-client) \
python39-discogs-client \
python3dist(discogs-client)"
RDEPENDS:${PN} += "python(abi) \
python39-oauthlib \
python39-requests \
python39-six"

inherit rpm
