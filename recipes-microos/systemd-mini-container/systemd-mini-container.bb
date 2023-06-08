SUMMARY = "Systemd tools for container management"
DESCRIPTION = "Systemd tools to spawn and manage containers and virtual machines. \
 \
In addition, it also contains a plugin for the Name Service Switch (NSS), \
providing host name resolution for all local containers and virtual machines \
using network namespacing and registered with systemd-machined. It also maps \
UID/GIDs ranges used by containers to useful names. \
 \
To activate this NSS module, you will need to include it in /etc/nsswitch.conf, \
see nss-mymachines(8) manpage for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-mini-container-253.4-1.1.aarch64.rpm"
RPM_HASH = "e89e78f59ab00c6ae8b57a4c403f2ea1151e79f7509c0ddc1bbbbfdbe2cbf2e84fdc50f72832ae9e9734108a50f23488d782ba4a2c5f1b493962681bcce5bc2c"

RPROVIDES:${PN} += "nss-mymachines systemd-container systemd-mini-container systemd-mini-container(aarch-64) systemd:/usr/bin/systemd-nspawn"
RDEPENDS:${PN} += "/bin/sh /usr/bin/gpg /usr/bin/tar ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) systemd systemd-mini"

inherit rpm
