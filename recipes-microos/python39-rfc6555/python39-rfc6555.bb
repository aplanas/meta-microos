SUMMARY = "Python implementation of the Happy Eyeballs Algorithm described in RFC 6555"
DESCRIPTION = "This module provided with a single file and dead-simple API for RFC 6555 \
'Happy Eyeballs: Success with Dual-Stack Hosts' \
<https://tools.ietf.org/html/rfc6555> to allow easy vendoring and \
integration into other projects."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-rfc6555-0.1.0-1.5.noarch.rpm"
RPM_HASH = "6561264e0a11287ac04bdf3ea10d1d6e2b33597bf8fc94a618207640671ccc52baa66d0d1a3733671a322c2ca089a1eaebff63b1827743719e4b074c69c02984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rfc6555) python39-rfc6555 python3dist(rfc6555)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
