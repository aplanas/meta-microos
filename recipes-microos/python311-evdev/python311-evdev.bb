SUMMARY = "Python bindings to the Linux input handling subsystem"
DESCRIPTION = "python-evdev provides bindings to the generic input event interface \
in Linux. The evdev interface serves the purpose of passing events \
generated in the kernel directly to userspace through character \
devices that are typically located in /dev/input/. \
 \
This package also comes with bindings to uinput, the userspace input \
subsystem. Uinput allows userspace programs to create and handle \
input devices that can inject events directly into the input \
subsystem."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "python311-evdev-1.6.1-1.4.aarch64.rpm"
RPM_HASH = "6592ed6dabed15d84af679f9e2a34e97ed19c15383f8c136da23f474014fc09c852aaec39bcb84ab367a6278cfd9dd175334369549b9f424e306f3c5fb1b0359"

RPROVIDES:${PN} += "python3.11dist(evdev) \
python311-evdev \
python311-evdev(aarch-64) \
python3dist(evdev)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
