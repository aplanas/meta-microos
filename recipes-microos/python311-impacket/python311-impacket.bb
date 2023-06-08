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

RPM_NAME = "python311-impacket-0.9.23-1.12.noarch.rpm"
RPM_HASH = "dc2d9a9e70cfbf80e2cc2b2ede3c8b64a66d87a00e63ef236e698c02f4532a6399d48832e586b2c84648ca871d8d69804e62ff65b22929450f980931dff555db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(impacket) python311-impacket python3dist(impacket)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Flask python311-ldap3 python311-ldapdomaindump python311-pyOpenSSL python311-pyasn1 python311-pycryptodomex python311-six"

inherit rpm
