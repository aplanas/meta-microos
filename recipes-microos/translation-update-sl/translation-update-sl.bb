SUMMARY = "Translation Updates for Slovenian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-sl-15.1-3.1.noarch.rpm"
RPM_HASH = "d83504f5c87642c4f3215b62e19a58fdaa0ec5520e4329e7b1df42b1a5746a7b27cab7f33f3fb02359544cf6b98b7c8dce724056debf659eba6a8b621e60d233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:sl) translation-update-sl"
RDEPENDS:${PN} += "translation-update"

inherit rpm
