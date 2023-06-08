SUMMARY = "Translation Updates for Estonian"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-et-15.1-3.1.noarch.rpm"
RPM_HASH = "5946dad79e96776344f2e19408be0b54fc87dcd188d0886ac66c438cdb021cf64c32354c8382d771272de4ab196f3fcab5fc0dd5f7143f3e9c9f2866905fd192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:et) translation-update-et"
RDEPENDS:${PN} += "translation-update"

inherit rpm
