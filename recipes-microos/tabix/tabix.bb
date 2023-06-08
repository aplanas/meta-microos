SUMMARY = "Generic indexer for TAB-delimited genome position files from the HTSlib project"
DESCRIPTION = "HTSlib is an implementation of a unified C library for accessing common file formats, such as \
SAM, CRAM and VCF, used for high-throughput sequencing data, and is the core library used by \
samtools and bcftools. \
HTSlib implements a generalized BAM index, with file extension .csi (coordinate-sorted index). \
The HTSlib file reader first looks for the new index and then for the old if the new index is absent. \
This project also includes the popular tabix indexer, which indexes both .tbi and .csi formats, and \
the bgzip compression utility."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "tabix-1.16-1.3.aarch64.rpm"
RPM_HASH = "ed86774a11f0ccada315713d8319c899054942ec2860b870cac9b2a2d7a279ceffa6e08970843db8cf583b460ba4dc33dca5ad60990c95c9d34a75179cc964ed"

RPROVIDES:${PN} += "tabix tabix(aarch-64)"
RDEPENDS:${PN} += "bgzip ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libhts3 libhtscodecs.so.2()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit)"

inherit rpm
