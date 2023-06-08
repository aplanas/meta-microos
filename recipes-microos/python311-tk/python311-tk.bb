SUMMARY = "TkInter, a Python Tk Interface"
DESCRIPTION = "Python interface to Tk. Tk is the GUI toolkit that comes with Tcl."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "python311-tk-3.11.2-1.2.aarch64.rpm"
RPM_HASH = "08f0e510ea54a511c20b4f3cdec714fed88bbd2713d4353d9ff6b30dfb919b5c7adcbd0af4cb41e9bdc1081160a50a3016f5aa56842a078ff51aac35f70cfe8e"

RPROVIDES:${PN} += "python311-tk python311-tk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit) python(abi) python311"

inherit rpm
