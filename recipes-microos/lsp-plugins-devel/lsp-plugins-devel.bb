SUMMARY = "Linux Studio Plugins Development files"
DESCRIPTION = " \
Development files for Linux Studio Plugins"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.6"

RPM_NAME = "lsp-plugins-devel-1.2.6-2.1.aarch64.rpm"
RPM_HASH = "4b578ebc1e1bd43c5c30b5ab842f1af946bdd34e33016f34064d7ae0d13feafaee9852219d0ad2f442a805dfbadc36dd0ef9fb7c2cd69844bc9e39724bf176c6"

RPROVIDES:${PN} += "lsp-plugins-devel lsp-plugins-devel(aarch-64) pkgconfig(lsp-r3d-glx-lib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config lsp-plugins-common"

inherit rpm
