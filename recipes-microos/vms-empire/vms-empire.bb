SUMMARY = "Simulation of a full-scale war between two emperors"
DESCRIPTION = "The ancestor of all 4x (expand/explore/exploit/exterminate) games. \
VMS-Empire is a simulation of a full-scale war between two emperors, \
the computer and you. Naturally, there is only room for one, so the \
object of the game is to destroy the other. The computer plays by the \
same rules that you do. This game is the ancestor of all the multiplayer \
4X simulations out there, including Civilization and Master of Orion."
LICENSE = "GPL-2.0-only"

PV = "1.16"

RPM_NAME = "vms-empire-1.16-1.7.aarch64.rpm"
RPM_HASH = "cf7a148587e8ee787c160708984bc0fb786eb085182d9735d1166e54f50b92c57849ac26cf2df98c9ad82192a5a01504d73fb82482f280f3ec8486db4d942985"

RPROVIDES:${PN} += "application() application(vms-empire.desktop) vms-empire vms-empire(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
