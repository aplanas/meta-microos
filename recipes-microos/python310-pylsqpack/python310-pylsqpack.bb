SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.16"

RPM_NAME = "python310-pylsqpack-0.3.16-1.4.aarch64.rpm"
RPM_HASH = "9aca8ae3299a2f70b46700d3d4b4c9ba6558b12d124e4dc1e4854e8b2199f320bbe7b05c1dba61dcc5c2853141a2aa7edd7a2bf37cd28c7c19ae3039d9f691ef"

RPROVIDES:${PN} += "python3-pylsqpack python3.10dist(pylsqpack) python310-pylsqpack python310-pylsqpack(aarch-64) python3dist(pylsqpack)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
