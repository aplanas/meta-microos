SUMMARY = "Raw wayland greeter for greetd"
DESCRIPTION = "Raw wayland greeter for greetd, to be run under sway or similar. \
Note that cage is currently not supported due to it lacking wlr-layer-shell-unstable support."
LICENSE = "GPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "wlgreet-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "463884938ebb0ce04e34185f203c520ec9f4e8f53601df5285b1eaaeb0966bb84634f785652b06ad4c900e0378d56200ae4b3f22772b12b0429b4208e82dbc32"

RPROVIDES:${PN} += "bundled(rust-crate:ab_glyph_rasterizer) bundled(rust-crate:autocfg) bundled(rust-crate:bitflags) bundled(rust-crate:calloop) bundled(rust-crate:cfg-if) bundled(rust-crate:chrono) bundled(rust-crate:dlib) bundled(rust-crate:downcast-rs) bundled(rust-crate:getopts) bundled(rust-crate:greetd_ipc) bundled(rust-crate:iana-time-zone) bundled(rust-crate:itoa) bundled(rust-crate:lazy_static) bundled(rust-crate:libc) bundled(rust-crate:libloading) bundled(rust-crate:log) bundled(rust-crate:memchr) bundled(rust-crate:memmap2) bundled(rust-crate:memoffset) bundled(rust-crate:minimal-lexical) bundled(rust-crate:nix) bundled(rust-crate:nom) bundled(rust-crate:num-integer) bundled(rust-crate:num-traits) bundled(rust-crate:once_cell) bundled(rust-crate:os_pipe) bundled(rust-crate:owned_ttf_parser) bundled(rust-crate:pin-utils) bundled(rust-crate:pkg-config) bundled(rust-crate:proc-macro2) bundled(rust-crate:quote) bundled(rust-crate:rusttype) bundled(rust-crate:ryu) bundled(rust-crate:scoped-tls) bundled(rust-crate:serde) bundled(rust-crate:serde_derive) bundled(rust-crate:serde_json) bundled(rust-crate:smallvec) bundled(rust-crate:smithay-client-toolkit) bundled(rust-crate:syn) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:time) bundled(rust-crate:toml) bundled(rust-crate:ttf-parser) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-width) bundled(rust-crate:wayland-client) bundled(rust-crate:wayland-commons) bundled(rust-crate:wayland-cursor) bundled(rust-crate:wayland-protocols) bundled(rust-crate:wayland-scanner) bundled(rust-crate:wayland-sys) bundled(rust-crate:wlgreet) bundled(rust-crate:xcursor) bundled(rust-crate:xml-rs) wlgreet wlgreet(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
