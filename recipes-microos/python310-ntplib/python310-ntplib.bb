SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-ntplib-0.4.0-1.3.noarch.rpm"
RPM_HASH = "69cb327aa7a5ebaaaf7b13f4765d371d5af71e7298c2d5ba045ec6b11c53395a031ab33875a24cc8d9fab0f353191b36e22042b7d99130d8f6651fdfcc35d95d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntplib python3.10dist(ntplib) python310-ntplib python3dist(ntplib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
