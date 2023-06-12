SUMMARY = "Shell history helper"
DESCRIPTION = "McFly replaces your default ctrl-r shell history search with an intelligent search engine that takes into account your working directory and the context of recently executed commands. McFly's suggestions are prioritized in real time with a small neural network."
LICENSE = "MIT"

PV = "0.8.0~0"

RPM_NAME = "mcfly-0.8.0~0-1.3.aarch64.rpm"
RPM_HASH = "071af807df594dd3d4ddce8e601be28897767bf041cf355b06dc153806673dbde3ab7c369a00440922a3295c6d7576604a0336af21b8940e605313ca5f7d52a0"

RPROVIDES:${PN} += "bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:crossterm) \
bundled(rust-crate:csv) \
bundled(rust-crate:csv-core) \
bundled(rust-crate:directories-next) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:either) \
bundled(rust-crate:fallible-iterator) \
bundled(rust-crate:fallible-streaming-iterator) \
bundled(rust-crate:filedescriptor) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hashlink) \
bundled(rust-crate:heck) \
bundled(rust-crate:humantime) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:libc) \
bundled(rust-crate:libsqlite3-sys) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:mcfly) \
bundled(rust-crate:memchr) \
bundled(rust-crate:mio) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:relative-path) \
bundled(rust-crate:rusqlite) \
bundled(rust-crate:rustix) \
bundled(rust-crate:ryu) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:serde) \
bundled(rust-crate:shellexpand) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-mio) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:time) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:vcpkg) \
bundled(rust-crate:version_check) \
mcfly \
mcfly(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
