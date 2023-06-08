SUMMARY = "A suite of tools for clustering"
DESCRIPTION = "Warewulf v4 combines ultra scalability, flexibility, and simplicity with being \
light weight, non-intrusive, and a great tool for scientists and seasoned \
system administrators alike. Warewulf empowers you to scalably and easily \
manage thousands of compute resources."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-4.4.0-6.3.aarch64.rpm"
RPM_HASH = "e15e0dae73f22d74ca9d853cd7fec39ab64f838f0387f8e0472b30e70e29bcdfec54d28b7180face09743c908af1aaa1b20c563ce45d0b86c0b4848da6ef6456"

RPROVIDES:${PN} += "config(warewulf4) group(warewulf) user(warewulf) warewulf4 warewulf4(aarch-64)"
RDEPENDS:${PN} += "/bin/sh dhcp-server ipxe-bootimgs libc.so.6(GLIBC_2.34)(64bit) pigz sysuser-shadow tftp warewulf4-overlay"

inherit rpm
