SUMMARY = "Translation Updates for Simplified Chinese"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-zh_CN-15.1-3.1.noarch.rpm"
RPM_HASH = "f161b0f4a4d097b34dda7cfd968c86818406e0618655776db9c2a99487d7c6e81be94aed7a50f5079bddfed8ad38aa98cac2b2c6e4bb6befcfc3384dd2f145f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:zh_CN) translation-update-zh_CN"
RDEPENDS:${PN} += "translation-update"

inherit rpm
