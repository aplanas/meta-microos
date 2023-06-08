SUMMARY = "Development files for liballegro_video"
DESCRIPTION = "Development files needed to build applications which use liballegro_video."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_video5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "c7b41904fa77f1d7732e9698aaab779d47aa24f10e38cc244d622b134fb3442483a7b74cd48df9e2461a73e3981ff86ff706a721a30477f420cba2a8b0978575"

RPROVIDES:${PN} += "liballegro_video5_2-devel liballegro_video5_2-devel(aarch-64) pkgconfig(allegro_video-5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liballegro_video5_2 pkgconfig(allegro_audio-5)"

inherit rpm
