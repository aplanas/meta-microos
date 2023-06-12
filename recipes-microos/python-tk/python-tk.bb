SUMMARY = "TkInter - Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-tk-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "1ad4b9822a916e1bf76c9ae3a635d27adf57ebbf2f0481981693d6297f1197ea0db4af333ad17462023b04f75b59fd7d42bc6bbdf52b381c236bff26cfc670a7"

RPROVIDES:${PN} += "pyth_tk pyth_tkl python-tk python-tk(aarch-64) python-tkinter python2-tk python_tkinter_lib"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython2.7.so.1.0()(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) python-base"

inherit rpm
