SUMMARY = "Central_Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Central_Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ckb-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "01a4346821501a91431d40aa8c5ddae9f09e5478b2283abf3678625f96f60fdea841609f8e14ca8a1f0bb71a8a8c6ebe02a1aa3877a6096cedfe61ad6095f87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ckb libreoffice-l10n-ckb locale(libreoffice:ckb)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
