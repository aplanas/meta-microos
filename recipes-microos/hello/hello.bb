SUMMARY = "A Friendly Greeting Program"
DESCRIPTION = "The GNU hello program produces a familiar, friendly greeting.  It \
allows nonprogrammers to use a classic computer science tool that would \
otherwise be unavailable to them.  Because it is protected by the GNU \
General Public License, users are free to share and change it. \
 \
GNU hello supports many native languages."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.1"

RPM_NAME = "hello-2.12.1-1.3.aarch64.rpm"
RPM_HASH = "4343aa58fc9afe5e7eec57d1218f451f38ba0ab0b1e0679c6c959cb08757dc9bd8878a197f0e23008562231421a3b0b5e94a10cdefc8048bee36c7f2085bb209"

RPROVIDES:${PN} += "hello hello(aarch-64) mailreader"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
