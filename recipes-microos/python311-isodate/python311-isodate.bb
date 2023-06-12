SUMMARY = "An ISO 8601 Date/Time/Duration Parser and Formatter"
DESCRIPTION = "This module implements ISO 8601 date, time and duration parsing. \
The implementation follows ISO8601:2004 standard, and implements only \
date/time representations mentioned in the standard. If something is not \
mentioned there, then it is treated as non existent, and not as an allowed \
option."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-isodate-0.6.1-3.1.noarch.rpm"
RPM_HASH = "1df98755c18c834fdf22ad096995855b1ed5d49cb49eeba229761fa66c2f9f58a8b20a9afdc2780f87dfac94796a93341ebb4cfc793d8224730763ace7828d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(isodate) \
python311-isodate \
python3dist(isodate)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
