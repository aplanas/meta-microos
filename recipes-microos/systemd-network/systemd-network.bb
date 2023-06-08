SUMMARY = "systemd network and Network Name Resolution managers"
DESCRIPTION = "systemd-networkd is a system service that manages networks. It detects and \
configures network devices as they appear, as well as manages network addresses \
and routes for any link for which it finds a .network file, see \
systemd.network(5). It can also create virtual network devices based on their \
description given by systemd.netdev(5) files. It may be controlle by \
networkctl(1). \
 \
systemd-resolved is a system service that provides network name resolution to \
local applications. It implements a caching and validating DNS/DNSSEC stub \
resolver, as well as an LLMNR and MulticastDNS resolver and responder. It may be \
controlled by resolvectl(1). \
 \
Addtionally, this package also contains a plug-in module for the Name Service \
Switch (NSS), which enables hostname resolutions by contacting \
systemd-resolved(8). It replaces the nss-dns plug-in module that traditionally \
resolves hostnames via DNS. \
 \
To activate this NSS module, you will need to include it in /etc/nsswitch.conf, \
see nss-resolve(8) manpage for more details."
LICENSE = "LGPL-2.1-or-later"

PV = "253.4"

RPM_NAME = "systemd-network-253.4-1.2.aarch64.rpm"
RPM_HASH = "5b76ad1794db3fccd19cbaceeefd15c9be9827d06962fd70f908ebb523b48dfabed39d005497fbc4ea6c65d4123752cc8635f22623af6bd303a7f3235f1a168c"

RPROVIDES:${PN} += "config(systemd-network) libnss_resolve.so.2()(64bit) nss-resolve systemd-network systemd-network(aarch-64) systemd:/usr/lib/systemd/systemd-networkd systemd:/usr/lib/systemd/systemd-resolved"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgpg-error.so.0()(64bit) libgpg-error.so.0(GPG_ERROR_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd-shared-253.so()(64bit) libsystemd-shared-253.so(SD_SHARED)(64bit) systemd"

inherit rpm
