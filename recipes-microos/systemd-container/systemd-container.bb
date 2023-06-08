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

RPM_NAME = "systemd-container-253.4-1.2.aarch64.rpm"
RPM_HASH = "a3e8d9b972b8a0645d16df8a2028d6e431b16cd31ebc19cda01060e75a2139f9e21c66b3296108da8f31a069455007af035f33209c383e749b74c9728b30ade1"

RPROVIDES:${PN} += "libnss_mymachines.so.2()(64bit) nss-mymachines systemd-container systemd-container(aarch-64) systemd:/usr/bin/systemd-nspawn"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/gpg /usr/bin/tar ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcurl.so.4()(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libseccomp.so.2()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) libz.so.1()(64bit) systemd"

inherit rpm
