SUMMARY = "Latvian localization files for LibreOffice"
DESCRIPTION = "Provides Latvian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-lv-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "ec7c0e4c38cee5d7befb43f32303b535cc862b8f66b1a2c9797aed5f187bd67a1317fbd8ca640e35170b7409a5fe9f4ab6d3c1549f5911cec838a632a8bbc1ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lv libreoffice-l10n-lv locale(libreoffice:lv)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-lv_LV"

inherit rpm
