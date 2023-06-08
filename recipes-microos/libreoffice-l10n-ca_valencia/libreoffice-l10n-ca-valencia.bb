SUMMARY = "Valencian localization files for LibreOffice"
DESCRIPTION = "Provides Valencian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-l10n-ca_valencia-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "042ed77dd7ad330c24c8500cf2c645e74c498d1695f103a8ec47d57f1f0ba9e40380f42d9b60d9bbe22e35ac072cd885046c56e33b9ea1b2c0b211503f380c8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca-valencia libreoffice-help-ca_valencia libreoffice-l10n-ca_valencia locale(libreoffice:ca_valencia)"
RDEPENDS:${PN} += "/bin/sh libreoffice libreoffice-share-linker myspell-ca_ES_valencia"

inherit rpm
