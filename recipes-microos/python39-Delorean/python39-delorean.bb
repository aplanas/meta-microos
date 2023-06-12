SUMMARY = "Python library for manipulating datetimes"
DESCRIPTION = "Delorean is a library for clearing up the inconvenient truths that \
arise dealing with datetimes in Python."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-Delorean-1.0.0-4.6.noarch.rpm"
RPM_HASH = "2f7636277a0a4c825ba1f01a6cd9838f458d61b6e705ebee9c79834cd2fd2ba8597f77b79afebc7c58d66c8e30a8e7ca8039052d6b07ee3d5eadabe7c285dd90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(delorean) \
python39-Delorean \
python3dist(delorean)"
RDEPENDS:${PN} += "python(abi) \
python39-Babel \
python39-humanize \
python39-python-dateutil \
python39-pytz \
python39-tzlocal"

inherit rpm
