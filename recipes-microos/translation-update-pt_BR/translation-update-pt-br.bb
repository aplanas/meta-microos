SUMMARY = "Translation Updates for Brazilian Portuguese"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-pt_BR-15.1-3.1.noarch.rpm"
RPM_HASH = "1f75c984a0b548d27644ef60d172394a4521225c06c1c9c18a9648b06277eb4c2d5288b153168cdfa314e37556f6ae08633328e0511552f870c99ea55ee3f1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:pt_BR) translation-update-pt_BR"
RDEPENDS:${PN} += "translation-update"

inherit rpm
