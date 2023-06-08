SUMMARY = "Library for checking SUSE installation media"
DESCRIPTION = "Library for checking SUSE installation media. Used by checkmedia and linuxrc."
LICENSE = "GPL-3.0-or-later"

PV = "6.1"

RPM_NAME = "libmediacheck-devel-6.1-2.7.aarch64.rpm"
RPM_HASH = "596cde2c690434b1486ccac20b258179017396563b4fb2a6df018277b823f9a3fe6b21be3d6c3320e7a234d126f9a5172fe726e1ca5a2c600525a891a51f48d6"

RPROVIDES:${PN} += "libmediacheck-devel libmediacheck-devel(aarch-64)"
RDEPENDS:${PN} += "libmediacheck6"

inherit rpm
