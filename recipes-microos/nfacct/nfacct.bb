SUMMARY = "Netfilter Extended Accounting utility"
DESCRIPTION = "This utility allows you to manipulate the extended accounting \
infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "nfacct-1.0.2-2.10.aarch64.rpm"
RPM_HASH = "cd5634ff894a1bc751df2a9520226df4fd687f90e64ef1a4883e08b4e35200c61ddbfc66e7fcec9985507a4f08a4e07bd5d472d881584fe04ca4ead1ebe1ca16"

RPROVIDES:${PN} += "nfacct nfacct(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit) libnetfilter_acct.so.1()(64bit) libnetfilter_acct.so.1(LIBNETFILTER_ACCT_1.0)(64bit) libnetfilter_acct.so.1(LIBNETFILTER_ACCT_1.1)(64bit)"

inherit rpm
