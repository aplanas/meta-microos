SUMMARY = "CLI command organizer"
DESCRIPTION = "Command organizer tool to hoard all your precious commands."
LICENSE = "MIT"

PV = "1.3.1~0"

RPM_NAME = "hoard-1.3.1~0-1.2.aarch64.rpm"
RPM_HASH = "a1a28b4acdb6f02ecdf94023cc22095963ad46380edf8a1b750293995ae661dc414cb8d0abf996ebc1db8c82ca9b58ec06a889f676e1a67d57b1b9d7d5cbd1e3"

RPROVIDES:${PN} += "bundled(rust-crate:anyhow) bundled(rust-crate:array_tool) bundled(rust-crate:atty) bundled(rust-crate:autocfg) bundled(rust-crate:base64) bundled(rust-crate:bitflags) bundled(rust-crate:bstr) bundled(rust-crate:bytes) bundled(rust-crate:cassowary) bundled(rust-crate:cc) bundled(rust-crate:cfg-if) bundled(rust-crate:chrono) bundled(rust-crate:clap) bundled(rust-crate:clap_derive) bundled(rust-crate:clap_lex) bundled(rust-crate:colored) bundled(rust-crate:console) bundled(rust-crate:crossbeam-channel) bundled(rust-crate:crossbeam-utils) bundled(rust-crate:crossterm) bundled(rust-crate:csv) bundled(rust-crate:csv-core) bundled(rust-crate:dialoguer) bundled(rust-crate:dirs) bundled(rust-crate:dirs-next) bundled(rust-crate:dirs-sys) bundled(rust-crate:dirs-sys-next) bundled(rust-crate:encode_unicode) bundled(rust-crate:encoding_rs) bundled(rust-crate:enum-iterator) bundled(rust-crate:enum-iterator-derive) bundled(rust-crate:eyre) bundled(rust-crate:fastrand) bundled(rust-crate:fnv) bundled(rust-crate:foreign-types) bundled(rust-crate:foreign-types-shared) bundled(rust-crate:form_urlencoded) bundled(rust-crate:futures-channel) bundled(rust-crate:futures-core) bundled(rust-crate:futures-io) bundled(rust-crate:futures-sink) bundled(rust-crate:futures-task) bundled(rust-crate:futures-util) bundled(rust-crate:getrandom) bundled(rust-crate:h2) bundled(rust-crate:hashbrown) bundled(rust-crate:heck) bundled(rust-crate:hoard-rs) bundled(rust-crate:http) bundled(rust-crate:http-body) bundled(rust-crate:httparse) bundled(rust-crate:httpdate) bundled(rust-crate:hyper) bundled(rust-crate:hyper-tls) bundled(rust-crate:iana-time-zone) bundled(rust-crate:idna) bundled(rust-crate:indenter) bundled(rust-crate:indexmap) bundled(rust-crate:io-lifetimes) bundled(rust-crate:ipnet) bundled(rust-crate:is-terminal) bundled(rust-crate:itoa) bundled(rust-crate:lazy_static) bundled(rust-crate:libc) bundled(rust-crate:linked-hash-map) bundled(rust-crate:linux-raw-sys) bundled(rust-crate:lock_api) bundled(rust-crate:log) bundled(rust-crate:memchr) bundled(rust-crate:mime) bundled(rust-crate:mio) bundled(rust-crate:native-tls) bundled(rust-crate:num-integer) bundled(rust-crate:num-traits) bundled(rust-crate:num_cpus) bundled(rust-crate:num_threads) bundled(rust-crate:numtoa) bundled(rust-crate:once_cell) bundled(rust-crate:openssl) bundled(rust-crate:openssl-macros) bundled(rust-crate:openssl-probe) bundled(rust-crate:openssl-sys) bundled(rust-crate:os_str_bytes) bundled(rust-crate:parking_lot) bundled(rust-crate:parking_lot_core) bundled(rust-crate:percent-encoding) bundled(rust-crate:pin-project-lite) bundled(rust-crate:pin-utils) bundled(rust-crate:pkg-config) bundled(rust-crate:ppv-lite86) bundled(rust-crate:prettytable-rs) bundled(rust-crate:proc-macro-error) bundled(rust-crate:proc-macro-error-attr) bundled(rust-crate:proc-macro2) bundled(rust-crate:quote) bundled(rust-crate:rand) bundled(rust-crate:rand_chacha) bundled(rust-crate:rand_core) bundled(rust-crate:regex-automata) bundled(rust-crate:remove_dir_all) bundled(rust-crate:reqwest) bundled(rust-crate:rustix) bundled(rust-crate:ryu) bundled(rust-crate:scopeguard) bundled(rust-crate:serde) bundled(rust-crate:serde_derive) bundled(rust-crate:serde_json) bundled(rust-crate:serde_urlencoded) bundled(rust-crate:serde_yaml) bundled(rust-crate:shell-words) bundled(rust-crate:signal-hook) bundled(rust-crate:signal-hook-mio) bundled(rust-crate:signal-hook-registry) bundled(rust-crate:simple_logger) bundled(rust-crate:slab) bundled(rust-crate:smallvec) bundled(rust-crate:socket2) bundled(rust-crate:strsim) bundled(rust-crate:syn) bundled(rust-crate:tempfile) bundled(rust-crate:term) bundled(rust-crate:termcolor) bundled(rust-crate:termion) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:time) bundled(rust-crate:time-core) bundled(rust-crate:time-macros) bundled(rust-crate:tinyvec) bundled(rust-crate:tinyvec_macros) bundled(rust-crate:tokio) bundled(rust-crate:tokio-macros) bundled(rust-crate:tokio-native-tls) bundled(rust-crate:tokio-util) bundled(rust-crate:tower-service) bundled(rust-crate:tracing) bundled(rust-crate:tracing-core) bundled(rust-crate:try-lock) bundled(rust-crate:tui) bundled(rust-crate:unicode-bidi) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-normalization) bundled(rust-crate:unicode-segmentation) bundled(rust-crate:unicode-width) bundled(rust-crate:url) bundled(rust-crate:version_check) bundled(rust-crate:want) bundled(rust-crate:yaml-rust) bundled(rust-crate:zeroize) hoard hoard(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
