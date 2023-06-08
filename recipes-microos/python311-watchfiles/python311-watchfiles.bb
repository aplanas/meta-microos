SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python311-watchfiles-0.15.0-1.9.aarch64.rpm"
RPM_HASH = "8bd03257166938a1ef48da8fcd441558b5aa56badc3cd229be1fba4f86dd7de537b7585dfaeba3e93b10a2bf94274aaefe5995d5fd9058e4da468f1625e1a613"

RPROVIDES:${PN} += "python3.11dist(watchfiles) python311-watchfiles python311-watchfiles(aarch-64) python3dist(watchfiles)"
RDEPENDS:${PN} += "(python311-anyio >= 3.0.0 with python311-anyio < 4) /bin/sh /usr/bin/python3.11 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi) update-alternatives"

inherit rpm
