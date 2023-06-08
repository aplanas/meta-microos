SUMMARY = "Uzbek localization files for LibreOffice"
DESCRIPTION = "Provides Uzbek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-uz-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "a0ee188e615d2ec59f35df81667bf3b628257796f2a62e904462826f0b41d336504ff7dc8736b954f0c9c78f5b03fa4165048bafc3f8d0c354b3504e8e0f9a1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uz libreoffice-l10n-uz locale(libreoffice:uz)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
