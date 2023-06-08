SUMMARY = "Linux Studio Plugins Documentation"
DESCRIPTION = "Documentation for Linux Studio Plugins Project"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "lsp-plugins-doc-1.2.6-2.1.noarch.rpm"
RPM_HASH = "5a743b911c4b70e01bae10139b8c678bf0f03639d22f9159e12387409221e16b79f3739728fd580dcad9247b9bea6e7222804a72df7f8574a24652800b2ab8b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsp-plugins-doc"
RDEPENDS:${PN} += ""

inherit rpm
