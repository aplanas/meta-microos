SUMMARY = "Python implementation of the Happy Eyeballs Algorithm described in RFC 6555"
DESCRIPTION = "This module provided with a single file and dead-simple API for RFC 6555 \
'Happy Eyeballs: Success with Dual-Stack Hosts' \
<https://tools.ietf.org/html/rfc6555> to allow easy vendoring and \
integration into other projects."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-rfc6555-0.1.0-1.5.noarch.rpm"
RPM_HASH = "5de766ddd2b5aea68f53c1838a91efe0a2fb4ee84dabdb143e7c46118004b68b113bde32139119c7ebefaee0de50d25cbc3c0d0cf59621ed8796d06a7598c49f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rfc6555 \
python3.10dist(rfc6555) \
python310-rfc6555 \
python3dist(rfc6555)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
