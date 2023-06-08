SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql15-postgis-utils-3.2.4-1.5.noarch.rpm"
RPM_HASH = "3262c04fd8514752a166d6119a5e2faad2176ea32661398e47b3e03448bb3fca9be65c1992db8bde4047b231c0f42aa11785e0b3a27d0a8ea083b0ccdd86930b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils postgresql15-postgis-utils"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl-DBD-Pg postgresql15-postgis"

inherit rpm
