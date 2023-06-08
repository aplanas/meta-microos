SUMMARY = "Point-to-Point Tunneling Protocol (PPTP) Client"
DESCRIPTION = "A client for the proprietary Microsoft Point-to-Point Tunneling \
Protocol, PPTP.  It allows connections to a PPTP based VPN as used by \
employers and some cable and ADSL service providers. It requires MPPE \
support in the kernel. Use the ppp-mppe package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.0"

RPM_NAME = "pptp-1.10.0-3.7.aarch64.rpm"
RPM_HASH = "f360d46bacbce8e5905ffca496f878dc26b5937be2c4a7f2af254c9367f77396fe9542de01bd5945744a4ec0919051775be6235b95758fa3c920d10b06105155"

RPROVIDES:${PN} += "config(pptp) pptp pptp(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
