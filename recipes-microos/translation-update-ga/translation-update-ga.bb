SUMMARY = "Translation Updates for Irish"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ga-15.1-3.1.noarch.rpm"
RPM_HASH = "77f33a6ce11bd8b9181e9cc724269413b96b5f444e991b47d93abd70c365047a8e32500d6cba46beac7b1f9e7bb6c326d13e0f831cef2830f76583e44aacb350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:ga) \
translation-update-ga"
RDEPENDS:${PN} += "translation-update"

inherit rpm
