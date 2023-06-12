SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "python39-tempora-5.2.2-1.1.noarch.rpm"
RPM_HASH = "e88b9c31fe9b971820dc33751b53962f7e5d329b85a6fb5f6e6ae0218874833291d1e6952ef422a3fdb0c4acf5e1c756e9fe07288d0e8b5626e36974e930b575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tempora) \
python39-tempora \
python3dist(tempora)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-jaraco.functools \
python39-pytz"

inherit rpm
