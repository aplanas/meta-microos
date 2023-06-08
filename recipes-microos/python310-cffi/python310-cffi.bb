SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python310-cffi-1.15.1-4.1.aarch64.rpm"
RPM_HASH = "6c155acc2b02bf697a710f67d80a45a3df82e1fc16a28010b171db42c4e0d2809aef2ba7e3cc8acc5dd6581d74470c362343da3709314e59a18340917bca072e"

RPROVIDES:${PN} += "python3-cffi python3.10dist(cffi) python310-cffi python310-cffi(aarch-64) python3dist(cffi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) python(abi) python310-pycparser"

inherit rpm
