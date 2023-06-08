SUMMARY = "Translation Updates for Greek"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-el-15.1-3.1.noarch.rpm"
RPM_HASH = "976288de568631fd12496b414b09ba8f6bc9133f6f8063b5e588e5fc4178b31369e0ee2b22ae0e37db2dec6e704b0268311f8a2eeb73ca2583bd9e810a7cc89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:el) translation-update-el"
RDEPENDS:${PN} += "translation-update"

inherit rpm
