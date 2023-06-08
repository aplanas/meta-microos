SUMMARY = "Systemd tools for portable services"
DESCRIPTION = "Systemd tools to manage portable services. The feature is still \
considered experimental so the package might change  or vanish. \
Use at own risk. \
 \
More information can be found online: \
 \
http://0pointer.net/blog/walkthrough-for-portable-services.html \
https://systemd.io/PORTABLE_SERVICES"
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-portable-253.4-1.2.aarch64.rpm"
RPM_HASH = "63a434c344b29232ac64ccc1f8039b7fec594b83f4472f567542d723e1ca4814a9b7e82b553cb27e8eba9aad1f5b37bd0286e57a43eefe91dcc619dc7d4104e7"

RPROVIDES:${PN} += "systemd-portable systemd-portable(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) systemd"

inherit rpm
