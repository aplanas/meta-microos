SUMMARY = "Main Samba administration tool"
DESCRIPTION = "The package contains samba-tool, the main tool for Samba Administration."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-tool-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "2aa3c03c6a72aa398796b93059c78e77812febf7914bcdc230bb9f1742fb17c97706509668c06a78eb4c6dc498191f7cc68c1daffcc1e8307cc3236117b5c935"

RPROVIDES:${PN} += "samba-tool \
samba-tool(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
samba \
samba-ldb-ldap \
samba-python3"

inherit rpm
