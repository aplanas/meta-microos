SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "python3-clang13-13.0.1-8.1.noarch.rpm"
RPM_HASH = "e318b133021d0e21ec0af4b07c15774a4584f0f16fdffd0f6eff0d217becf8ceac987cae0169b1b9db8105eb46e1694db19855a1a27d8654807ca600fc1a1d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/clang/ python3-clang13"
RDEPENDS:${PN} += "libclang13 python(abi) python3-base"

inherit rpm
