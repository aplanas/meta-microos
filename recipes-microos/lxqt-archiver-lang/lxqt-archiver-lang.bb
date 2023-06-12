SUMMARY = "Translations for package lxqt-archiver"
DESCRIPTION = "Provides translations for the 'lxqt-archiver' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "lxqt-archiver-lang-0.8.0-1.1.noarch.rpm"
RPM_HASH = "b11d4f8f9335f6760d2f0c22cb875eb5d893d028b676afe998d1730858bb7f72498bb9142f74c59ada5ebb323007005410cc0cb24d4c1a6881db6133b959771c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-archiver-lang \
lxqt-archiver-lang-all"
RDEPENDS:${PN} += "lxqt-archiver"

inherit rpm
