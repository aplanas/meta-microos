SUMMARY = "Twitter library for python"
DESCRIPTION = "A library for accessing the Twitter.com API. Supports OAuth, covers the entire \
API, and streaming API."
LICENSE = "MIT"

PV = "4.9.0"

RPM_NAME = "python311-tweepy-4.9.0-1.4.noarch.rpm"
RPM_HASH = "98355ee33d1998f2d9f538685b9f137cb374f7f5a927073ec1372d1b26c0043fa2ce0cb7ffe17a5ec664d22f3ccfb6b7f912202b05b13d0cbf6c9c12d7891052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tweepy) python311-tweepy python3dist(tweepy)"
RDEPENDS:${PN} += "(python3.11dist(oauthlib) < 4 with python3.11dist(oauthlib) >= 3.2) (python3.11dist(requests) < 3 with python3.11dist(requests) >= 2.27) (python3.11dist(requests-oauthlib) < 2 with python3.11dist(requests-oauthlib) >= 1.2) python(abi)"

inherit rpm
