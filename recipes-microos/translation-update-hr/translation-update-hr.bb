SUMMARY = "Translation Updates for Croatian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-hr-15.1-3.1.noarch.rpm"
RPM_HASH = "4b1ad23cd6f917f17ba1b03a12b013a97cdbd39cab281e7075d152df3e3ac8007aefecd90092670f6a0ca4c1f057789b812aba18e1caaa8b927144895c27ed09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:hr) translation-update-hr"
RDEPENDS:${PN} += "translation-update"

inherit rpm
