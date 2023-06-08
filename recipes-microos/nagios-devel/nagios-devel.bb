SUMMARY = "Development files for Nagios"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
This package provides include files that Nagios-related applications \
may compile against."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-devel-4.4.7-2.4.aarch64.rpm"
RPM_HASH = "a8e5338deb7e13f1ffc5e76c4467333f57b7c020eb977a21195e5b90de83543de9618057d234854023d4934104cbfa75b6bee75ce5402b7c49c7e2d95b5cff37"

RPROVIDES:${PN} += "nagios-devel nagios-devel(aarch-64)"
RDEPENDS:${PN} += "gcc nagios"

inherit rpm
