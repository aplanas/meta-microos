SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql13-postgis-utils-3.2.4-1.5.noarch.rpm"
RPM_HASH = "3fd4751aef7235e6dd127342db286b766f96c5407692654627d49cdc9dd3b772e79d6b6b5be9812273d72d9dfe2ec6d15a02e59d233a6e4de4e0da0c0a53db2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils postgresql13-postgis-utils"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl-DBD-Pg postgresql13-postgis"

inherit rpm
