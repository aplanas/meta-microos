SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
also ports recent unittest changes all the way back to Python 2.4."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python39-testtools-2.6.0-1.1.noarch.rpm"
RPM_HASH = "271ea7e21c7716fc3903c5d8d42d4fff365ed7eb2f13463ebb8463908ea7244b50d0406d144e5cba95fef36b1779790e0101781b2d2ab2333977166e54273180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(testtools) \
python39-testtools \
python3dist(testtools)"
RDEPENDS:${PN} += "python(abi) \
python39-pbr \
python39-python-mimeparse \
python39-traceback2"

inherit rpm
