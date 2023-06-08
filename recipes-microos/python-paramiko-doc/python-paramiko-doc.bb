SUMMARY = "Documentation for python-paramiko"
DESCRIPTION = "This is a library for making SSH2 connections (client or server). \
Emphasis is on using SSH2 as an alternative to SSL for making secure \
connections between python scripts.  All major ciphers and hash methods \
are supported.  SFTP client and server mode are both supported too. \
 \
This package contains the documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "2.12.0"

RPM_NAME = "python-paramiko-doc-2.12.0-2.1.noarch.rpm"
RPM_HASH = "a160e488a9853e226a1164a5ad81351a855f85c067cf7fed43dd5d508b710c0b1ced8a4f8cf091d28a831008cdb6a8fa078fe84761dd92127def1f796c92c33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-paramiko-doc python310-paramiko-doc python311-paramiko-doc python39-paramiko-doc"
RDEPENDS:${PN} += ""

inherit rpm
