SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.2.2"

RPM_NAME = "python311-tempora-5.2.2-1.1.noarch.rpm"
RPM_HASH = "4bdfff4fd806b52818595f24b9d998e7dc9176bc56dcf2648aa4290e7d2ad29e803f360217ccb8231e873c89a3931e3a4acde4fdd14e86ff8553654dc02ed01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tempora) \
python311-tempora \
python3dist(tempora)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-jaraco.functools \
python311-pytz"

inherit rpm
