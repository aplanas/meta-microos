SUMMARY = "Library for prompting for PGP keys"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui0-3.12.2-10.3.aarch64.rpm"
RPM_HASH = "85f89aae88eac856c79960991ae9855d823888a7c27487c56eb168e357cd13a27e97bbf77fc32776cefff22636ac9424bb02c06871dcaf939e3c09bc9cdc2214"

RPROVIDES:${PN} += "libcryptui libcryptui.so.0()(64bit) libcryptui0 libcryptui0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gnome-keyring ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcryptui-data libdbus-glib-1.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
