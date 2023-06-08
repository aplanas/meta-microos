SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-tk-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "2cdf6771f46e5ddbfd17ad60d7c62708f4372ab5546c502f9f4011cb4b99363d9f3f1cac1bc0b67ebae8b815a0be2260e6fe183437bfe31fb3105051b44969cd"

RPROVIDES:${PN} += "python39-tk python39-tk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) python(abi) python39"

inherit rpm
