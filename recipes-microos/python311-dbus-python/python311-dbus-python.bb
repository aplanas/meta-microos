SUMMARY = "Python bindings for D-Bus"
DESCRIPTION = "D-Bus python bindings for use with python programs."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "python311-dbus-python-1.3.2-1.5.aarch64.rpm"
RPM_HASH = "d3643b3517ffe6c86be0c921382b94a9a7e1c5396d573f9fa38cca908645edff1d9905e1814259f1d48713d4d6e54fd890b6ca4efdd218e20b572fc1216e2e9c"

RPROVIDES:${PN} += "dbus-1-python311 python311-dbus-python python311-dbus-python(aarch-64)"
RDEPENDS:${PN} += "dbus-1 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libglib-2.0.so.0()(64bit) python(abi) python311-gobject python311-xml"

inherit rpm
