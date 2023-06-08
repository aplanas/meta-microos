SUMMARY = "World timezone definitions, modern and historical"
DESCRIPTION = "pytz - World Timezone Definitions for Python \
pytz brings the Olson tz database into Python. This library allows \
accurate and cross platform timezone calculations using Python 2.4 \
or higher. It also solves the issue of ambiguous times at the end \
of daylight savings, which you can read more about in the Python \
Library Reference (``datetime.tzinfo``). \
 \
Amost all of the Olson timezones are supported."
LICENSE = "MIT"

PV = "2023.3"

RPM_NAME = "python310-pytz-2023.3-2.1.noarch.rpm"
RPM_HASH = "c94f2274bf2b4d2535a7caedd5a2612c338dcede60758d2c8d769c5884c9e422d6629517547aee9153575c78eefce4b64ad9dd45d16626b1845e601fadfd036e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytz python3.10dist(pytz) python310-pytz python3dist(pytz)"
RDEPENDS:${PN} += "/bin/sh python(abi) python310-base timezone"

inherit rpm
