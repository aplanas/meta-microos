SUMMARY = "Documentation for nextcloud-desktop"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.1"

RPM_NAME = "nextcloud-desktop-doc-3.8.1-1.1.noarch.rpm"
RPM_HASH = "86bbb0dcf206e46bcc727dd8589bd480602c5a56a0453f031566fb7e24fccb051aa897056e27a750bc1b5396096cfffecdc395dfa84e7d5ef48f6ea594ccdca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-client-doc nextcloud-desktop-doc"
RDEPENDS:${PN} += ""

inherit rpm
