SUMMARY = "Dzongkha localization files for LibreOffice"
DESCRIPTION = "Provides Dzongkha translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-dz-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "546abaa777b6472b869d54916a3f7a5e43d18f17c75dac6db3aa4c92ec9f45bde34432b19b212158e3113c898a2cd79f420c398b077478231380194ddc467c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dz libreoffice-l10n-dz locale(libreoffice:dz)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
