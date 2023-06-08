SUMMARY = "Sindhi localization files for LibreOffice"
DESCRIPTION = "Provides Sindhi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-sd-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "c86ea8b9fad8a6fdc02ffb485f14cf13f5ae71481aae2605e85091051b2030b6f5ab529318bf95754f47907cc9741934f04f95dfb9fd7253ccfd77ebc9580e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sd libreoffice-l10n-sd locale(libreoffice:sd)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
