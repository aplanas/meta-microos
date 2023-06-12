SUMMARY = "Portable network interface information"
DESCRIPTION = "netifaces provides a (hopefully portable-ish) way for Python programmers to \
get access to a list of the network interfaces on the local machine, and to \
obtain the addresses of those network interfaces. \
 \
The package has been tested on Mac OS X, Windows XP, Windows Vista, Linux and \
Solaris. On Windows, it is currently not able to retrieve IPv6 addresses, \
owing to shortcomings of the Windows API. \
 \
It should work on other UNIX-like systems provided they implement either \
getifaddrs() or support the SIOCGIFxxx socket options, although the data \
provided by the socket options is normally less complete."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "python39-netifaces-0.11.0-2.1.aarch64.rpm"
RPM_HASH = "ca515968a729afb21ba1ffb94fad1ea060b06a9e324ed3676000cb4497217273220bfe81675a9b5c04ac166e941a84e1959d8a565abc4ec012ceb768d92b1b07"

RPROVIDES:${PN} += "python3.9dist(netifaces) \
python39-netifaces \
python39-netifaces(aarch-64) \
python3dist(netifaces)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
