SUMMARY = "Julian dates from proleptic Gregorian and Julian calendars"
DESCRIPTION = "This module contains functions for converting between Julian dates and \
calendar dates. \
 \
A function for converting Gregorian calendar dates to Julian dates, and \
another function for converting Julian calendar dates to Julian dates \
are defined. Two functions for the reverse calculations are also \
defined."
LICENSE = "BSD-2-Clause"

PV = "1.4.1"

RPM_NAME = "python311-jdcal-1.4.1-1.14.noarch.rpm"
RPM_HASH = "d36487ed3e48bec1d64a26efc10b9020ec033c13c0a6947c8ef2c31dbe6150d35a00068f9603024b452a27b7fe0e7bbea5a2659a05f795c222bf89b700fee87c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jdcal) \
python311-jdcal \
python3dist(jdcal)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
