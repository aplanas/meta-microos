SUMMARY = "Base package of Kleopatra, a key manager by KDE"
DESCRIPTION = "libkleo is a library used by KDE PIM applications to handle cryptographic key \
and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkleo-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "9b9dcd678d63c566fd1b73c0f4b36ff48984c6530c179ab3f6dd20779c4091c406c4b76b2a663a8034f6930c453e04d4d2e2b0020e1c98bd5efc7c1e3569f4ed"

RPROVIDES:${PN} += "config(libkleo) libkleo libkleo(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
