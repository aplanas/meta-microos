SUMMARY = "Utilities for configuring gaming mice"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the ratbag utilities allowing to inspect and configure \
mice."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "libratbag-tools-0.17-1.3.aarch64.rpm"
RPM_HASH = "7d23a471b681c263a5cc95936a61e86e171f9732bdf875ae6dacdaa6aed51f6653bf2c71a2bcc1bd45f356a3ee01fbc10e3d57da96e9baf2c8c73155fb47b6cb"

RPROVIDES:${PN} += "libratbag-tools libratbag-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblur.so.3()(64bit) liblur.so.3(LIBLUR_0.4.0)(64bit) python3-evdev ratbagd"

inherit rpm
