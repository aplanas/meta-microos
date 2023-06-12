SUMMARY = "Tools for manipulating next-generation sequencing data"
DESCRIPTION = "Samtools implements various utilities for post-processing alignments in the \
SAM, BAM, and CRAM formats, including indexing, variant calling (in conjunction \
with bcftools), and a simple alignment viewer."
LICENSE = "MIT"

PV = "1.16.1"

RPM_NAME = "samtools-1.16.1-1.3.aarch64.rpm"
RPM_HASH = "88a66daa1f45a18dc77ae9a872b08df35756e10fd5b5166d096f40024712670a27d10efd8d4fc02d714f80733c538884f661216d13af49c6eb6ef6ca4a87199b"

RPROVIDES:${PN} += "samtools \
samtools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
bgzip \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhts.so.3()(64bit) \
libhts3 \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libz.so.1()(64bit) \
perl \
tabix"

inherit rpm
