SUMMARY = "IPv4-through-DNS tunnel server and client"
DESCRIPTION = "This software lets one tunnel IPv4 data through a DNS server. This \
can be usable in different situations where internet access is \
firewalled, but DNS queries are allowed."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "iodine-0.7.0-10.7.aarch64.rpm"
RPM_HASH = "8fc4f94a0165a213238cfa2c1d5f0d7d440773ffa22cfe6d020a17aa03afee0ce10388a29e961735d11abf861c1818a4d7ee396b4b6afbebceca51a921900132"

RPROVIDES:${PN} += "group(iodined) iodine iodine(aarch-64) user(iodined)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup group(nobody) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) net-tools-deprecated sysuser-shadow"

inherit rpm
