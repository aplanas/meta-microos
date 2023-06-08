SUMMARY = "Python bindings for GlusterFS"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "python3-gluster-11.0-1.3.noarch.rpm"
RPM_HASH = "6533a73ace82f3c742178c02696be204587faf530ae8eddc29ce1c1ae4005802740bc2fdf84a694de6ad3aee8afaa9ac12e6b1171407c68b6ef31f76d3832b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gluster"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
