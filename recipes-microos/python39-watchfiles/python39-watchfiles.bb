SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python39-watchfiles-0.15.0-1.9.aarch64.rpm"
RPM_HASH = "5b2349b9be3e2f62745c9477c2a400374583c64d993abed1131e463919ae80a58f14865a979db7f3f2f96a3cc4b09cffdd740396d4483c49de42e0259b180c23"

RPROVIDES:${PN} += "python3.9dist(watchfiles) python39-watchfiles python39-watchfiles(aarch-64) python3dist(watchfiles)"
RDEPENDS:${PN} += "(python39-anyio >= 3.0.0 with python39-anyio < 4) /bin/sh /usr/bin/python3.9 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi) update-alternatives"

inherit rpm
