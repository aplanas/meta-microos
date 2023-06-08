SUMMARY = "Swahili localization files for LibreOffice"
DESCRIPTION = "Provides Swahili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sw_TZ-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "86a38e719e1237f4189c0d23514b5e49997de1a8361c20a102e73064cc59d358023967e00b4f0b5926f0746aada2453286fd99a01e0ecdd0add0d9054a7fe9ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sw-TZ libreoffice-help-sw_TZ libreoffice-l10n-sw_TZ locale(libreoffice:sw_TZ)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-sw_TZ"

inherit rpm
