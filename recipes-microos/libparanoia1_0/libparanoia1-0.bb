SUMMARY = "Compact Disc Digital audio extraction library"
DESCRIPTION = "libparanoia is a Compact Disc Digital Audio (CD-DA) Digital Audio \
Extraction (DAE) library for reading audio from the CD-ROM directly \
as data, with no analog step between. Cdparanoia can read audio data \
from inexpensive drives prone to misalignment, frame jitter and loss \
of streaming during atomic reads, and attempt to repair data from CDs \
that have been damaged in some way by use of the error correction \
stored on the disc."
LICENSE = "LGPL-2.1-only"

PV = "3.02~a10"

RPM_NAME = "libparanoia1_0-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "89b5ee1de0b5235c3fb8f42e0febaedfc7e6e919bd08cfecf2d143fec01e38a427d6e4d43b5abbe259fca0c684abd3f1a00fbe64ff11499d5a1178b2a4f7b1ff"

RPROVIDES:${PN} += "libparanoia.so.1.0()(64bit) libparanoia.so.1.0(SCHILY_1.0)(64bit) libparanoia.so.1.0(SCHILY_1.1)(64bit) libparanoia1_0 libparanoia1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libschily.so.2.0()(64bit) libschily.so.2.0(SCHILY_1.0)(64bit)"

inherit rpm
