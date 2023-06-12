SUMMARY = "Python bindings for GlusterFS"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "python3-gluster-11.0-2.1.noarch.rpm"
RPM_HASH = "5a27deaa7c622ee44c3492c576e9ea650ffa029875d0cc9b3fbba855ef0498cd8a750099a359ff4e5ab2782e07973223a4443a05ca8c244063512d8fd89d6d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gluster"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
