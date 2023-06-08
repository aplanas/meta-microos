SUMMARY = "Libpurple third-party plugin for MS Skype for Business"
DESCRIPTION = "A third-party plugin for the libpurple multi-protocol instant \
messaging library. It implements the extended version of SIP/SIMPLE \
used by various products: \
 * Skype for Business. \
 * Microsoft Office 365. \
 * Microsoft Business Productivity Online Suite (BPOS). \
 * Microsoft Lync Server. \
 * Microsoft Office Communications Server (OCS 2007/2007 R2). \
 * Microsoft Live Communications Server (LCS 2003/2005). \
 * Reuters Messaging."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "libpurple-plugin-sipe-1.25.0-2.10.aarch64.rpm"
RPM_HASH = "f3b583c9401fd4dd412ceef8900d9421f0d3dffa378cf91ee5d66b97c541550b6677a09321bd546878ad78c58f4b0d0258a05a808974049c91731ecb60da7941"

RPROVIDES:${PN} += "libpurple-plugin-sipe libpurple-plugin-sipe(aarch-64) libsipe.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libfarstream-0.2.so.5()(64bit) libfreerdp-shadow-subsystem2.so.2()(64bit) libfreerdp-shadow2.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmime-3.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libgstreamer-1.0.so.0()(64bit) libgstrtp-1.0.so.0()(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.5)(64bit) libnss3.so(NSS_3.6)(64bit) libnss3.so(NSS_3.9.2)(64bit) libpurple.so.0()(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.4)(64bit) libwinpr2.so.2()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
