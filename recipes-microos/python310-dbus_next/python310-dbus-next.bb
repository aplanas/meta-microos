SUMMARY = "A zero-dependency DBus library for Python with asyncio support"
DESCRIPTION = "python-dbus-next is a Python library for DBus that aims to be a fully featured high level library primarily geared towards integration of applications into Linux desktop and mobile environments. \
 \
Desktop application developers can use this library for integrating their applications into desktop environments by implementing common DBus standard interfaces or creating custom plugin interfaces. \
 \
Desktop users can use this library to create their own scripts and utilities to interact with those interfaces for customization of their desktop environment. \
 \
python-dbus-next plans to improve over other DBus libraries for Python in the following ways: \
 \
Zero dependencies and pure Python 3. \
Support for multiple IO backends including asyncio and the GLib main loop. \
Nonblocking IO suitable for GUI development. \
Target the latest language features of Python for beautiful services and clients. \
Complete implementation of the DBus type system without ever guessing types. \
Integration tests for all features of the library. \
Completely documented public API."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python310-dbus_next-0.2.3-1.10.noarch.rpm"
RPM_HASH = "fe419f9103abaa916c2d2c50fd5152b84077f124f1fa7bbc9c87d4c5c6e1bf4b06870efce5e37816af30362ff95d3cae804bc3a25585fe221b6f66d450c16401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dbus_next \
python3.10dist(dbus-next) \
python310-dbus_next \
python3dist(dbus-next)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
