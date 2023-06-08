SUMMARY = "Endpoint visibility and collection tool"
DESCRIPTION = "Velociraptor is a tool for collecting host based state information \
using The Velociraptor Query Language (VQL) queries. \
 \
To learn more about Velociraptor, read the documentation on: \
 \
https://docs.velociraptor.app/ \
 \
This package contains the velociraptor server and full console GUI. \
For just the endpoint agent, please install the 'velociraptor-client' package."
LICENSE = "AGPL-3.0-only"

PV = "0.6.7.5~git78.2bef6fc"

RPM_NAME = "velociraptor-0.6.7.5~git78.2bef6fc-2.1.aarch64.rpm"
RPM_HASH = "44a0021cca8fc359ec8bd08ca3ac2aae2c2ffa0cbced670b7586c87b36092bf3cb774ca2f11d263c1f3074b2608eee91293987f9d1ed70a3165d2e199c1a7eea"

RPROVIDES:${PN} += "config(velociraptor) velociraptor velociraptor(aarch-64)"
RDEPENDS:${PN} += "/bin/sh group(velociraptor) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit) sysuser-shadow user(velociraptor)"

inherit rpm
