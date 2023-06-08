SUMMARY = "Translation Updates for Polish"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-pl-15.1-3.1.noarch.rpm"
RPM_HASH = "bead7c505804a2c1977f20c537f8e410168ef2591db0eaf6aa270fbdba7e2920cd2af5e3ae5afc50510564b42b721b86b49c5bc7dff4722963f019a6560b3b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:pl) translation-update-pl"
RDEPENDS:${PN} += "translation-update"

inherit rpm
