SUMMARY = "Game based on Sonic the Hedgehog Universe"
DESCRIPTION = "Open Surge is a retro-style 2D sidescroller inspired by old-school \
games. The characters named Surge, Neon and Charge are to save the \
world from the evil Gimacian the Dark."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & CC-BY-3.0 & OFL-1.1 & MIT"

PV = "0.6.0.3"

RPM_NAME = "opensurge-0.6.0.3-2.3.aarch64.rpm"
RPM_HASH = "efefd39f7beb2e91d79860f07e267f0ed2db086533c11f12ed572225b4e6bfbcac600bb8176b64377b2db5d29601496dea406ee7a3fd7bb387e841d2001bc060"

RPROVIDES:${PN} += "application() application(opensurge.desktop) metainfo() metainfo(opensurge.appdata.xml) opensurge opensurge(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) liballegro.so.5.2()(64bit) liballegro_acodec.so.5.2()(64bit) liballegro_audio.so.5.2()(64bit) liballegro_dialog.so.5.2()(64bit) liballegro_font.so.5.2()(64bit) liballegro_image.so.5.2()(64bit) liballegro_memfile.so.5.2()(64bit) liballegro_primitives.so.5.2()(64bit) liballegro_ttf.so.5.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsurgescript.so.0.5.6()(64bit)"

inherit rpm
