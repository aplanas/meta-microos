SUMMARY = "Parse D-Bus introspection XML and process it in various ways"
DESCRIPTION = "dbus-deviation is a project for parsing D-Bus introspection XML and processing \
it in various ways. Its main tool is dbus-interface-diff, which calculates the \
difference between two D-Bus APIs for the purpose of checking for API breaks. \
This functionality is also available as a Python module, dbusdeviation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.1"

RPM_NAME = "python39-dbus-deviation-0.6.1-1.12.noarch.rpm"
RPM_HASH = "3442f29027e176ebd73e0c8e386cf5c9ecf372b452e6d1f02880290ed08da4bf337a953e116d54b5ba6a30e54b1b0e2162f0c64e7b14b63101209d16d7a278ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dbus-deviation) python39-dbus-deviation python3dist(dbus-deviation)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-lxml"

inherit rpm
