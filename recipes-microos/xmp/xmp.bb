SUMMARY = "Extended Module Player for MOD/S3M/XM/IT/etc."
DESCRIPTION = "The Extended Module Player is a command-line mod player for Unix-like \
systems that plays over 90 mainstream and obscure module formats from \
Amiga, Atari, Acorn, Apple IIgs, C64, and PC, including Protracker \
(MOD), Scream Tracker 3 (S3M), Fast Tracker II (XM), and Impulse \
Tracker (IT) files."
LICENSE = "GPL-2.0+"

PV = "4.1.0"

RPM_NAME = "xmp-4.1.0-1.25.aarch64.rpm"
RPM_HASH = "a48a4d094ad0d94e003d575efb564bab44afa3909349976d3fb406c18c2be1a2c04b0017376f107fa6953396dfd6e0b53aed3826cfa4415d7daaf72389443782"

RPROVIDES:${PN} += "config(xmp) xmp xmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libxmp.so.4()(64bit) libxmp.so.4(XMP_4.0)(64bit) libxmp.so.4(XMP_4.4)(64bit)"

inherit rpm
