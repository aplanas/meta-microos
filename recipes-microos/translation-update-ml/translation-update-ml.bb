SUMMARY = "Translation Updates for Malayalam"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-ml-15.1-3.1.noarch.rpm"
RPM_HASH = "595b4c004dacc6812704215248404cfe03ce59cfd0b9778dd0084b82cea28405b62cf32414dfe0e25369c97063e6648f7425b70c91fcd583d6bcf7f4bb442c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:ml) \
translation-update-ml"
RDEPENDS:${PN} += "translation-update"

inherit rpm
