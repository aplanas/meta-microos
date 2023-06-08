SUMMARY = "Venetian localization files for LibreOffice"
DESCRIPTION = "Provides Venetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-vec-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "eeb5e90f6c4d64437a9dc1ceea13c62197677169c3a45a9d495ae2b1bf258a83ebd04cc559a61fb389dd652f73185b78dd3da34f3c3d0c408db15561bbeffaa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vec libreoffice-l10n-vec locale(libreoffice:vec)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
