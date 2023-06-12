SUMMARY = "Translation Updates for Latvian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-lv-15.1-3.1.noarch.rpm"
RPM_HASH = "c99e38cf9680388cdb686d31a933389e4954831a8af0c80371f84111148dd21495d0d31433c3ebd3645a29153db50b3cc376c4868c3ba664ea22ea19bc2f258a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:lv) \
translation-update-lv"
RDEPENDS:${PN} += "translation-update"

inherit rpm
