SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "python311-paramiko-2.12.0-2.1.noarch.rpm"
RPM_HASH = "d5fbc3a71ab8cde05899e0f3069b03ef1f68e96c82c5227a0f6b4200c49e7660b50efb15528ae6b3e013e46fbfa2019da4137a5ef54f6fca4adced098f0cf101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(paramiko) python311-paramiko python3dist(paramiko)"
RDEPENDS:${PN} += "python(abi) python311-PyNaCl python311-bcrypt python311-cryptography python311-pyasn1 python311-six"

inherit rpm
