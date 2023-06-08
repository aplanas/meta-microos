SUMMARY = "A minimalist command line interface to MPD"
DESCRIPTION = "A client for MPD, the Music Player Daemon. mpc connects to a MPD \
running on a machine via a network. Accepts input on standard input, \
so can be easily used in scripts."
LICENSE = "GPL-2.0-or-later"

PV = "0.34"

RPM_NAME = "mpclient-0.34-1.8.aarch64.rpm"
RPM_HASH = "5e20007967deb536078afae23ec2695a6a6674e4e2e733925df0697cb7ffafc9e7d6115b379933e25c098c39fefdce14e542d3e93b516e54a1d5c25e01162ae3"

RPROVIDES:${PN} += "config(mpclient) mpclient mpclient(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libmpdclient.so.2()(64bit) libmpdclient.so.2(libmpdclient2)(64bit)"

inherit rpm
