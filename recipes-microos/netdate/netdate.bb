SUMMARY = "Set Date and Time by ARPA Internet RFC 868"
DESCRIPTION = "Netdate takes a list of names of Internet hosts as arguments, selects \
the one that supplies the best time, and sets the system time \
accordingly. \
 \
The 'best' time is chosen by polling the named hosts once each to find \
their times and taking their differences from the local host's time. \
These differences are used to find the largest group of hosts whose \
times agree with each other within a certain limit. The first host in \
the largest group is picked as the best host."
LICENSE = "SUSE-Public-Domain"

PV = "1.2"

RPM_NAME = "netdate-1.2-736.13.aarch64.rpm"
RPM_HASH = "bc69b3bffc2cf19dfd27602c62c84c010496d7e01e71e711e944fd15be55b2bf30351cd43df3a5ca687f0ed0c4a3ed268e3c6f95977b2a8d6bbd7a77cf418a08"

RPROVIDES:${PN} += "netdate netdate(aarch-64) nkitb:/usr/sbin/netdate"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
