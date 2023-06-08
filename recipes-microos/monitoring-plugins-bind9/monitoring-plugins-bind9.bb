SUMMARY = "BIND9 Monitoring Plugin"
DESCRIPTION = "Plugins for BIND9 and DNS resolver monitoring. The check_bind9.pl plugin \
expects to run on the host running BIND. \
 \
Please run it with --help to see where it expects to find a variety of files \
and commands, and the options you are likely to require to provide."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "monitoring-plugins-bind9-1.0.0-2.10.noarch.rpm"
RPM_HASH = "8433f6648e0b55953addebef88138d74d31230669e292b12f253897bcf22f5a2d2aa33e99c3bdab4e3e282be6f70f5484287954435bd73d88b1a31bc543d0ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-bind9 nagios-plugins-bind9"
RDEPENDS:${PN} += "/usr/bin/perl bind-utils perl(Getopt::Long) perl(IO::File) perl(IO::Handle)"

inherit rpm
