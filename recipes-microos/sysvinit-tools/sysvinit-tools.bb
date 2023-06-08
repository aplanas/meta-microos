SUMMARY = "Tools for basic booting"
DESCRIPTION = "Helper tools from sysvinit that support booting, including but not exclusive \
to startpar and killproc. System V init specific programs are in the \
sysvinit package."
LICENSE = "GPL-2.0-or-later"

PV = "3.00"

RPM_NAME = "sysvinit-tools-3.00-5.1.aarch64.rpm"
RPM_HASH = "98a290ec82a86d5fdc0a8e758033ebca079360e0a8243bab9c047b4bd44031dac5ba02032e252585f74649a4141c971831e8597bba5d6c24d77740e23386a407"

RPROVIDES:${PN} += "/sbin/start_daemon /sbin/startproc sysvinit-tools sysvinit-tools(aarch-64)"
RDEPENDS:${PN} += "blog ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblogger.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
