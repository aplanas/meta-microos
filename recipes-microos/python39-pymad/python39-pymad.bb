SUMMARY = "Python Module to use the MPEG Audio Decoder Library"
DESCRIPTION = "pymad is a Python module that allows Python programs to use the MPEG Audio \
Decoder library. pymad provides a high-level API, similar to the pyogg module, \
allowing to read PCM data from MPEG audio streams."
LICENSE = "LGPL-2.0+"

PV = "0.10"

RPM_NAME = "python39-pymad-0.10-1.26.aarch64.rpm"
RPM_HASH = "75730efcf63771d57911334c056869369e6dad0492b9741c50b89eb2a5375a6c224ca7048985b7f269097a8d6b726ea0707489b89efaf6c83e201acf293e6d87"

RPROVIDES:${PN} += "python3.9dist(pymad) python39-pymad python39-pymad(aarch-64) python3dist(pymad)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libmad.so.0()(64bit) python(abi)"

inherit rpm
