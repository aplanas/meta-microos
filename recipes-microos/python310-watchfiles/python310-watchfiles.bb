SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python310-watchfiles-0.15.0-1.9.aarch64.rpm"
RPM_HASH = "2ec054afc0b8e3f07afcfe2070113f902971afd16d9be044335f882b13d57765204ea4fbc05d262c37bfea0f0d490b5e57a8a9ebe27166d291fec73eeb7a804a"

RPROVIDES:${PN} += "python3-watchfiles python3.10dist(watchfiles) python310-watchfiles python310-watchfiles(aarch-64) python3dist(watchfiles)"
RDEPENDS:${PN} += "(python310-anyio >= 3.0.0 with python310-anyio < 4) /bin/sh /usr/bin/python3.10 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi) update-alternatives"

inherit rpm
