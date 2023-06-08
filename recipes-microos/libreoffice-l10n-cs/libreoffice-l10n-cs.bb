SUMMARY = "Czech localization files for LibreOffice"
DESCRIPTION = "Provides Czech translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-cs-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "81da485c2ecafa14d81f51565f7767bae62990584c8402dd22649a1dd790bca5a9300fcafa4f29abc4f43e7f80cd08779be0e92ef582a1444e9e51e1dfa3c7e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cs libreoffice-l10n-cs locale(libreoffice:cs)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-cs_CZ"

inherit rpm
