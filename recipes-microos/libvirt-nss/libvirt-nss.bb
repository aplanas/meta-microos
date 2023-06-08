SUMMARY = "Libvirt plugin for Name Service Switch"
DESCRIPTION = "libvirt plugin for NSS for translating domain names into IP addresses."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-nss-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "73a76698841dff4ea26c2858105ce83d3bc710edc221435846148df49850d4a1c10b14c5f2f7ad092c3fde80598eabd60ba78adb725e6eda1cbc61882c541c56"

RPROVIDES:${PN} += "libnss_libvirt.so.2()(64bit) libnss_libvirt_guest.so.2()(64bit) libvirt-nss libvirt-nss(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libvirt-daemon-driver-network libyajl.so.2()(64bit)"

inherit rpm
