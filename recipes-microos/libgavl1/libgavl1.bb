SUMMARY = "Library which provides basic support for uncompressed multimedia data"
DESCRIPTION = "Gavl is short for Gmerlin Audio Video Library. It is a low level library, upon \
which multimedia APIs can be built. Gavl handles all the details of audio and \
video formats like colorspaces, samplerates, multichannel configurations etc. It \
provides standardized definitions for those formats as well as container \
structures for carrying audio samples or video images inside an application. \
 \
In addition, it handles the sometimes ugly task to convert between all these \
formats and provides some elementary operations (copying, scaling, alpha"
LICENSE = "GPL-3.0+"

PV = "1.4.0rsvn4256"

RPM_NAME = "libgavl1-1.4.0rsvn4256-2.30.aarch64.rpm"
RPM_HASH = "f87a4ec2f5d96c3767d9e3f09275351c6b348097d09944b72c421183564f5bed313e68893ca84bb39cdb8f881bd4562f7fd7b328cbdc74d54329c20146120605"

RPROVIDES:${PN} += "libgavl.so.1()(64bit) libgavl1 libgavl1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
