SUMMARY = "Dutch localization files for LibreOffice"
DESCRIPTION = "Provides Dutch translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-nl-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "46f187326b5798368ba1ebfad3061b5784037685830898268d9aa4e7e5d825d63117445cf17cae2d09a8cb97c28e89e040f4a4d9e47d0d1c1be8984fb891fbeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nl libreoffice-l10n-nl locale(libreoffice:nl)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-nl_NL"

inherit rpm
