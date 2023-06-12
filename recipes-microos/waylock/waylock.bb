SUMMARY = "Small screenlocker for Wayland compositors"
DESCRIPTION = "Screenlocker for Wayland compositors implementing ext-session-lock-v1. \
(The v1 protocol is robust in that a crashing locker does not \
cause the session to be unlocked.)"
LICENSE = "ISC"

PV = "0.6.2"

RPM_NAME = "waylock-0.6.2-1.2.aarch64.rpm"
RPM_HASH = "b7fe0554f9a010e935a3ad9a55e4294e0621332d94638322dac1ab4392d3b649e99efd83835a0421dec36fb6a849affde6139c65642090e397d6aacbc8c93bae"

RPROVIDES:${PN} += "waylock \
waylock(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
