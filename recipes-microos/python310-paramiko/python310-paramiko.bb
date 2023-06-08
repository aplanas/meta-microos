SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "python310-paramiko-2.12.0-2.1.noarch.rpm"
RPM_HASH = "09ae35672b84f794ad79ca6e4d3d0e04ef392760440f4d6cc8fd6744d2ad14c14cbf4d3eb64932a58594a3db53b1c046fdb12f2bd2b1d0fcfe999624f41dbb6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko python3.10dist(paramiko) python310-paramiko python3dist(paramiko)"
RDEPENDS:${PN} += "python(abi) python310-PyNaCl python310-bcrypt python310-cryptography python310-pyasn1 python310-six"

inherit rpm
