SUMMARY = "Zulu localization files for LibreOffice"
DESCRIPTION = "Provides Zulu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-zu-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "b1fb749944d1ef7a6ca7ae1bb587846cb0badadd2569f4204f899a5b8a28762d9495775348c5efdcc7553529ede4035109335a04a9d1c36bde59ba8de93ba907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zu libreoffice-l10n-zu locale(libreoffice:zu)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-zu_ZA"

inherit rpm
