SUMMARY = "Tiny date, time diff calculator with timers"
DESCRIPTION = "pdd (Python3 Date Diff) is a small cmdline utility to calculate date and time difference. It can also be used as a timer"
LICENSE = "GPL-3.0-only"

PV = "1.7"

RPM_NAME = "python310-pdd-1.7-1.4.noarch.rpm"
RPM_HASH = "25db16e93c2c6eed1b77df75064f8261dda4374ede18826f567528c92c6cb687892fb6eb924b9ac6dee3626001e783e286f10499ff67ce01a00541a95d2e2102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdd python3.10dist(pdd) python310-pdd python3dist(pdd)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-python-dateutil python310-setuptools update-alternatives"

inherit rpm
