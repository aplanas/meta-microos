SUMMARY = "An ncurses monitoring application for wireless network devices"
DESCRIPTION = "wavemon is a wireless device monitoring application that allows you to \
watch signal and noise levels, packet statistics, device configuration \
and network parameters of your wireless network hardware. It has \
currently only been tested with the Lucent Orinoco series of cards, \
although it *should* work (though with varying features) with all \
devices supported by the wireless kernel extensions by Jean Tourrilhes."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.4"

RPM_NAME = "wavemon-0.9.4-1.2.aarch64.rpm"
RPM_HASH = "e654769e616e310d3c29c25e78a337672feda78ff18a5974be4021467f034178c4b38afe4683db04d71377ee1a4e5c1ef05bc5008ff79f47ec6a346db37c53ba"

RPROVIDES:${PN} += "wavemon \
wavemon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-cli-3.so.200()(64bit) \
libnl-cli-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
