SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python311-pycdio-2.1.1-1.5.aarch64.rpm"
RPM_HASH = "404ca93d18f3b4bf58fc7dd6453f1519fffb00866af41e695ea46a79a87ff987cfd056c6823cae3449d6aadcd165906283afeaa9176ad8108b0592d940588d10"

RPROVIDES:${PN} += "python3.11dist(pycdio) python311-pycdio python311-pycdio(aarch-64) python3dist(pycdio)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdio.so.19()(64bit) libcdio.so.19(CDIO_19)(64bit) libiso9660.so.11()(64bit) libiso9660.so.11(ISO9660_11)(64bit) python(abi)"

inherit rpm
