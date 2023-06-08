SUMMARY = "Development files for glusterfs"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes. \
 \
This package provides development files such as headers and library \
links."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "glusterfs-devel-11.0-1.3.aarch64.rpm"
RPM_HASH = "eb0709710329af3bc358df5fd1c0269b40ce6dc0d0f755b07c9ea730ca1fd4b5dee21446b045f2f87c133a937f785083313612aaab5e2f8293c10bf62d941420"

RPROVIDES:${PN} += "glusterfs-devel glusterfs-devel(aarch-64) pkgconfig(glusterfs-api) pkgconfig(libgfchangelog)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glusterfs libacl-devel libgfapi0 libgfchangelog0 libgfrpc0 libgfxdr0 libglusterfs0 pkgconfig(uuid)"

inherit rpm
