SUMMARY = "Translation Updates for Danish"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-da-15.1-3.1.noarch.rpm"
RPM_HASH = "71747e2d4befe41ca2dce6e09f5918eb9d61634629560daf3e82eaf4d2fa7db2fa01f345eabd0d47463e2d3ceba57d26aa4d1bff6a09700751d58be948d2e285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:da) translation-update-da"
RDEPENDS:${PN} += "translation-update"

inherit rpm
