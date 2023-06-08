SUMMARY = "Collection of video game music file emulators"
DESCRIPTION = "Game_Music_Emu is a collection of video game music file emulators that support \
the following formats and systems: \
- AY: ZX Spectrum/Amstrad CPC \
- GBS: Nintendo Game Boy \
- GYM: Sega Genesis/Mega Drive \
- HES: NEC TurboGrafx-16/PC Engine \
- KSS: MSX Home Computer/other Z80 systems (doesn't support FM sound) \
- NSF/NSFE: Nintendo NES/Famicom (with VRC 6, Namco 106, and FME-7 sound) \
- SAP: Atari systems using POKEY sound chip \
- SPC: Super Nintendo/Super Famicom \
- VGM/VGZ: Sega Master System/Mark III, Sega Genesis/Mega Drive,BBC Micro"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.3"

RPM_NAME = "libgme0-0.6.3-2.4.aarch64.rpm"
RPM_HASH = "4672fbd5f8f4f14d1951fa9aa6d30a23aa9b676be00dc2f8c8870833d010fac0374c5e9fd144c14eb25e81820e077734c12a60d9af8af8fbde9d61d59490d07d"

RPROVIDES:${PN} += "libgme.so.0()(64bit) libgme0 libgme0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libubsan.so.1()(64bit)"

inherit rpm
