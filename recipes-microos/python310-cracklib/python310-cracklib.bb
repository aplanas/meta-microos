SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0+"

PV = "2.9.3"

RPM_NAME = "python310-cracklib-2.9.3-2.29.aarch64.rpm"
RPM_HASH = "5bb3ed617bd6af3c97fc1e1b996394feac7ecbb323d37d6a157b27ec3f166e889e091b1d0a11249a6485305da7d38d53661b298e802f8aefaf2a8d53e6b374f5"

RPROVIDES:${PN} += "python3-cracklib python3.10dist(cracklib) python310-cracklib python310-cracklib(aarch-64) python3dist(cracklib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrack.so.2()(64bit) python(abi)"

inherit rpm
