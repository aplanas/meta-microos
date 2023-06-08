SUMMARY = "Wireless daemon for Linux"
DESCRIPTION = "The iNet Wireless Daemon (iwd) project provides a wireless \
connectivity solution. It attempts to optimise resource utilisation \
of storage, runtime memory and link-time costs. It utilises the \
features provided by the Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3"

RPM_NAME = "iwd-2.3-1.3.aarch64.rpm"
RPM_HASH = "7eed36fbe4503567e4235ffe60d5e55c835cf7514c30bf5172950c58064ff8f0ca43e94b9444a995d775ec6513423ef7335b020f62be333a04cf106dcc5691ad"

RPROVIDES:${PN} += "iwd iwd(aarch-64)"
RDEPENDS:${PN} += "(kmod(pkcs8_key_parser.ko) if kernel) /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libell.so.0()(64bit) libell.so.0(ELL_0.56)(64bit) libreadline.so.8()(64bit)"

inherit rpm
