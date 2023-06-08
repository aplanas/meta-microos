SUMMARY = "CMU-Cambridge Statistical Language Modeling toolkit"
DESCRIPTION = "The CMU-Cambridge Language Modeling Toolkit is a free set of tools \
for constructing and testing statistical N-Gram language models. \
These models have various applications including speech recognition, \
machine translation, optical character and handwriting recognition. \
 \
This package contains the shared library used by the CMU-Cambridge \
Language Model Toolkit."
LICENSE = "AFL-2.1 & BSD-3-Clause"

PV = "0.7"

RPM_NAME = "libcmuclmtk0-0.7-11.21.aarch64.rpm"
RPM_HASH = "8998bf25ef95c30c93adc5ca7d947243518d9240907f32198a01779f9b5e2b51e3302e3d9590398f49beb31172847b387003f8364878e8dcec4e49c2b12f2b66"

RPROVIDES:${PN} += "libcmuclmtk.so.0()(64bit) libcmuclmtk0 libcmuclmtk0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
