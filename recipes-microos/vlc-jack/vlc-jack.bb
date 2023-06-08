SUMMARY = "Jack integration for the VLC media player"
DESCRIPTION = "This package adds jack support to vlc via plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-jack-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "f8d0ca332603c3b600cfcd550bbc82454b4376a5094cd900927b0561f4b02506d8b50fd87c5d4087b5ec3031662c1a35c25a9d7c24a6791dddac1e2a5010e8ab"

RPROVIDES:${PN} += "libaccess_jack_plugin.so()(64bit) libjack_plugin.so()(64bit) vlc-jack vlc-jack(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libjack.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libvlccore.so.9()(64bit) vlc-noX"

inherit rpm
