SUMMARY = "Endpoint visibility and collection tool (endpoint only)"
DESCRIPTION = "Velociraptor is a tool for collecting host based state information \
using The Velociraptor Query Language (VQL) queries. \
 \
To learn more about Velociraptor, read the documentation on: \
 \
https://docs.velociraptor.app/ \
 \
This package contains only the endpoint agent.  For the full server and GUI \
console, please install the 'velociraptor' package."
LICENSE = "AGPL-3.0-only"

PV = "0.6.7.5~git78.2bef6fc"

RPM_NAME = "velociraptor-client-0.6.7.5~git78.2bef6fc-2.1.aarch64.rpm"
RPM_HASH = "ff1efbb50de8b814cf6e4457086ea336c46f0b67e88544432d5d8bac281a97ebe1311b041bb549435b8dc89e8dd11822fe3b536493f171a11d3d42ecd85c97cd"

RPROVIDES:${PN} += "config(velociraptor-client) velociraptor-client velociraptor-client(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(velociraptor) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit) user(velociraptor)"

inherit rpm
