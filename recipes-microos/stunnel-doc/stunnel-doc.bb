SUMMARY = "Documentation for the universal TLS Tunnel"
DESCRIPTION = "This package contains additional documentation for the stunnel program."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "stunnel-doc-5.69-2.1.noarch.rpm"
RPM_HASH = "d3f502c8a09cd2c284e2afc65373afdbd4179fce864099dfacd0b0d2c4941c260cc3279696e1e5c6d7d45147861509b83a0de69055b5f6797d090acc6aa0804b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stunnel-doc"
RDEPENDS:${PN} += "stunnel"

inherit rpm
