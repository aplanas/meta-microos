SUMMARY = "Tools for libvterm"
DESCRIPTION = "This package contains tools for libvterm."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "libvterm-tools-0.3.1-1.3.aarch64.rpm"
RPM_HASH = "c2b43a0396d974cdc8d901b814c7ceb8aff2ac9952ba78a6d49c5f8e004d76407b530c7651c52e1eb9d35387a00aaf60c416ed24cecc8a82ba9d6ac940387a46"

RPROVIDES:${PN} += "libvterm-tools libvterm-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libvterm.so.0()(64bit)"

inherit rpm
