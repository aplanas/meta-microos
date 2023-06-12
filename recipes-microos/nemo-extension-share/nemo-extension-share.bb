SUMMARY = "Samba share extension for Nemo file manager"
DESCRIPTION = "Nemo Share allows you to quickly share a folder from the Cinnamon \
Nemo file manager without requiring root access."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-share-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "9eb83b61e620775426ae63d42965e2f7d24c3f2125b483818ca7b734445578fd5c6563b74e65e8bd9ff219fbff3ede98845d9d944bb08ea62dd7b4180cad9bfa"

RPROVIDES:${PN} += "libnemo-share.so()(64bit) \
nemo-extension-share \
nemo-extension-share(aarch-64) \
nemo-share"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnemo-extension.so.1()(64bit) \
nemo"

inherit rpm
