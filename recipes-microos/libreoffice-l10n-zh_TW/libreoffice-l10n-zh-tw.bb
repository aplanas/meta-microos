SUMMARY = "Traditional_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Traditional_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-zh_TW-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "054cb88101c8d279e9d820e1b29bb78ac8680ded4bf975f28fd05301c058a0a1805609206691e7276082c53e663c886c3c7a899d0ce465b88961a897f88b3e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-Hant \
libreoffice-help-zh-TW \
libreoffice-help-zh_TW \
libreoffice-l10n-zh-Hant \
libreoffice-l10n-zh-TW \
libreoffice-l10n-zh_TW \
locale(libreoffice:zh_TW)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
