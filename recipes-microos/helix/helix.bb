SUMMARY = "A post-modern modal text editor written in Rust"
DESCRIPTION = "A kakoune/neovim inspired modal text editor with built-in LSP and \
has treesitter support for syntax highlighting and improved navigation"
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.03"

RPM_NAME = "helix-23.03-2.1.aarch64.rpm"
RPM_HASH = "9d65e10fc950c937b2baf550562e079594e0539501cafbe893e4ccb29a8302509adc2d36c443d08218948969defaa806f0295db9d71920766fbe750a7fa70efd"

RPROVIDES:${PN} += "application() application(helix.desktop) bundled(rust-crate:BROKEN) helix helix(aarch-64) mimehandler(application/x-shellscript) mimehandler(text/english) mimehandler(text/plain) mimehandler(text/x-c) mimehandler(text/x-c++) mimehandler(text/x-c++hdr) mimehandler(text/x-c++src) mimehandler(text/x-chdr) mimehandler(text/x-csrc) mimehandler(text/x-java) mimehandler(text/x-makefile) mimehandler(text/x-moc) mimehandler(text/x-pascal) mimehandler(text/x-tcl) mimehandler(text/x-tex)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
