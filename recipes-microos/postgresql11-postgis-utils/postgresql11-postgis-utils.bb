SUMMARY = "The utils for PostGIS"
DESCRIPTION = "The postgis-utils package provides utilities for PostGIS."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql11-postgis-utils-3.2.4-1.5.noarch.rpm"
RPM_HASH = "b1116762dd6c6f3ab988b733d89c74223946095ff35a57e2ccb15c923631129378911c03a9eaa5dec65e0867dec93fbd824aecdfccee1a9435d9aeafcbfcebb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgis-utils postgresql11-postgis-utils"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl perl-DBD-Pg postgresql11-postgis"

inherit rpm
