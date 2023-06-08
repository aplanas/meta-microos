SUMMARY = "Complementary plugins for gstreamer-plugins-good"
DESCRIPTION = "This package provides complementary plugins for \
gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-good-extra-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "7ca87588c93d891fa62129a281ce5b35b53e17c8c27e9ff120833bdd87af190f4f784bcbb1a59f553c4fc624d40edd64b5efff8264a68de28974229de1fb655e"

RPROVIDES:${PN} += "gstreamer-plugins-good-extra gstreamer-plugins-good-extra(aarch-64) gstreamer1(decoder-video/x-dv)(systemstream=false)()(64bit) gstreamer1(decoder-video/x-dv)(systemstream=true)()(64bit) gstreamer1(element-cacasink)()(64bit) gstreamer1(element-cacatv)()(64bit) gstreamer1(element-cairooverlay)()(64bit) gstreamer1(element-dv1394src)()(64bit) gstreamer1(element-dvdec)()(64bit) gstreamer1(element-dvdemux)()(64bit) gstreamer1(element-hdv1394src)()(64bit) gstreamer1(element-monoscope)()(64bit) gstreamer1(element-shout2send)()(64bit) gstreamer1(urisource-dv)()(64bit) gstreamer1(urisource-hdv)()(64bit) libgst1394.so()(64bit) libgstcacasink.so()(64bit) libgstcairo.so()(64bit) libgstdv.so()(64bit) libgstmonoscope.so()(64bit) libgstshout2.so()(64bit)"
RDEPENDS:${PN} += "gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavc1394.so.0()(64bit) libc.so.6(GLIBC_2.28)(64bit) libcaca.so.0()(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libdv.so.4()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libiec61883.so.0()(64bit) libraw1394.so.11()(64bit) librom1394.so.0()(64bit) libshout.so.3()(64bit)"

inherit rpm
