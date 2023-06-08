SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-ntplib-0.4.0-1.3.noarch.rpm"
RPM_HASH = "a5305b6846a9c0e32d7fdc81c47bb6a3bf98f0241d9f3dfba0e696b36526c28b4f5f2ad7bec28dcf0c22a2e5de72f11d7aa6965c6bfb13b56c8ec37f459db05a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ntplib) python311-ntplib python3dist(ntplib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
