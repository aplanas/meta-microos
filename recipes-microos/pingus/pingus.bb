SUMMARY = "Free Lemmings-like puzzle game"
DESCRIPTION = "Pingus is a free Lemmings-like puzzle game covered under the GNU GPL. \
It features currently 77 playable levels. \
 \
You can use to see which languages are supported \
 \
    pingus --list-languages \
 \
And start with \
 \
    pingus --language de \
 \
If you wish to play the other levels \
 \
    pingus /usr/share/pingus/levels/playable/some-level \
    pingus /usr/share/pingus/levels/incoming/some-level \
    pingus /usr/share/pingus/levels/wip/some-level \
 \
The other, probably more userfriendly, way is to simply load them into \
the level editor and then click the play button."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "pingus-0.7.6-17.1.aarch64.rpm"
RPM_HASH = "da59f77e2cea32c96c663d2c58353aeda8dcf2d41b0efc8a562d2ea76c1fa7fedb9cd718cf00a8503b004a46035066177d3010c5be4385038927738af312bb60"

RPROVIDES:${PN} += "application() \
application(pingus.desktop) \
metainfo() \
metainfo(pingus.appdata.xml) \
mimehandler(application/x-pingus) \
mimehandler(application/x-pingus-prefab) \
mimehandler(application/x-pingus-worldmap) \
pingus \
pingus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
