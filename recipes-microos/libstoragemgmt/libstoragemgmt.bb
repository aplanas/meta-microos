SUMMARY = "Storage array management library"
DESCRIPTION = "The libStorageMgmt library will provide a vendor agnostic open source storage \
application programming interface (API) that will allow management of storage \
arrays.  The library includes a command line interface for interactive use and \
scripting (command lsmcli).  The library also has a daemon that is used for \
executing plug-ins in a separate process (lsmd)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "libstoragemgmt-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "2ac2fd8e1e6df4ec1354b77a8448d29fd25ec529282be76623111673e7b0a193803495d8fcf73a60a7d48c1d311a37f29b7959333a5637b4bb60d9b07a80ba19"

RPROVIDES:${PN} += "config(libstoragemgmt) group(libstoragemgmt) libstoragemgmt libstoragemgmt(aarch-64) user(libstoragemgmt)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libconfig.so.11()(64bit) libsqlite3.so.0()(64bit) libstoragemgmt.so.1()(64bit) python3-libstoragemgmt python3-six systemd sysuser-shadow"

inherit rpm
