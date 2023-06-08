SUMMARY = "Network access framework for IPv4/IPv6"
DESCRIPTION = "net6 is a library which eases the development of network-based \
applications as it provides a TCP protocol abstraction for C++. It is \
portable to both the Windows and Unix-like platforms."
LICENSE = "LGPL-2.1+"

PV = "1.3.14"

RPM_NAME = "net6-devel-1.3.14-12.26.aarch64.rpm"
RPM_HASH = "138a004243ca76ea454bf2054935d618d16be2f95fd0b47df652a490faf37671adb5d86d959737fd8f7223c580b5fc20dcfa10d953d0fd8cbee0a0ccdae851f1"

RPROVIDES:${PN} += "net6-devel net6-devel(aarch-64) pkgconfig(net6-1.3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnutls-devel libsigc++2-devel net6 pkgconfig(sigc++-2.0)"

inherit rpm
