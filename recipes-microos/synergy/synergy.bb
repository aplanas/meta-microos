SUMMARY = "Mouse, keyboard and clipboard sharing utility"
DESCRIPTION = "Synergy lets you easily share a single mouse and keyboard between \
multiple computers with different operating systems, each with its own \
display, without special hardware.  It's intended for users with \
multiple computers on their desk since each system uses its own \
display. \
 \
Redirecting the mouse and keyboard is as simple as moving the mouse off \
the edge of your screen.  Synergy also merges the clipboards of all the \
systems into one, allowing cut-and-paste between systems. Furthermore, \
it synchronizes screen savers so they all start and stop together and, \
if screen locking is enabled, only one screen requires a password to \
unlock them all."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.1"

RPM_NAME = "synergy-1.9.1-4.9.aarch64.rpm"
RPM_HASH = "d50e0862d62233d292d6004ba0d9a5f8ed24d563ff7679abcafc44212e39c286e056605a2a0e01fd8cce87bed5c947b6599a3d542a1fd36ed498a22120b07e22"

RPROVIDES:${PN} += "config(synergy) synergy synergy(aarch-64) synergy-core synergy-plus"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXi.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
