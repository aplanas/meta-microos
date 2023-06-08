SUMMARY = "Simplified_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Simplified_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-zh_CN-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "f2bc0b036b1625ec1af0720d6bf9fefdf213b573d7ae42da844b2645620be28617f8f963f025ce1756b44a146e8d1dbf196c48c260360e34ab51fa9b72b2b832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-CN libreoffice-help-zh-Hans libreoffice-help-zh_CN libreoffice-l10n-zh-CN libreoffice-l10n-zh-Hans libreoffice-l10n-zh_CN locale(libreoffice:zh_CN)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
