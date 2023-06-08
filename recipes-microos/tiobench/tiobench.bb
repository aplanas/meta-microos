SUMMARY = "Fully-threaded I/O benchmark program"
DESCRIPTION = "A simple multithreaded I/O benchmark, popular amongst kernel developers. \
The results tend to be realistic enough to have some bearing on real \
world results, while the tests are simple enough for kernel engineers to \
analyze changes ..."
LICENSE = "GPL-2.0-only"

PV = "0.4.1"

RPM_NAME = "tiobench-0.4.1-4.9.aarch64.rpm"
RPM_HASH = "ee49c8de1cc2b3c58da385d7a43547ec175b49347f5600b62a9fefe8e5648592ded10b699e2b2ba35922f2cc43c00436cbe52eccd1e4218275d28f2069d30561"

RPROVIDES:${PN} += "tiobench tiobench(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
