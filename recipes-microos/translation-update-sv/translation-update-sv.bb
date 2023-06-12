SUMMARY = "Translation Updates for Swedish"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-sv-15.1-3.1.noarch.rpm"
RPM_HASH = "6e5e74a41be06a9d437a57ab1db31cdd63a483017db95e6641c1fd3fdfd3a73fec211b43f4b2f4e1257501d52443c8d104e155fcd64be4be3cecc37f5b3146c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:sv) \
translation-update-sv"
RDEPENDS:${PN} += "translation-update"

inherit rpm
