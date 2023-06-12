SUMMARY = "I3 Status Bar"
DESCRIPTION = "i3status is a program for generating a status bar for i3bar, dzen2, \
xmobar or similar programs. It issues a small number of system \
calls, as one generally wants to update such status lines every \
second so that the bar is updated even under load. It saves a bit of \
energy by being more efficient than shell commands."
LICENSE = "BSD-3-Clause"

PV = "2.13"

RPM_NAME = "i3status-2.13-1.15.aarch64.rpm"
RPM_HASH = "20060a491f57c241db6b690f539715392451f1f895c6b4218d0369026a0c4a59dc9675b9ced82e441e52842e1848ce86eeca22ed3dea43c24502a1a14bfc6e96"

RPROVIDES:${PN} += "config(i3status) \
i3status \
i3status(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libconfuse.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libyajl.so.2()(64bit)"

inherit rpm
