SUMMARY = "Digitize Audio Records"
DESCRIPTION = "Gramofile is a program to digitize audio records. Through the \
application of several filters, it is possible to accomplish a \
significant reduction of disturbances like ticks and scratches. Data is \
saved in WAV format, making it easy to record on CD with programs like \
cdrecord or xcdroast."
LICENSE = "GPL-2.0+"

PV = "1.6"

RPM_NAME = "gramofile-1.6-397.25.aarch64.rpm"
RPM_HASH = "9cf96c997e9e9aac7fea07a330413e8e5057be97357917a45c767adadc3def2c777860e4e55b7ae13fa6a302bd00945469a999a286e90fb322ce54bf818e69ab"

RPROVIDES:${PN} += "gramofil gramofile gramofile(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
