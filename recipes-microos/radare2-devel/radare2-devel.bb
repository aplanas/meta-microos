SUMMARY = "Devel files for radare2"
DESCRIPTION = "Development files for radare2"
LICENSE = "LGPL-3.0-only"

PV = "5.8.6"

RPM_NAME = "radare2-devel-5.8.6-1.1.aarch64.rpm"
RPM_HASH = "fe918c1d42fc93efd8e439f23692d15bb94f4fc6b8b24ba6bc3167c545bc14081261f0387ed422876ae7626f8691cd0fee79eea91929f67b4e3e17f0d1d526ab"

RPROVIDES:${PN} += "pkgconfig(libr) pkgconfig(r_anal) pkgconfig(r_arch) pkgconfig(r_asm) pkgconfig(r_bin) pkgconfig(r_bp) pkgconfig(r_config) pkgconfig(r_cons) pkgconfig(r_core) pkgconfig(r_crypto) pkgconfig(r_debug) pkgconfig(r_egg) pkgconfig(r_esil) pkgconfig(r_flag) pkgconfig(r_fs) pkgconfig(r_io) pkgconfig(r_lang) pkgconfig(r_magic) pkgconfig(r_main) pkgconfig(r_reg) pkgconfig(r_search) pkgconfig(r_socket) pkgconfig(r_syscall) pkgconfig(r_util) radare2-devel radare2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config file-devel pkgconfig(capstone) pkgconfig(libxxhash) pkgconfig(libzip) pkgconfig(openssl) pkgconfig(r_anal) pkgconfig(r_arch) pkgconfig(r_asm) pkgconfig(r_bin) pkgconfig(r_bp) pkgconfig(r_config) pkgconfig(r_cons) pkgconfig(r_core) pkgconfig(r_crypto) pkgconfig(r_debug) pkgconfig(r_egg) pkgconfig(r_esil) pkgconfig(r_flag) pkgconfig(r_fs) pkgconfig(r_io) pkgconfig(r_lang) pkgconfig(r_magic) pkgconfig(r_reg) pkgconfig(r_search) pkgconfig(r_socket) pkgconfig(r_syscall) pkgconfig(r_util) pkgconfig(zlib) radare2"

inherit rpm
