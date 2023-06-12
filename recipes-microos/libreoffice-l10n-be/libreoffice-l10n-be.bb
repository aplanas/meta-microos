SUMMARY = "Belarusian localization files for LibreOffice"
DESCRIPTION = "Provides Belarusian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-be-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "b58e1a50ea2b42e1aa871854762bf53e7b8de4fae3c64882429f54c88d39f6a9354e5fb4609ff4b0f267626dbb427f39bd74aee18819a9174ea6400a4dc53b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-be libreoffice-l10n-be locale(libreoffice:be)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-be_BY"

inherit rpm
