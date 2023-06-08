SUMMARY = "Python3 module to easily build and dissect network protocols"
DESCRIPTION = "Impacket is a collection of Python classes for working with network \
protocols. Impacket is focused on providing low-level \
programmatic access to the packets and for some protocols (e.g. \
SMB1-3 and MSRPC) the protocol implementation itself. \
Packets can be constructed from scratch, as well as parsed from \
raw data, and the object oriented API makes it simple to work with \
deep hierarchies of protocols. The library provides a set of tools \
as examples of what can be done within the context of this library."
LICENSE = "Apache-1.1"

PV = "0.9.23"

RPM_NAME = "python310-impacket-0.9.23-1.12.noarch.rpm"
RPM_HASH = "767287a0cd91b0598fb42370c418d4954157486dc3aeb988a80c5b95ff829c18d81b7cd59bc2be676424bbcc7c092d2712de17fb779fa39903fbe0b839867b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-impacket python3.10dist(impacket) python310-impacket python3dist(impacket)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Flask python310-ldap3 python310-ldapdomaindump python310-pyOpenSSL python310-pyasn1 python310-pycryptodomex python310-six"

inherit rpm
