SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.0"

RPM_NAME = "python310-paramiko-3.1.0-1.1.noarch.rpm"
RPM_HASH = "82461f1f435571545488721a6be2dbd628f32dbd0a623fe2b5950e82b81a56dd254ca24bdb332d96f8dd7127c644e7c0b56e0b0665333396e9d33307c747e278"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko python3.10dist(paramiko) python310-paramiko python3dist(paramiko)"
RDEPENDS:${PN} += "python(abi) python310-PyNaCl python310-bcrypt python310-cryptography python310-pyasn1"

inherit rpm
