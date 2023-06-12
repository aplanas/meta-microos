SUMMARY = "Utilities for configuring gaming mice"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the ratbag utilities allowing to inspect and configure \
mice."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libratbag-tools-0.17-2.1.aarch64.rpm"
RPM_HASH = "d91f201b777566fed1d67b417b940528caa5bd2c74198d46c3f01b595f3f13c8ea69a338bccb2385a0ac2769dd8927db08ff66ae161d5929172ccc6b3b666bca"

RPROVIDES:${PN} += "libratbag-tools \
libratbag-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblur.so.3()(64bit) \
liblur.so.3(LIBLUR_0.4.0)(64bit) \
python3-evdev \
ratbagd"

inherit rpm
