SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python311-lhafile-0.2.2-1.24.aarch64.rpm"
RPM_HASH = "ca2c22a2fdf03d549e5da5b838a7fc33db1fc0ac53e7acbb3eeca49f61b29f363585e87061e0538061f26a177870481d28b268a6ab6fc946d6c73f87317765c7"

RPROVIDES:${PN} += "python3.11dist(lhafile) \
python311-lhafile \
python311-lhafile(aarch-64) \
python3dist(lhafile)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
