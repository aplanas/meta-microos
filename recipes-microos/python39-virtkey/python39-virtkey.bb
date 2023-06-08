SUMMARY = "Python extension to emulate keypresses"
DESCRIPTION = "python-virtkey is a python extension for emulating keypresses and \
getting the keyboard geometry from the xserver."
LICENSE = "LGPL-3.0+"

PV = "0.63.0"

RPM_NAME = "python39-virtkey-0.63.0-9.31.aarch64.rpm"
RPM_HASH = "990de97a775dfddc735731b6630ce6095488df6422b1668be945ecff59ce458da606557cfc554cd2ee80c3bc3cf886ea9e4940f9ec239b23e4c70a20c533f407"

RPROVIDES:${PN} += "python3.9dist(virtkey) python39-virtkey python39-virtkey(aarch-64) python3dist(virtkey)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXtst.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-x11-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libxkbfile.so.1()(64bit) python(abi)"

inherit rpm
