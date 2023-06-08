SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.23"

RPM_NAME = "python39-pysmbc-1.0.23-3.8.aarch64.rpm"
RPM_HASH = "c1207da854c2e542e7892aae41d08fa77f7e6669e1178ccc6bc4e95245a28b12c915b44e0fb31c593b10687e6274eb568b9bbcf6aa200d9152514b22810d1536"

RPROVIDES:${PN} += "python-smbc python3.9dist(pysmbc) python39-pysmbc python39-pysmbc(aarch-64) python39-smbc python3dist(pysmbc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsmbclient.so.0()(64bit) libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) libsmbclient.so.0(SMBCLIENT_0.5.0)(64bit) python(abi)"

inherit rpm
