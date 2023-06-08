SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkgapi-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "16dcb1c0ecfb75f9eccac3e118558574b26c11f48c1f4ec7af43a1a259f5bc6a3ef6d46a62cccc8d9348b97cafb349a41c8d08b74fc8bdcf17f941d59bbb8846"

RPROVIDES:${PN} += "libkgapi libkgapi(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
