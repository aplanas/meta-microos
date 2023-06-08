SUMMARY = "OpenStack log library"
DESCRIPTION = "OpenStack logging configuration library provides standardized configuration \
for all openstack projects.It also provides custom formatters, handlers and \
support for context specific logging (like resource id's etc). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python3-oslo.log-5.2.0-1.1.noarch.rpm"
RPM_HASH = "256377a551d4c1525b66a8ebda40945dc8ef345a64f53445ddcc3351c576c5acb58082257199f31cc84c34def05e7ea0e354a3371c4e520a0c176393c6250429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.log python3.10dist(oslo.log) python3dist(oslo.log)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-debtcollector python3-monotonic python3-oslo.config python3-oslo.context python3-oslo.i18n python3-oslo.serialization python3-oslo.utils python3-pyinotify python3-python-dateutil python3-systemd"

inherit rpm
