SUMMARY = "Video4linux Configuration Tool"
DESCRIPTION = "This is a small utility used to configure video4linux device drivers \
(bttv, for example). xawtv, motv, and fbtv need it."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "v4l-conf-3.107-2.10.aarch64.rpm"
RPM_HASH = "adf2125f2d565b0044313b76bf7b370e4e3421c14272d306ae800fa9b83b21e181887d359cf409d78974360fabc4b70deca9b5793806df1fa1c1c1eb92ecf81b"

RPROVIDES:${PN} += "v4l-conf \
v4l-conf(aarch-64) \
xawtv:/usr/bin/v4l-conf"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXxf86dga.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
permissions"

inherit rpm
