SUMMARY = "Base package of Kleopatra, a key manager by KDE"
DESCRIPTION = "libkleo is a library used by KDE PIM applications to handle cryptographic key \
and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkleo-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "92ab394a0bc3e6cbe86dc2bcdb6d73087675e9149daa26721731b6755d787b0595e8aa4673a2f10735b292fbba77defa60c2a955b0a023c27a39a27eb51c63ed"

RPROVIDES:${PN} += "config(libkleo) libkleo libkleo(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
