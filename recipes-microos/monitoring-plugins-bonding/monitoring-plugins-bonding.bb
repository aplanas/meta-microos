SUMMARY = "Nagios Network Bonding Check"
DESCRIPTION = "This script attempts to read the proc interface to the Linux kernel bonding \
driver, and determine if the bonded interfaces are optimal. It will warn if any \
of the enslaved devices are not 'up' (exit 1), and if any bonded interfaces are \
not active at all (exit 2). This script is suitable for feeding to NRPE for \
Nagios (or similar) to check."
LICENSE = "GPL-2.0-or-later | Artistic-1.0"

PV = "0.002"

RPM_NAME = "monitoring-plugins-bonding-0.002-108.8.noarch.rpm"
RPM_HASH = "1d90601528bcd58db00c49b9aec075f46d447f820a846c124683aa0dd435cce74680240c49c67c33e522bfa278cf79b6f406f7f395b37160c244fbf6ea6a02a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(monitoring-plugins-bonding) monitoring-plugins-bonding nagios-plugins-bonding"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
