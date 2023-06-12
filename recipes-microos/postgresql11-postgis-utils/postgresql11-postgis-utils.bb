SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql11-postgis-utils-3.2.4-1.6.noarch.rpm"
RPM_HASH = "a3b7ebbf710562620ab018cf820c8db79f5ed20567dc41759c48ce652763cbe1c2a31ce2b375cb9c1e786cdb097f00d79b2d802b598db3833e7b331644939730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils \
postgresql11-postgis-utils"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
perl-DBD-Pg \
postgresql11-postgis"

inherit rpm
