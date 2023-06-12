SUMMARY = "Kashmiri localization files for LibreOffice"
DESCRIPTION = "Provides Kashmiri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ks-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e4922980829dc8d8dd6e62cbee079c9411af8ce9a44b49b9e8a2d86bb035286348b1f6021b31e2f86c49f0418a276da67e2f3a0c28d359e9252a10ef4d5cb52e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ks libreoffice-l10n-ks locale(libreoffice:ks)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker"

inherit rpm
