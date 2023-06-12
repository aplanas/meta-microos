SUMMARY = "Python library for working with date and datetime objects"
DESCRIPTION = "Python library for working with date and datetime objects."
LICENSE = "0BSD"

PV = "0.6.12"

RPM_NAME = "python311-dateutils-0.6.12-1.3.noarch.rpm"
RPM_HASH = "98c2b06f69e7145125ad663a3e1100e8bbdbed6f47c0f8a4974bd6b8858c21be6c7898cc00962941acb7d5f0b217a6db4133143875c5e187201dc3eef3a17401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dateutils) \
python311-dateutils \
python3dist(dateutils)"
RDEPENDS:${PN} += "python(abi) \
python311-python-dateutil \
python311-pytz"

inherit rpm
