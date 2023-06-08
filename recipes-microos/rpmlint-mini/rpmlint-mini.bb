SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230502.1ab1dde"

RPM_NAME = "rpmlint-mini-2.4.0+git20230502.1ab1dde-10.17.aarch64.rpm"
RPM_HASH = "c99781a962f4f9cb36ac930ce1c3779c6a98bee04b3b29f1c94adfd330b674aa69ce38531795ea7f665a72643b35663457397f54919c880adf0b9a069f1c665c"

RPROVIDES:${PN} += "rpmlint-mini rpmlint-mini(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl cpio ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) polkit-default-privs"

inherit rpm
