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

RPM_NAME = "python39-impacket-0.9.23-1.12.noarch.rpm"
RPM_HASH = "042e5344abc87c56291578376d26c685182923facaf778319c8cce9c155dc7acc46294b461303794efcf31332b23241829fb3c0d92613a32657185c5a00bcf7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(impacket) python39-impacket python3dist(impacket)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Flask python39-ldap3 python39-ldapdomaindump python39-pyOpenSSL python39-pyasn1 python39-pycryptodomex python39-six"

inherit rpm
