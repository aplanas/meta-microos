SUMMARY = "GSequencer core libraries"
DESCRIPTION = "Advanced Gtk+ Sequencer is an audio sequencer application. \
This subpackage contains part of its library set."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & GFDL-1.3-only"

PV = "4.5.5"

RPM_NAME = "libgsequencer0-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "f376aa471ae01f369a3ba7809da0d2c738298863ec53bd68b8b53a5b681c1971e8a1e32a72037b6c082b16ca0f2964b1e0a0156ced4fd5b3edb2ebf03610dc9c"

RPROVIDES:${PN} += "libgsequencer.so.0()(64bit) libgsequencer0 libgsequencer0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libags.so.4()(64bit) libags_audio.so.4()(64bit) libags_gui.so.4()(64bit) libags_server.so.4()(64bit) libags_thread.so.4()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgraphene-1.0.so.0()(64bit) libgtk-4.so.1()(64bit) libinstpatch-1.0.so.2()(64bit) libjack.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpoppler-glib.so.8()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
