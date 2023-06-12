SUMMARY = "FUSE-based XRootD filesystem mount"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains the FUSE (file system in user space) \
XRootD mount tool."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.4"

RPM_NAME = "xrootd-fuse-5.5.4-1.1.aarch64.rpm"
RPM_HASH = "04157d15ed6fc773e16b60251709e772f0fd1e8b8b87bf1858900e72eb3ca35b1dd46ddaa82d84e555b1959a05de3a669c8593742da8a2b7f429302e83d091f3"

RPROVIDES:${PN} += "xrootd-fuse \
xrootd-fuse(aarch-64)"
RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libXrdFfs.so.3()(64bit) \
libXrdPosix.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
xrootd-client \
xrootd-libs"

inherit rpm
