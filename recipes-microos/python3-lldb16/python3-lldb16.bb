SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings for LLDB. It also contains \
pretty printers for the C++ standard library."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "python3-lldb16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "79f7b3997058eadcb25db57364744e92ff450a1e009d0f65a01896dd7137894b99bef0346c2f9ffecc6c1791364eaa4169832bdd21d61c7a1926acf1cdc52bbd"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/lldb/ python3-lldb16 python3-lldb16(aarch-64)"
RDEPENDS:${PN} += "liblldb16 python(abi) python3-base python3-six"

inherit rpm
