SUMMARY = "An Audio File Library"
DESCRIPTION = "This audio file library is an implementation of the SGI audio file \
library. At present, not all features of the SGI audio file library are \
implemented. \
 \
This library allows the processing of audio data to and from audio \
files of many common formats (currently AIFF, AIFC, WAVE, and \
NeXT/Sun)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.3.6"

RPM_NAME = "libaudiofile1-0.3.6-11.20.aarch64.rpm"
RPM_HASH = "2f63988958d9089ad55d741e3822e56c1720266f86cb3ab83b6b3db5624a3364380bd2f8d0092d2786608bd32590bdbe34b187019c535fdb8a1f854f31e009db"

RPROVIDES:${PN} += "libaudiofile.so.1()(64bit) libaudiofile1 libaudiofile1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
