SUMMARY = "Low-level library for Netfilter-related kernel/userspace communication"
DESCRIPTION = "libnfnetlink is the low-level library for netfilter related \
kernel/userspace communication. It provides a generic messaging \
infrastructure for in-kernel netfilter subsystems (such as \
nfnetlink_log, nfnetlink_queue, nfnetlink_conntrack) and their \
respective users and/or management tools in userspace."
LICENSE = "GPL-2.0-only"

PV = "1.0.2"

RPM_NAME = "libnfnetlink0-1.0.2-1.7.aarch64.rpm"
RPM_HASH = "37db814b946bb4a7ebbcf279c0d137e11971e32aec1cf7112fd86e34940aebcd8e2764e4e61d93bfc1c6690b5cc50458e4a892ac72c3886c07c05c30f76f0197"

RPROVIDES:${PN} += "libnfnetlink.so.0()(64bit) \
libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit) \
libnfnetlink0 \
libnfnetlink0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
