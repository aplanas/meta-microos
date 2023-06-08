SUMMARY = "HDHomeRun Config tool"
DESCRIPTION = "hdhomerun_config is a command line tool to discover, configure, and scan \
HDHomeRun TV tuners. The tool can also be used to update the tuner's firmware. \
 \
Firmware updates can be downloaded from http://www.silicondust.com/support/hdhomerun/downloads/linux"
LICENSE = "LGPL-2.1-only"

PV = "20190621"

RPM_NAME = "hdhomerun_config-20190621-1.18.aarch64.rpm"
RPM_HASH = "c63ac81a6f017896cd0a6e4687c83c26b4e7697b8492ae662d474cfc4cb059b657644d2eead00736b681d690f83e413eb84fa417da05a14e5edbe42fab6a5baa"

RPROVIDES:${PN} += "hdhomerun_config hdhomerun_config(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
