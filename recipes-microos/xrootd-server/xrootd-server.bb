SUMMARY = "XRootD (eXtended Root Daemon) server"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
The XRootD (eXtended Root Daemon) server binaries."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-server-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "c70bca3ba72311033da314443bea6cea1b6cb1935d62aaec43ffc7357546393420da135e5435f0d179c84f45f0e28c3db8d8159d820e90cef7fe8426b36e0270"

RPROVIDES:${PN} += "config(xrootd-server) group(xrootd) perl(XrdCmsNotify) user(xrootd) xrootd-server xrootd-server(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libXrdAppUtils.so.2()(64bit) libXrdCl.so.3()(64bit) libXrdCrypto.so.2()(64bit) libXrdServer.so.3()(64bit) libXrdUtils.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) sysuser-shadow xrootd-client-libs xrootd-libs xrootd-server-libs"

inherit rpm
