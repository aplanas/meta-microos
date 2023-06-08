SUMMARY = "Devel files for radare2"
DESCRIPTION = "Development files for radare2"
LICENSE = "LGPL-3.0-only"

PV = "5.7.8"

RPM_NAME = "radare2-devel-5.7.8-1.4.aarch64.rpm"
RPM_HASH = "80e755f942aa8bf3158202c42d3421fc26d1e81d19e6508c66cfb7e0de05be08baae29772c5459b364203aecafc27909aadfb1609fff7288a14dfa3a751a0cc4"

RPROVIDES:${PN} += "pkgconfig(libr) pkgconfig(r_anal) pkgconfig(r_asm) pkgconfig(r_bin) pkgconfig(r_bp) pkgconfig(r_config) pkgconfig(r_cons) pkgconfig(r_core) pkgconfig(r_crypto) pkgconfig(r_debug) pkgconfig(r_egg) pkgconfig(r_flag) pkgconfig(r_fs) pkgconfig(r_hash) pkgconfig(r_io) pkgconfig(r_lang) pkgconfig(r_magic) pkgconfig(r_main) pkgconfig(r_parse) pkgconfig(r_reg) pkgconfig(r_search) pkgconfig(r_socket) pkgconfig(r_syscall) pkgconfig(r_util) radare2-devel radare2-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config file-devel pkgconfig(capstone) pkgconfig(libuv) pkgconfig(libxxhash) pkgconfig(libzip) pkgconfig(openssl) pkgconfig(r_anal) pkgconfig(r_asm) pkgconfig(r_bin) pkgconfig(r_bp) pkgconfig(r_config) pkgconfig(r_cons) pkgconfig(r_core) pkgconfig(r_crypto) pkgconfig(r_debug) pkgconfig(r_egg) pkgconfig(r_flag) pkgconfig(r_fs) pkgconfig(r_hash) pkgconfig(r_io) pkgconfig(r_lang) pkgconfig(r_magic) pkgconfig(r_parse) pkgconfig(r_reg) pkgconfig(r_search) pkgconfig(r_socket) pkgconfig(r_syscall) pkgconfig(r_util) pkgconfig(zlib) radare2"

inherit rpm
