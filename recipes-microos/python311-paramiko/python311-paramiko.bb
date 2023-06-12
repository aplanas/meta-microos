SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python311-paramiko-3.1.0-1.1.noarch.rpm"
RPM_HASH = "a4ae54fb3ab30e1e76efce4ffbf1f3af2b119446ce500dd21e2415c7dbba061751504cc7204f23f82bc7eab1922ab20fb350fec1ee6239e91c0592f504325e66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(paramiko) python311-paramiko python3dist(paramiko)"
RDEPENDS:${PN} += "python(abi) python311-PyNaCl python311-bcrypt python311-cryptography python311-pyasn1"

inherit rpm
