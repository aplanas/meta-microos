SUMMARY = "Sinhalese localization files for LibreOffice"
DESCRIPTION = "Provides Sinhalese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-si-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "12e47a849011eaa7dc64a54e4d52bb9b31bbe271e3050f23263e09ae8e505705fa089d36fef62d95e413088c59124c57c779c7ab82d188d5da15b419c8e5e676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-si libreoffice-l10n-si locale(libreoffice:si)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-si_LK"

inherit rpm
