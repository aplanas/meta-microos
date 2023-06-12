SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkgapi-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5eac968c14a4a3bf998d32ee3ec4e5600c0c8f6a696af7378ee650a79d7de07a8978b4620d348384ba561f3af6d4c6f760161a98e659919d0a32c8e2c963873a"

RPROVIDES:${PN} += "libkgapi libkgapi(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
