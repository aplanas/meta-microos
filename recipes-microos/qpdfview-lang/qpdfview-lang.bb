SUMMARY = "Translations for package qpdfview"
DESCRIPTION = "Provides translations for the 'qpdfview' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-lang-0.5.0-1.3.noarch.rpm"
RPM_HASH = "1bc41e1b427dbfb4e86180d54cd3ff4e1780b7909b02c5ab2bcc18db2c6b7d26da06d0665582578fd4d287ea6db1670c6cc39417d0de1aa633e9f95bf20bf929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdfview-lang \
qpdfview-lang-all"
RDEPENDS:${PN} += "qpdfview"

inherit rpm
