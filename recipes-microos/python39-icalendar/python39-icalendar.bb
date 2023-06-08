SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python39-icalendar-4.1.0-1.4.noarch.rpm"
RPM_HASH = "13cf94924ed45a7beeeb56dc2858d651d2a03272ef889ee50346c586b1e3e377a6bc4e0bde2b31d3ce11562bd3ef8aa05a4afdd5c715e584b008b8c81d001684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(icalendar) python39-icalendar python39-icalendar-doc python3dist(icalendar)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-python-dateutil python39-pytz update-alternatives"

inherit rpm
