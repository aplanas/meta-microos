SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-tk-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "9575e2d954b73435560f293f3ce361470c7031ca0d028751db7e6ed5968f93542197de80c2bb77144978ac864691e6bbd7ca50d25c8888754c59f2caba674352"

RPROVIDES:${PN} += "python3-tk python310-tk python310-tk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) python(abi) python310"

inherit rpm
