SUMMARY = "Headers for the TVM Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators. \
 \
This package contains the headers."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "tvm-devel-0.11.0-2.6.aarch64.rpm"
RPM_HASH = "3851c761528f9ff9d65684ecf639e56aed9da0876ceb03515b278402882cac1b25bf0ff988f69c3e42ad16c322fd7df2927bbbf8c8f5adb39132d4911d49df40"

RPROVIDES:${PN} += "cmake(tvm) \
tvm-devel \
tvm-devel(aarch-64)"
RDEPENDS:${PN} += "libtvm"

inherit rpm
