SUMMARY = "A complex camera support library in C++"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
A camera may consist of multiple sensors or function blocks, and can \
expose multiple kernel device nodes in /dev for different stages of \
the pipeline. The libcamera API groups and exposes these pieces as \
what users consider one 'camera'."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera0_0_4-0.0.4-2.3.aarch64.rpm"
RPM_HASH = "5c306dd5e4ef7c8cdb13ff22447402c6b4076dacfcd5582fb14f653188de46089219400b8055bce092511ad909f97cec34a8e0db65e40c2e86f701a9800a4aaa"

RPROVIDES:${PN} += "libcamera.so.0.0.4()(64bit) libcamera0_0_4 libcamera0_0_4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcamera-base.so.0.0.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libyaml-0.so.2()(64bit)"

inherit rpm
