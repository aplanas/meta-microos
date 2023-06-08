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

RPM_NAME = "python311-dbus_next-0.2.3-1.10.noarch.rpm"
RPM_HASH = "ecd11412950af6a35df48721b7f87d8f818c85c60d9329e790cc30768c2e572e6961f7d8e83ea8ab031b45f351aabad02367599f4baf681f62c3be6bd3d76035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dbus-next) python311-dbus_next python3dist(dbus-next)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
