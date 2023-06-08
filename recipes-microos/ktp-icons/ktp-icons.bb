SUMMARY = "Icons for KDE Telepathy"
DESCRIPTION = "icons for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-icons-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7a4568c84953707771d00f5e2eb4cd0423a09314a8096fe429d8a1575931d92d4636347cbedd78b5a947d69dd494a38e997606c8eefadc632b6f313ad7a359c1"

RPROVIDES:${PN} += "ktp-icons ktp-icons(aarch-64) ktp-icons5"
RDEPENDS:${PN} += ""

inherit rpm
