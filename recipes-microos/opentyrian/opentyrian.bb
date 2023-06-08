SUMMARY = "An arcade-style vertical scrolling shooter"
DESCRIPTION = "OpenTyrian is a port of the DOS shoot-em-up Tyrian. Thanks to Jason Emery, \
the developers were given a copy of the Tyrian source to port but \
not redistribute. That code has since been ported from Turbo Pascal to C \
using SDL, making it easily cross-platform. The 'Classic' port involves \
minimal changes, but the 'Enhanced' port will feature further development. \
Tyrian is an arcade-style vertical scrolling shooter. The story is set \
in 20,031 where you play as Trent Hawkins, a skilled fighter-pilot employed \
to fight Microsol and save the galaxy."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.20221123"

RPM_NAME = "opentyrian-2.1.20221123-1.3.aarch64.rpm"
RPM_HASH = "b2be5f6123b8327e905ade6b04db11cfd407d88c0973dfb27b96fee5387bb8481d1b96b0da68e8847f73f8bbceb768c81ad4463e86a9500fd05f9a468e13bade"

RPROVIDES:${PN} += "application() application(opentyrian.desktop) metainfo() metainfo(opentyrian.appdata.xml) opentyrian opentyrian(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libSDL2-2.0.so.0()(64bit) libSDL2_net-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
