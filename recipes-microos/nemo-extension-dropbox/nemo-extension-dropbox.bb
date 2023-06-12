SUMMARY = "DropBox support for the Nemo Filemanager"
DESCRIPTION = "Nemo-dropbox adds DropBox support to the Nemo filemanager."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-dropbox-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "d36a904def73fa95060b3a7fa2ca13c3d5dd5591b5470f59a2698aaf7fc725e7a4b3424486d4398879a7aaceaded04c8ebab8d48999cfe26e00c9e7e00a1ecd2"

RPROVIDES:${PN} += "libnemo-dropbox.so()(64bit) \
nemo-dropbox \
nemo-extension-dropbox \
nemo-extension-dropbox(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
dropbox \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnemo-extension.so.1()(64bit) \
nemo"

inherit rpm
