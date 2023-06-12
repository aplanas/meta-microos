SUMMARY = "Wireless daemon for Linux"
DESCRIPTION = "The iNet Wireless Daemon (iwd) project provides a wireless \
connectivity solution. It attempts to optimise resource utilisation \
of storage, runtime memory and link-time costs. It utilises the \
features provided by the Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4"

RPM_NAME = "iwd-2.4-1.1.aarch64.rpm"
RPM_HASH = "79de7eae91d4c8c05a47d68e65a1e3d642ad0e7b96b62d4a307628bb8901637fca97d254c2d9aa51504c6523b8097408d0b3af4bec940abdffbc393bd35ee6f1"

RPROVIDES:${PN} += "iwd iwd(aarch-64)"
RDEPENDS:${PN} += "(kmod(pkcs8_key_parser.ko) if kernel) /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libell.so.0()(64bit) libell.so.0(ELL_0.56)(64bit) libreadline.so.8()(64bit)"

inherit rpm
