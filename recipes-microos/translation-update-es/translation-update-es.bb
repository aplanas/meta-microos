SUMMARY = "Translation Updates for Spanish"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-es-15.1-3.1.noarch.rpm"
RPM_HASH = "d6c30ad21669dde27b40df5fffd62c62d179b2b857e3e379ae10b1899025ad23d755195173208fa27842ad7902e502552ba5d18b2123d78a9c813b11b3325243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:es) translation-update-es"
RDEPENDS:${PN} += "translation-update"

inherit rpm
