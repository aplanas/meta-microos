SUMMARY = "Audio processing engine"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio \
sequencer application supporting the LADPSA, DSSI and Lv2 plugin \
formats. It can output to Pulseaudio server, JACK and ALSA. \
 \
You may add multiple sinks, mix different sources by producing \
sound with different sequencers. Furthermore, it features a pattern \
and piano roll and there is an editor to automate ports."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "4.5.5"

RPM_NAME = "gsequencer-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "c4fc43577001e20ff3b0db0b05a7abb9897bfd3bce0ed1482e001d2480e4def5d5aae820b0018156f339441988aa3f1beb3d8f038fc9743db6eada39409bae41"

RPROVIDES:${PN} += "application() application(gsequencer.desktop) gsequencer gsequencer(aarch-64) metainfo() metainfo(org.nongnu.gsequencer.gsequencer.appdata.xml) mimehandler(application/xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libags.so.4()(64bit) libags_audio.so.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsequencer.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-4.so.1()(64bit) libinstpatch-1.0.so.2()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
