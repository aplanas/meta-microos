SUMMARY = "Performance Co-Pilot run-time GUI library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time graphical user interface library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_gui2-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "f20567ffe078026bb5e7048522921ef817b4a90821d87915e729dbd70c3d56d31ee2c5f2afe7042b535ac1980985589021f84b0fb9ee497c9a213e27b93c6797"

RPROVIDES:${PN} += "libpcp_gui.so.2()(64bit) libpcp_gui.so.2(PCP_GUI_2.0)(64bit) libpcp_gui2 libpcp_gui2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpcp.so.3()(64bit) libpcp.so.3(PCP_3.0)(64bit) libpcp.so.3(PCP_3.21)(64bit) libpcp.so.3(PCP_3.22)(64bit)"

inherit rpm
