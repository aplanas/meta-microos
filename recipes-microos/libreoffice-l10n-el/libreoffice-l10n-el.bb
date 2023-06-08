SUMMARY = "Greek localization files for LibreOffice"
DESCRIPTION = "Provides Greek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-el-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "f8ce078355bd4ebe64aa1d3737e33212458d90f2dfbd29b9723b4380705134052a95500d1eacb45d2ff81a7bbe576027b9e4f88f21e40585ec68d037208ee598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-el libreoffice-l10n-el locale(libreoffice:el)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-el_GR"

inherit rpm
