SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql14-postgis-utils-3.2.4-1.5.noarch.rpm"
RPM_HASH = "d2a64fd1990c0fd8aadb3f6908b29e8be7dd3798006e29b9198db71a07706cbee03ee19a8cba983438f3a03539a87ccfd7aba0ccdcbbb6e8c618c0344def2d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils postgresql14-postgis-utils"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl-DBD-Pg postgresql14-postgis"

inherit rpm
