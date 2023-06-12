SUMMARY = "Swedish localization files for LibreOffice"
DESCRIPTION = "Provides Swedish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-sv-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "67b8873448e5bdb70a5ee0b213465435007fea7678cdefa0bfe3289d38d77a91086a68299b0395b323b09af159fec9ba36f42a829c34de790b55450bb17d0e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sv libreoffice-l10n-sv locale(libreoffice:sv)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sv_SE"

inherit rpm
