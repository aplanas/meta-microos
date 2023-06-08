SUMMARY = "Tools and library for mISDN"
DESCRIPTION = "This package contains libmisdn and some tools to use the mISDN driver. \
mISDN is the new modular ISDN driver for Linux."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "mISDNuser-2.1.0+2.0.22+git6-2.6.aarch64.rpm"
RPM_HASH = "51ef6cb9c2ed96435a02222f5a0355e7c250ecadcbdbdfa34889875849fe9b3ec5ae48a6f078f88387cdb4e7a2b5cf8b9f9233c955be561befcf8417ef0afa77"

RPROVIDES:${PN} += "mISDNuser mISDNuser(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcapi20.so.3()(64bit) libmisdn.so.1()(64bit)"

inherit rpm
