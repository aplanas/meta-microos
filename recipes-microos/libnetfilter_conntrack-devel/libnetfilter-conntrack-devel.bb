SUMMARY = "Userspace library for the in-kernel connection tracking state table"
DESCRIPTION = "libnetfilter_conntrack is a userspace library providing a programming \
interface (API) to the in-kernel connection tracking state table. The \
library libnetfilter_conntrack has been previously known as \
libnfnetlink_conntrack and libctnetlink. This library is currently \
used by conntrack-tools among many other applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.9"

RPM_NAME = "libnetfilter_conntrack-devel-1.0.9-1.6.aarch64.rpm"
RPM_HASH = "040b29f3618d52b60b0bed716c469f6eb9eea0768bd0aecc3e5f73ac5f841e8a4eeb91c192be8267aa0178fbd7a03b050d272787fcdfa02c108045eec9df8d8d"

RPROVIDES:${PN} += "libnetfilter_conntrack-devel \
libnetfilter_conntrack-devel(aarch-64) \
pkgconfig(libnetfilter_conntrack)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnetfilter_conntrack3 \
pkgconfig(libnfnetlink)"

inherit rpm
