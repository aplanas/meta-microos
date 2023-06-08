SUMMARY = "Translation Updates for Italian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-it-15.1-3.1.noarch.rpm"
RPM_HASH = "379681b9be5214ba49857773f4908e0523d1f410968311a832cc91cb4c883a7013f7e062839c164a9467f57ceffd4a2c53a6d2cd2cd9ba158a0f2b3521f37e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:it) translation-update-it"
RDEPENDS:${PN} += "translation-update"

inherit rpm
