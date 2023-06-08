SUMMARY = "Check an IRCd server"
DESCRIPTION = "Monitor the status of an Internet Relay Chat daemon (IRCd) with this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ircd-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "1c12f1347d2026a3fb1581f11f304eb67e4cbcc6188b22d7e440b75e11c0ac0eed0bc17c641955290b21aaab8671248c4eadbece522af16095d8745d18e50c28"

RPROVIDES:${PN} += "monitoring-plugins-ircd monitoring-plugins-ircd(aarch-64) nagios-plugins-ircd"
RDEPENDS:${PN} += "/usr/bin/perl monitoring-plugins-common perl perl(IO::Socket::INET6) perl(IO::Socket::SSL)"

inherit rpm
