SUMMARY = "Performance Co-Pilot (PCP) System and Monitoring Tools"
DESCRIPTION = "This PCP module contains additional system monitoring tools written \
in python."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-system-tools-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "1097f6fc37bf28c00c02e419e9a8d86e89377b17d445c9c3107afcb42128d4bc8e596deddb3be7976e414ac9b66d266d4c65fd70849b3fcbcf62aef03a53e129"

RPROVIDES:${PN} += "config(pcp-system-tools) pcp-system-tools pcp-system-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libpcp.so.3()(64bit) libpcp.so.3(PCP_3.0)(64bit) libpcp.so.3(PCP_3.11)(64bit) libpcp.so.3(PCP_3.17)(64bit) libpcp.so.3(PCP_3.2)(64bit) libpcp.so.3(PCP_3.21)(64bit) libpcp.so.3(PCP_3.22)(64bit) libpcp.so.3(PCP_3.28)(64bit) libpcp.so.3(PCP_3.3)(64bit) libpcp.so.3(PCP_3.6)(64bit) libpcp_gui.so.2()(64bit) libpcp_gui.so.2(PCP_GUI_2.0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) python3-pcp"

inherit rpm
