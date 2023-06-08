SUMMARY = "Include Files for Mupen64plus Development"
DESCRIPTION = "This package contains all necessary include files to develop frontends against \
the Mupen64plus shared library interface."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "libmupen64plus-devel-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "f50d72359a0fb0a406c3bb8263dfe4fe93636532dabb7140285ea0e4ee23f9e2c160461b39c1670e3e9908bf771b76364ada69094f3be9638a3d8c068f18c44a"

RPROVIDES:${PN} += "libmupen64plus-devel libmupen64plus-devel(aarch-64)"
RDEPENDS:${PN} += "libmupen64plus2"

inherit rpm
