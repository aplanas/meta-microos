SUMMARY = "TUI file explorer"
DESCRIPTION = "xplr is a terminal UI based file explorer for command-line utilities \
that work with the file-system. \
 \
xplr integrates shell commands and GUI file managers and exposes a \
scriptable, keyboard-controlled, real-time visual interface."
LICENSE = "MIT"

PV = "0.20.2"

RPM_NAME = "xplr-0.20.2-2.3.aarch64.rpm"
RPM_HASH = "0811ee0ae702db414e9f5810039c9482a73e2f76129ebd1a14c6ea642ccd6d746eece0632b860332fe03143320a672140ae7ae660229f380f505361a9853e328"

RPROVIDES:${PN} += "application() application(xplr.desktop) bundled(rust-crate:aho-corasick) bundled(rust-crate:ansi-to-tui) bundled(rust-crate:anyhow) bundled(rust-crate:autocfg) bundled(rust-crate:bitflags) bundled(rust-crate:bstr) bundled(rust-crate:cassowary) bundled(rust-crate:cc) bundled(rust-crate:cfg-if) bundled(rust-crate:chrono) bundled(rust-crate:crossterm) bundled(rust-crate:dirs) bundled(rust-crate:dirs-sys) bundled(rust-crate:either) bundled(rust-crate:erased-serde) bundled(rust-crate:fuzzy-matcher) bundled(rust-crate:gethostname) bundled(rust-crate:hashbrown) bundled(rust-crate:humansize) bundled(rust-crate:iana-time-zone) bundled(rust-crate:indexmap) bundled(rust-crate:itoa) bundled(rust-crate:lazy_static) bundled(rust-crate:libc) bundled(rust-crate:libm) bundled(rust-crate:lock_api) bundled(rust-crate:log) bundled(rust-crate:lua-src) bundled(rust-crate:luajit-src) bundled(rust-crate:memchr) bundled(rust-crate:mime) bundled(rust-crate:mime_guess) bundled(rust-crate:minimal-lexical) bundled(rust-crate:mio) bundled(rust-crate:mlua) bundled(rust-crate:natord) bundled(rust-crate:nom) bundled(rust-crate:num-integer) bundled(rust-crate:num-traits) bundled(rust-crate:once_cell) bundled(rust-crate:parking_lot) bundled(rust-crate:parking_lot_core) bundled(rust-crate:path-absolutize) bundled(rust-crate:path-dedot) bundled(rust-crate:pkg-config) bundled(rust-crate:proc-macro2) bundled(rust-crate:quote) bundled(rust-crate:regex) bundled(rust-crate:regex-syntax) bundled(rust-crate:rustc-hash) bundled(rust-crate:ryu) bundled(rust-crate:scopeguard) bundled(rust-crate:serde) bundled(rust-crate:serde_derive) bundled(rust-crate:serde_json) bundled(rust-crate:serde_yaml) bundled(rust-crate:signal-hook) bundled(rust-crate:signal-hook-mio) bundled(rust-crate:signal-hook-registry) bundled(rust-crate:smallvec) bundled(rust-crate:syn) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:thread_local) bundled(rust-crate:time) bundled(rust-crate:tui) bundled(rust-crate:tui-input) bundled(rust-crate:unicase) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-segmentation) bundled(rust-crate:unicode-width) bundled(rust-crate:unsafe-libyaml) bundled(rust-crate:version_check) bundled(rust-crate:which) bundled(rust-crate:xplr) config(xplr) mimehandler(inode/directory) xplr xplr(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GLIBC_2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
