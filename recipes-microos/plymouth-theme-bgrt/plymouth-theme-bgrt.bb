SUMMARY = "Plymouth 'bgrt' theme"
DESCRIPTION = "This package contains the 'bgrt' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-bgrt-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "00bed0fcb890df45a50df014a543e9c1114404d65d0a13eeba130e1618dcc485e419d19869f4046866f20f92782cafc1f0d4fe8639471e4f40bd28bdba9d3e27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-bgrt"
RDEPENDS:${PN} += "plymouth-plugin-two-step plymouth-scripts plymouth-theme-spinner"

inherit rpm
