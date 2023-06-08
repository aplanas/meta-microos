SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python310-agate-1.7.1-2.2.noarch.rpm"
RPM_HASH = "f93beac56f236f4b82f48bae50d369898c7afc5e79520f27528ba1ebbbc88d644358cd5759a661e203be08ccdf53581bf8feface7ee3490aef7dd6c73714c7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate python3.10dist(agate) python310-agate python3dist(agate)"
RDEPENDS:${PN} += "python(abi) python310-Babel python310-isodate python310-leather python310-parsedatetime python310-python-slugify python310-pytimeparse"

inherit rpm
