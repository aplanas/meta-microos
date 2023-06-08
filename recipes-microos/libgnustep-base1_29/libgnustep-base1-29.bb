SUMMARY = "GNUstep Base library package"
DESCRIPTION = "The GNUstep Base Library is a library of general-purpose, \
non-graphical Objective C classes, inspired by the \
OpenStep API but implementing Apple and GNU additions to the API \
as well.  It includes, for example, classes for Unicode strings, \
arrays, dictionaries, sets, byte streams, typed coders, invocations, \
notifications, notification dispatchers, scanners, tasks, files, \
networking, threading, remote object messaging support (distributed \
objects), event loops, loadable bundles, attributed Unicode strings, \
XML, MIME, user defaults."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.29.0"

RPM_NAME = "libgnustep-base1_29-1.29.0-1.4.aarch64.rpm"
RPM_HASH = "7fd1ec2579a773dfa910b6fc6b2baf6edffbe773430c01f31f7912c7975d4107bb126fe616318fe781981a83b923ca5e2ab4de808924b5d71d0b8f81c15ec223"

RPROVIDES:${PN} += "libgnustep-base.so.1.29()(64bit) libgnustep-base1_29 libgnustep-base1_29(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libobjc.so.4()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.20)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit) libxml2.so.2(LIBXML2_2.7.0)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libz.so.1()(64bit)"

inherit rpm
