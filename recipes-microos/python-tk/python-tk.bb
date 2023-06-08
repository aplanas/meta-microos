SUMMARY = "TkInter - Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-tk-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "0917a34bfff59624a8d5ec1fb2df038c47fffc7ec86e7e244f0bdbc90af9c5873ba1945ae260b88f40f2174e1405d2f95dacbeb15da0d3cc0887ff28c7c3def1"

RPROVIDES:${PN} += "pyth_tk pyth_tkl python-tk python-tk(aarch-64) python-tkinter python2-tk python_tkinter_lib"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython2.7.so.1.0()(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) python-base"

inherit rpm
