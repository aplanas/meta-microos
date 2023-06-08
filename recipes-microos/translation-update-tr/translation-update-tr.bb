SUMMARY = "Translation Updates for Turkish"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-tr-15.1-3.1.noarch.rpm"
RPM_HASH = "99023a3b2f86be03f51f760fbe35a2dc66ae0c3c48b8e5a53650999a830cf47a34048af543550f839096c0a6c84bc681d58b3fc8ed48c35af4e65213ec8f87d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:tr) translation-update-tr"
RDEPENDS:${PN} += "translation-update"

inherit rpm
