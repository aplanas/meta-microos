SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0+"

PV = "2.9.3"

RPM_NAME = "python311-cracklib-2.9.3-2.29.aarch64.rpm"
RPM_HASH = "ecd996f3bad3463cb1b2631dadb5b32b732d05dac98df745ceda988fa0275ffe41177e9e0b05b159a6e258b50dc7f8ffd03f6e62f3f38ac3dd63d7e5dba0bdf1"

RPROVIDES:${PN} += "python3.11dist(cracklib) python311-cracklib python311-cracklib(aarch-64) python3dist(cracklib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrack.so.2()(64bit) python(abi)"

inherit rpm
