SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libksieve-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "2e6a8f01807e451f4a5ff196b924259155802ad41cbee4245937bd9bacb91255f45e9a7e64706abb554aacf623bd70714258a5352aa0e8ae55e16e92f4ac1d14"

RPROVIDES:${PN} += "libksieve \
libksieve(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
