SUMMARY = "Command line utilities from libyuv"
DESCRIPTION = "libyuv is a project for YUV image scaling and conversion. It can \
convert between RGB and YUV, scale images with point/bilinear/box \
filter, rotate by 90/180/270°, and offers SSE/NEON/MSA acceleration. \
 \
This package contains the yuvconvert and yuvconstants commandline programs."
LICENSE = "BSD-3-Clause"

PV = "20230517+a377993"

RPM_NAME = "libyuv-tools-20230517+a377993-1.1.aarch64.rpm"
RPM_HASH = "ceaddb2e525447fad71780efeb8cfcf7d87dad499c67632a78712348c8afd142167a35e486d5a3773eb261274a382d8e876e843c4db5283056de4f74b88f8a74"

RPROVIDES:${PN} += "libyuv-tools libyuv-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libyuv.so.0()(64bit)"

inherit rpm
