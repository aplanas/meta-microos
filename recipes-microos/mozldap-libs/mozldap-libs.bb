SUMMARY = "Mozilla LDAP C SDK"
DESCRIPTION = "The Mozilla LDAP C SDK is a set of libraries that allow applications to communicate with LDAP directory servers. \
These libraries are derived from the University of Michigan and Netscape LDAP libraries. They use Mozilla NSPR and NSS for crypto."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.0.7"

RPM_NAME = "mozldap-libs-6.0.7-4.15.aarch64.rpm"
RPM_HASH = "1394909a706165fca2f0fe84b0290f87aa9d76b422d2d4ecc9590c0f21402d5acfb48a4c21605fc8d7963361db41ffdc420409955132a45875b61e1392419a8c"

RPROVIDES:${PN} += "libldap60.so()(64bit) libldif60.so()(64bit) libprldap60.so()(64bit) libssldap60.so()(64bit) mozldap mozldap-libs mozldap-libs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.11.1)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.4)(64bit) libplc4.so()(64bit) libplds4.so()(64bit) libsasl2.so.3()(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.14)(64bit) libssl3.so(NSS_3.2)(64bit)"

inherit rpm
