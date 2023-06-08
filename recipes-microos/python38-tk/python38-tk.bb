SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-tk-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "cd2502764da86b24c0372f97e990952b5961826b1b07c07cebc401bd682b257a2d7ecfc9fa62574be0a97ae3d9fa8fc427dd990e5a9429764c14688396f777c0"

RPROVIDES:${PN} += "python38-tk python38-tk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) python(abi) python38"

inherit rpm
