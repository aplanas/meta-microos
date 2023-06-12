SUMMARY = "Translation Updates for Czech"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-cs-15.1-3.1.noarch.rpm"
RPM_HASH = "5ef057e70a23657bcc5bd15fc3c0f0931a45a0d9a0354a2b9f9fbad6dafe5585f6c3bc26c1c317039dfae187b7fc86dc63155bf83088a89fe639089cc2e4fe09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:cs) \
translation-update-cs"
RDEPENDS:${PN} += "translation-update"

inherit rpm
