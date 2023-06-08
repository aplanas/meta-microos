SUMMARY = "Headers for the TVM Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators. \
 \
This package contains the headers."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "tvm-devel-0.11.0-2.5.aarch64.rpm"
RPM_HASH = "01b9f9c9052a2ff8a284c08f04d1f860cb072240b4935852e33d63daa9cc2e1897db6e6c00b028e737f479e92b1b6f454005bc3c952a48c5cd6cf0e3108e28c9"

RPROVIDES:${PN} += "cmake(tvm) tvm-devel tvm-devel(aarch-64)"
RDEPENDS:${PN} += "libtvm"

inherit rpm
