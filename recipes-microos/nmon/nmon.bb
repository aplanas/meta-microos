SUMMARY = "Performance Monitor"
DESCRIPTION = "This systems administrator, tuner, benchmark tool gives you a huge amount of \
important performance information in one go. It can output the data in two ways \
 \
1. On screen (console, telnet, VNC, putty or X Windows) using curses for low \
   CPU impact which is updated once every two seconds. You hit single characters \
   on you keyboard to enable/disable the various sorts of data. \
   * You can display the CPU, memory, network, disks (mini graphs or numbers), \
     file systems, NFS, top processes, resources (Linux version & processors) \
     and on Power micro-partition information. \
2. Save the data to a comma separated file for analysis and longer term data \
   capture. \
   * Use this together with nmon Analyser Excel 2000 spreadsheet, which loads \
     the nmon output file and automatically creates dozens of graphs ready for \
     you to study or write performance reports. \
   * Filter this data, add it to a rrd database (using an excellent freely \
     available utility called rrdtool). This graphs the data to .gif or .png \
     files plus generates the webpage .html file and you can then put the \
     graphs directly on a website automatically on AIX with no need of a \
     Windows based machine. \
   * Directly put the data into a rrd database or other database for your own \
     analysis"
LICENSE = "GPL-3.0-only"

PV = "16n"

RPM_NAME = "nmon-16n-1.6.aarch64.rpm"
RPM_HASH = "9823b7b7f6ef61ae6302eb61b8ccf28b8843485561d7f43b05cce75b0f078091053e4e3fbf9f8d6e9955e28e12e3fbb7570cf90a3090e36811335591672cadee"

RPROVIDES:${PN} += "lmon nmon nmon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
