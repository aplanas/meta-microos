SUMMARY = "NFSv4 ID Mapping Library development libraries"
DESCRIPTION = "In NFSv4, identities of users are conveyed by names rather than user ID \
and group ID. Both the NFS server and client code in the kernel need to \
translate these to numeric IDs."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "nfsidmap-devel-1.0-39.1.aarch64.rpm"
RPM_HASH = "4f763bbd647c1a83cb733f1405ea42f62ff94f18cbcd29576b2b447e7a1ffc389d34d656a42255f506d3ccbd65baed57d79a72036b273b502751455ec8ad034d"

RPROVIDES:${PN} += "nfsidmap-devel nfsidmap-devel(aarch-64) pkgconfig(libnfsidmap)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnfsidmap1"

inherit rpm
