SUMMARY = "Latvian localization files for LibreOffice"
DESCRIPTION = "Provides Latvian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-lv-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "d7efcf74bb092760fe175647247cbfe2513e0063e6db14e188210e771ef02f16c14c48ab67866c4704d8f77189441887d4e3b78bcdcf9720b3e55eeb8576a600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lv libreoffice-l10n-lv locale(libreoffice:lv)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-lv_LV"

inherit rpm
