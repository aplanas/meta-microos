SUMMARY = "X Session Management library"
DESCRIPTION = "The X Session Management Protocol provides a uniform mechanism for \
users to save and restore their sessions. A session is a group of X \
clients (programs), each of which has a particular state. The session \
is controlled by a network service called the session manager, which \
issues commands to its clients on behalf of the user. These commands \
may cause clients to save their state or to terminate. It is expected \
that the client will save its state in such a way that the client can \
be restarted at a later time and resume its operation as if it had \
never been terminated."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "libSM6-1.2.4-2.2.aarch64.rpm"
RPM_HASH = "2455f12d5c61df602421cef852c1752cc807de2f605b598cb5d4f21d04302c952503b496f946bc814765574829c0d1b1e18438e1047caa7261c439ec698c90e2"

RPROVIDES:${PN} += "libSM.so.6()(64bit) libSM6 libSM6(aarch-64) xorg-x11-libSM"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
