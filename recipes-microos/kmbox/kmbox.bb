SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kmbox-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "82e71ad0ab1857d2a2a7a402ba8601234b0c865483000f35898bf35e326d0ee58d97a634a30babee41bb47d1ac74b56fbc7e81de6bef02680c4aea59625b86f0"

RPROVIDES:${PN} += "kmbox kmbox(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
