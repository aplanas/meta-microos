SUMMARY = "Paraguayan_Guaraní localization files for LibreOffice"
DESCRIPTION = "Provides Paraguayan_Guaraní translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-gug-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "88293151662618b3a75a4fa0341fa9c1165e1b653bd3d1a92790ffa77e3fc014953d1343cf6369709a0a1ae1cfff058e4b637eb0775d05d12b93bfd796cb236f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gug libreoffice-l10n-gug locale(libreoffice:gug)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-gug"

inherit rpm
