SUMMARY = "Translation Updates for Vietnamese"
DESCRIPTION = "This is a set of translation updates that are installed into the \
preferred directory, /usr/share/locale-langpack/<locale>/LC_MESSAGES/. \
 \
Applications that use gettext correctly can then pick up overridden or \
updated translations from this location."
LICENSE = "GPL-2.0-or-later"

PV = "15.1"

RPM_NAME = "translation-update-vi-15.1-3.1.noarch.rpm"
RPM_HASH = "f99fc27f922b130a853af6465b81560ec0a726ef07be118601f3c9fd1a16da289f615504efa9655628486682b3d0280632681af45ee6ef52ab06c1882bbdad0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(translation-update:vi) translation-update-vi"
RDEPENDS:${PN} += "translation-update"

inherit rpm
