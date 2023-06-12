SUMMARY = "Python driver for MongoDB"
DESCRIPTION = "The PyMongo distribution contains tools for interacting with MongoDB \
database from Python.  The bson package is an implementation of \
the BSON format for Python. The pymongo package is a native Python \
driver for MongoDB. The gridfs package is a gridfs \
implementation on top of pymongo."
LICENSE = "Apache-2.0"

PV = "4.3.3"

RPM_NAME = "python310-pymongo-4.3.3-1.4.aarch64.rpm"
RPM_HASH = "94c6a418def8a2650ac07b56c91b95d31472af02af42bfb5792ae59044fce2dc21ca5c53dd40750b01cd85953fe8096b430c2371d993cb6c6322558113a71ac3"

RPROVIDES:${PN} += "python3-pymongo \
python3.10dist(pymongo) \
python310-pymongo \
python310-pymongo(aarch-64) \
python3dist(pymongo)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
