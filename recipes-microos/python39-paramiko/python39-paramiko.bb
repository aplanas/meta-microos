SUMMARY = "SSH2 protocol library"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "python39-paramiko-2.12.0-2.1.noarch.rpm"
RPM_HASH = "6c19774b27e78609e8123e69c2d7a66a2bacfd079aa45155b96c9c3a899830aa3cbcf0453d047142f593513c214de3afa9311acaecdf0e3de4c0a066abf96475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(paramiko) python39-paramiko python3dist(paramiko)"
RDEPENDS:${PN} += "python(abi) python39-PyNaCl python39-bcrypt python39-cryptography python39-pyasn1 python39-six"

inherit rpm
