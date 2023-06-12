SUMMARY = "Development files for the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.0"

RPM_NAME = "libdlm-devel-4.1.0-2.4.aarch64.rpm"
RPM_HASH = "b373666b5e8438cf80645ccc72b9f784e31245384a82dbffd24d42b91f34cec415afb92f4eeb5a104ecdce039ba5d40048e3587e9421115a532f2c91ec395f83"

RPROVIDES:${PN} += "libdlm-devel \
libdlm-devel(aarch-64) \
pkgconfig(libdlm) \
pkgconfig(libdlm_lt) \
pkgconfig(libdlmcontrol)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdlm3"

inherit rpm
