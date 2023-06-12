SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
also ports recent unittest changes all the way back to Python 2.4."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python311-testtools-2.6.0-1.1.noarch.rpm"
RPM_HASH = "df6f2f78fa8c7a439b4e5de58ca347ec5ad81080eb56fd9c54f37452f0a1dfaa39b7f7241c423bc7425db8f318ab094ce551fefbcce8702e65560ec43cf5fa55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(testtools) \
python311-testtools \
python3dist(testtools)"
RDEPENDS:${PN} += "python(abi) \
python311-pbr \
python311-python-mimeparse \
python311-traceback2"

inherit rpm
