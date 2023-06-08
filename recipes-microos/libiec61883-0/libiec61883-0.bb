SUMMARY = "Library implementing IEC 61883"
DESCRIPTION = "This library is an implementation of IEC 61883, part 1 (CIP, plug \
registers, and CMP), part 2 (DV-SD), part 4 (MPEG2-TS), and part 6 \
(AMDTP). Outside of IIDC, nearly all FireWire multimedia devices use \
IEC 61883 protocols. \
 \
The libiec61883 library provides a higher level API for streaming DV, \
MPEG-2 and audio over Linux IEEE 1394. This includes both reception and \
transmission. It uses the new 'rawiso' API of libraw1394, which \
transparently provides mmap-ed DMA for efficient data transfer. It also \
represents the third generation of I/O technology for Linux 1394 for \
these media types thereby removing the complexities of additional \
kernel modules, /dev nodes, and procfs. It also consolidates features \
for plug control registers and connection management that previously \
existed in experimental form in an unreleased version of libavc1394."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libiec61883-0-1.2.0-8.26.aarch64.rpm"
RPM_HASH = "96f45d0457d147dfbbe937b3582bb521d5e3bb6d11d5466fd5091efc1116843495e0bfea717d961e3842f4e5484725592571a75d6c09c3617d18d940d085d59b"

RPROVIDES:${PN} += "libiec61883-0 libiec61883-0(aarch-64) libiec61883.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libraw1394.so.11()(64bit)"

inherit rpm
