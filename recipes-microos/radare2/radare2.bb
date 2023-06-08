SUMMARY = "Reverse Engineering Framework"
DESCRIPTION = "Opensource tools to disassemble, debug, analyze and manipulate binary files."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "5.7.8"

RPM_NAME = "radare2-5.7.8-1.4.aarch64.rpm"
RPM_HASH = "dfcfbe4838859ec00ffa7ca72bdf466b83d7c096737a5a98452392d39e32ac3a023cd23e13fe998ae48073a4c89e473833432bceb767e5629bf2cfadea0d7feb"

RPROVIDES:${PN} += "libr_anal.so.5.7.8()(64bit) libr_asm.so.5.7.8()(64bit) libr_bin.so.5.7.8()(64bit) libr_bp.so.5.7.8()(64bit) libr_config.so.5.7.8()(64bit) libr_cons.so.5.7.8()(64bit) libr_core.so.5.7.8()(64bit) libr_crypto.so.5.7.8()(64bit) libr_debug.so.5.7.8()(64bit) libr_egg.so.5.7.8()(64bit) libr_flag.so.5.7.8()(64bit) libr_fs.so.5.7.8()(64bit) libr_hash.so.5.7.8()(64bit) libr_io.so.5.7.8()(64bit) libr_lang.so.5.7.8()(64bit) libr_magic.so.5.7.8()(64bit) libr_main.so.5.7.8()(64bit) libr_parse.so.5.7.8()(64bit) libr_reg.so.5.7.8()(64bit) libr_search.so.5.7.8()(64bit) libr_socket.so.5.7.8()(64bit) libr_syscall.so.5.7.8()(64bit) libr_util.so.5.7.8()(64bit) radare2 radare2(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libcapstone.so.4()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmagic.so.1()(64bit) libuv.so.1()(64bit) libxxhash.so.0()(64bit) libz.so.1()(64bit) libzip.so.5()(64bit)"

inherit rpm
