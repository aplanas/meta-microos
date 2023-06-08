SUMMARY = "Translation Updates for Nepali"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ne-15.1-3.1.noarch.rpm"
RPM_HASH = "3acf7241c2f3be38c26157ed224e9cc5863934d2b8f977d247f9ca5694d6a954221e8f89ef7318884e4fcc4563a391876439589b493427a8e527454c5cb06094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:ne) translation-update-ne"
RDEPENDS:${PN} += "translation-update"

inherit rpm
