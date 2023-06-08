SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "0.23.0"

RPM_NAME = "python39-crontab-0.23.0-1.8.noarch.rpm"
RPM_HASH = "1d9208b61b08622f854039a6058b80bcec05b3b2515ab8cfbff7f0c0b3c80ccd289631e59b11ea10765cbd8d6e97d78c6bfca347ac03a4f138157a3a91eaf20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(crontab) python39-crontab python3dist(crontab)"
RDEPENDS:${PN} += "python(abi) python39-python-dateutil python39-pytz"

inherit rpm
