SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit) network functions."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjacknet0-1.9.22-1.1.aarch64.rpm"
RPM_HASH = "a5e528e62bf9d5749bbcc7a5377929b7d2bff6b6bcd46dab48d7a176d50f5c6477134964e1eefeacd98a74f488c2d950c04adb14c778c955001b7a194768ed31"

RPROVIDES:${PN} += "libjack0:/usr/lib64/libjacknet.so.0* libjacknet.so.0()(64bit) libjacknet0 libjacknet0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcelt0.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libopus.so.0()(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
