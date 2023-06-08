SUMMARY = "Command Line Frontend for the Mupen64plus Nintendo 64 Emulator"
DESCRIPTION = "Mupen64Plus is a plugin-based N64 emulator which is capable of accurately \
playing many games. \
 \
This package contains a command line frontend."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.9"

RPM_NAME = "mupen64plus-ui-console-2.5.9-2.8.aarch64.rpm"
RPM_HASH = "e5f97e768368c1c9232e02164d37b5df8df0cabf6f7dc43abe9f3fd6fcbd26232473f99ba9a4cda5e534fa15d89cc81d61e6edeae28e1bb918cdfc1fa5508baa"

RPROVIDES:${PN} += "application() application(mupen64plus.desktop) mimehandler(application/x-n64-rom) mupen64plus-ui-console mupen64plus-ui-console(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libmupen64plus2 mupen64plus-plugin-audio mupen64plus-plugin-input mupen64plus-plugin-rsp mupen64plus-plugin-video"

inherit rpm
