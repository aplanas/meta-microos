SUMMARY = "Hebrew localization files for LibreOffice"
DESCRIPTION = "Provides Hebrew translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-he-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "7d4c635ff9aa88465920b352c3d7f84f7082eee73e061e1d12b31a899f4cd8681cdd2236ba35220cc3512295513bdebed759f79cad94d8f2e481562be1e6bfd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-he libreoffice-l10n-he locale(libreoffice:he)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-he_IL"

inherit rpm
