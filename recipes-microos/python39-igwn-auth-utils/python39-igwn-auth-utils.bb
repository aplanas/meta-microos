SUMMARY = "Auth Utils for International Gravitational-Wave Observatory Network (IGWN)"
DESCRIPTION = "Python library functions to simplify using International Gravitational-Wave \
Observatory Network (IGWN) authorisation credentials. \
 \
This project is primarily aimed at discovering X.509 credentials and \
SciTokens for use with HTTP(S) requests to IGWN-operated services."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "python39-igwn-auth-utils-0.4.0-1.2.noarch.rpm"
RPM_HASH = "4c71b56a84c111d8a5205cf093c06971bcdc8b3666b4e368fba83782ba8671826172cef4bbb37cb39ebd30eb55bd8054a398e2ca55b0b45e8ddd2f34d8268907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(igwn-auth-utils) python39-igwn-auth-utils python39-igwn-auth-utils-requests python3dist(igwn-auth-utils)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-requests python39-safe-netrc python39-scitokens"

inherit rpm
