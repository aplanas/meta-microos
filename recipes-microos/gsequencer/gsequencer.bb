SUMMARY = "Audio processing engine"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio \
sequencer application supporting the LADPSA, DSSI and Lv2 plugin \
formats. It can output to Pulseaudio server, JACK and ALSA. \
 \
You may add multiple sinks, mix different sources by producing \
sound with different sequencers. Furthermore, it features a pattern \
and piano roll and there is an editor to automate ports."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "5.2.5"

RPM_NAME = "gsequencer-5.2.5-1.1.aarch64.rpm"
RPM_HASH = "a9e883f05cac4dd3d5bbd1cff30bf05eb7a6c31275733fb8701091afc9835d9b06f413e4f34c9aada71af88ebbabd4550329c3cc4cdebb71739d0aee4fc78fac"

RPROVIDES:${PN} += "application() application(gsequencer.desktop) gsequencer gsequencer(aarch-64) metainfo() metainfo(org.nongnu.gsequencer.gsequencer.appdata.xml) mimehandler(application/xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libags.so.5()(64bit) libags_audio.so.5()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsequencer.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-4.so.1()(64bit) libinstpatch-1.0.so.2()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
