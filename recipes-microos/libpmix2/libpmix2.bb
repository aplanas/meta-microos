SUMMARY = "PMI-X lib version 1"
DESCRIPTION = "This package contains the shared library used by the PMI-X standard"
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "libpmix2-3.2.3-10.1.aarch64.rpm"
RPM_HASH = "c3bb57c8c1b06bcaac658cc01262780d065e3c1bc71695e3fc8f83d1e07b2155b134b27db682cffff223b041c146bca6c2c7386987f4758129a4c41a624797b8"

RPROVIDES:${PN} += "libpmix.so.2()(64bit) \
libpmix2 \
libpmix2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libevent_core-2.1.so.7()(64bit) \
libevent_pthreads-2.1.so.7()(64bit) \
libhwloc.so.15()(64bit) \
pmix-plugins \
pmix-runtime-config"

inherit rpm
