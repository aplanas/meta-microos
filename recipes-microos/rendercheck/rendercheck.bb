SUMMARY = "Program to test a Render extension implementation"
DESCRIPTION = "rendercheck is a program to test a Render extension implementation \
against separate calculations of expected output."
LICENSE = "HPND"

PV = "1.5"

RPM_NAME = "rendercheck-1.5-1.26.aarch64.rpm"
RPM_HASH = "1db33f02c89ca95124d1d8114de348f3a4428a10fb496e756c0ecd4212cd74b8afeb67ef4dfd05072f9cc9cad4b1530e78b5bb6dba819e8b7e7b7e7e5063ed7a"

RPROVIDES:${PN} += "rendercheck \
rendercheck(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
