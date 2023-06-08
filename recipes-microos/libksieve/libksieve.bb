SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libksieve-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "643bcecad6446cfe237b570418a2f3ff06b0c16b054de77ae1016d3671646cc156815a246cc6e9a1bea7f4d74526acd5e9af5998784ccb69fdcbba83b7e64c22"

RPROVIDES:${PN} += "libksieve libksieve(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
