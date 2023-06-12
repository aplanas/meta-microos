SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-tk-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "d3dde2a128f7412075e9b04fb468095151d36dd0a94d88cf39c8693f7a7f991d6166fdf4759343bd13a38575b46bdb9eabc9516d0b816db41d1e9b0a37f4df69"

RPROVIDES:${PN} += "python311-tk \
python311-tk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libtcl8.6.so()(64bit) \
libtk8.6.so()(64bit) \
python(abi) \
python311"

inherit rpm
