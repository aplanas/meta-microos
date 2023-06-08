SUMMARY = "Second phase firmware loader for Tascam USX2Y USB soundcards"
DESCRIPTION = "Usx2yloader is a helper program to load the 2nd Phase firmware binaries \
onto the Tascam USX2Y USB soundcards."
LICENSE = "GPL-2.0-or-later"

PV = "0.3"

RPM_NAME = "usx2yloader-0.3-24.3.aarch64.rpm"
RPM_HASH = "9b21b3bc564c4ebbaf2b9a7aabb4270f96a7a76b7a94f9a7ef69b17031c299e6fa87709753f27757ca1d24fc63cc3d79a578e5d366baed0a117bcca19a25fb19"

RPROVIDES:${PN} += "alsa-tools:/usr/bin/usx2yloader usx2yloader usx2yloader(aarch-64)"
RDEPENDS:${PN} += "alsa-firmware fxload ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
