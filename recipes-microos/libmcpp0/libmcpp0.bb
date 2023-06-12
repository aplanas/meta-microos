SUMMARY = "The shared library of Matsui's C Preprocessor"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98. \
 \
This package holds the shared libraries of libev."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "libmcpp0-2.7.2-24.14.aarch64.rpm"
RPM_HASH = "7ac84d8b19baf8b032b1a76502419cc1b0c749c0f79bf6be86a7c585375764ecc6403c28f971755bdfa8e5741ca48deab6c31b2a18c43129603f5fa286957a12"

RPROVIDES:${PN} += "libmcpp.so.0()(64bit) \
libmcpp0 \
libmcpp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
