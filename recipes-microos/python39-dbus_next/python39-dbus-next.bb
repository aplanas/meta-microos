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

RPM_NAME = "python39-dbus_next-0.2.3-1.10.noarch.rpm"
RPM_HASH = "ec1890635e71e80df1674a77e8ebdc932dc32e3778264dcf955233f04b80473116c9f8cda82c2de360f7be57ff4a387700e4650ea5dad18d2cf4e50e98a836dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dbus-next) python39-dbus_next python3dist(dbus-next)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
