SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "python3-lldb16-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "76d3b531e553a7e96bf23bb9c3790a7f3a0be9e4ddc39823943b8e3fc4c81f1010a90a32d9afb3f3f50181b249084d5636afe32fb6d7c450805f1897345f318a"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/lldb/ python3-lldb16 python3-lldb16(aarch-64)"
RDEPENDS:${PN} += "liblldb16 python(abi) python3-base python3-six"

inherit rpm
