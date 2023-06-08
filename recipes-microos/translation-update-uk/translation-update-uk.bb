SUMMARY = "Translation Updates for Ukrainian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-uk-15.1-3.1.noarch.rpm"
RPM_HASH = "fcf7f98dcdcdc7e509b5d7020f0f0c77eca91e0a09e4b94503fcdc6e785b7fe07c2266b8372aead966194b8dab9d86a04cd6203e955e412728ed37cbf9da20a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:uk) translation-update-uk"
RDEPENDS:${PN} += "translation-update"

inherit rpm
