SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python310-igwn-auth-utils-0.4.0-1.2.noarch.rpm"
RPM_HASH = "a3a9ac661b46b22bae1c3c51650695aa3493a87bb9bdd23a94e5522764e60778f9ae3ea533d11207f0722dd0a48a5b1a64a78fcdcd12caa7c7beec8a6ac5ef4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-igwn-auth-utils python3-igwn-auth-utils-requests python3.10dist(igwn-auth-utils) python310-igwn-auth-utils python310-igwn-auth-utils-requests python3dist(igwn-auth-utils)"
RDEPENDS:${PN} += "python(abi) python310-cryptography python310-requests python310-safe-netrc python310-scitokens"

inherit rpm
