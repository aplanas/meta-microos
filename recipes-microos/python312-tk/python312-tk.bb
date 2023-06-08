SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-tk-3.12.0a7-1.1.aarch64.rpm"
RPM_HASH = "876c928b702838e19a1fc3438dd0a11b16d46a6a3d3b63bc97ca4a75ba43c1563f66ed4d411e93f9fd15dc5efca8597b6e457714ae86961f3dd517e3ecec1a2c"

RPROVIDES:${PN} += "python312-tk python312-tk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) python(abi) python312"

inherit rpm
