SUMMARY = "Simple Movie Player"
DESCRIPTION = "pia is a simple movie player which can playback AVI and QuickTime \
movies recorded by xawtv, motv, and streamer. Other movies might work \
as well."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "pia-3.107-2.10.aarch64.rpm"
RPM_HASH = "650e300f2e463e688bac36e7c23f046170be39593797c2ae08d36d19f425a705112fbf1981546a6851b433790fd43a114ecaa465f0861eb9a06f0df49384723c"

RPROVIDES:${PN} += "pia pia(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libXaw.so.7()(64bit) libXext.so.6()(64bit) libXt.so.6()(64bit) libXv.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) tv-common"

inherit rpm
