SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "9.5.0"

RPM_NAME = "python311-Pillow-tk-9.5.0-2.1.aarch64.rpm"
RPM_HASH = "e666545fcfe11216795a9105664e1dc2e2266956f7a48d6284ea89b3b57e6355ea7f8db8288aba70df5f0d1aca72a102d1ae984312c87b11c6855aeee519a0ab"

RPROVIDES:${PN} += "python311-Pillow-tk python311-Pillow-tk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) python(abi) python311-Pillow python311-tk"

inherit rpm
