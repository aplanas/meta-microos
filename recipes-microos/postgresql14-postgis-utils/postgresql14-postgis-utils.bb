SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql14-postgis-utils-3.2.4-1.6.noarch.rpm"
RPM_HASH = "dd79c8160abc3777655d9f55bfc8d9aec31b937e6cd512311286caaefdc550c5c2a6eba3493670581b166db53dc28462704cc2df3aed8e9a2a12ae8c5505bc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils postgresql14-postgis-utils"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl-DBD-Pg postgresql14-postgis"

inherit rpm
