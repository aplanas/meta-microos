SUMMARY = "Python module for parsing and using crontab schedules"
DESCRIPTION = "This package offers a method of parsing crontab schedule entries and \
determining when an item should next be run. More specifically, it \
calculates a delay in seconds from when the .next() method is called \
to when the item should next be executed."
LICENSE = "LGPL-2.1-only"

PV = "0.23.0"

RPM_NAME = "python311-crontab-0.23.0-1.8.noarch.rpm"
RPM_HASH = "ec93970e86fe1769e9376297e943579a63a3880b9f059db3a2e7b63b4541574a92b7ed3957d50ea24ff4639808f15b9e622843a9fc0aadc6c7a5e9a427712a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(crontab) python311-crontab python3dist(crontab)"
RDEPENDS:${PN} += "python(abi) python311-python-dateutil python311-pytz"

inherit rpm
