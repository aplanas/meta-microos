SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql12-postgis-utils-3.2.4-1.5.noarch.rpm"
RPM_HASH = "683a499817327e42dbbdf92b94ba1d203126201390c360bfd3537da92a2bc48724c58a2a311af55fe077957d882cc330c4e5d98b360a86ce17068e21a046b6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils postgresql12-postgis-utils"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl-DBD-Pg postgresql12-postgis"

inherit rpm
