SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-ntplib-0.4.0-1.3.noarch.rpm"
RPM_HASH = "f63170e3506cfedefcfe7a40b80fc5094e9f0245713ee443d221f7c19fba597eb35aa7f986584042d5db1baf9a5c622f228b324bfe3cc2f8932dc3940a1184a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ntplib) python39-ntplib python3dist(ntplib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
