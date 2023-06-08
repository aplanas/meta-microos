SUMMARY = "Kannada localization files for LibreOffice"
DESCRIPTION = "Provides Kannada translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-kn-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "5c329ccfb4e140d134befb90558587a9f16d33bdf0fd3cddab47f0dd54422dabb601325b4b730e1a6c9f43fa1c26dd785eb4948e8ac9b472cebdb2042c0a459b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kn libreoffice-l10n-kn locale(libreoffice:kn)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
