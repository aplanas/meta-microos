SUMMARY = "Russian localization files for LibreOffice"
DESCRIPTION = "Provides Russian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ru-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "91545a79405c2608ece329b8c70b29dd1f8dfb4550c7856fa5cba8bf04f1a9b9bafe8539ab2eadff166219fc213d5d0ce8268661cb679b6feb9fa2985a03aec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ru libreoffice-l10n-ru locale(libreoffice:ru)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-ru_RU"

inherit rpm
