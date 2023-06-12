SUMMARY = "Lua Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Lua applications via the wsapi interface."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-lua-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "b9c669fbbe0d38ba92b08c988aba7632ef233414108c40a7ef463a97849d1dbfa5a3dc38d11b7caa2323cddf697a52fc854affb66bd594ff5edd84670e213845"

RPROVIDES:${PN} += "uwsgi-lua \
uwsgi-lua(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.1.so.5()(64bit) \
uwsgi"

inherit rpm
