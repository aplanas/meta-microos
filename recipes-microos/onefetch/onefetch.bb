SUMMARY = "Git repository summary on your terminal"
DESCRIPTION = "Onefetch is a command line tool that displays information about your Git repository directly on your terminal."
LICENSE = "GPL-2.0-only & MIT"

PV = "2.17.1~0"

RPM_NAME = "onefetch-2.17.1~0-1.1.aarch64.rpm"
RPM_HASH = "bed04c372a4b88f1e39bcba8632ae629ff954b2cdca8818f78296554af7d6ee982712bf4d5d186966cc4f922a729b16006df503c32106a77dd4d4ff4eff74d4d"

RPROVIDES:${PN} += "bundled(rust-crate:addr2line) bundled(rust-crate:adler) bundled(rust-crate:ahash) bundled(rust-crate:aho-corasick) bundled(rust-crate:ansi_term) bundled(rust-crate:anstream) bundled(rust-crate:anstyle) bundled(rust-crate:anstyle-parse) bundled(rust-crate:anstyle-query) bundled(rust-crate:anyhow) bundled(rust-crate:arc-swap) bundled(rust-crate:arrayvec) bundled(rust-crate:askalono) bundled(rust-crate:atty) bundled(rust-crate:autocfg) bundled(rust-crate:backtrace) bundled(rust-crate:base64) bundled(rust-crate:bit_field) bundled(rust-crate:bitflags) bundled(rust-crate:block-buffer) bundled(rust-crate:bstr) bundled(rust-crate:btoi) bundled(rust-crate:byte-unit) bundled(rust-crate:bytecount) bundled(rust-crate:bytemuck) bundled(rust-crate:byteorder) bundled(rust-crate:bytesize) bundled(rust-crate:cargo_toml) bundled(rust-crate:cc) bundled(rust-crate:cfg-if) bundled(rust-crate:chrono) bundled(rust-crate:chrono-tz) bundled(rust-crate:chrono-tz-build) bundled(rust-crate:clap) bundled(rust-crate:clap_builder) bundled(rust-crate:clap_complete) bundled(rust-crate:clap_derive) bundled(rust-crate:clap_lex) bundled(rust-crate:clru) bundled(rust-crate:cmake) bundled(rust-crate:color_quant) bundled(rust-crate:colorchoice) bundled(rust-crate:cpufeatures) bundled(rust-crate:crc32fast) bundled(rust-crate:crossbeam) bundled(rust-crate:crossbeam-channel) bundled(rust-crate:crossbeam-deque) bundled(rust-crate:crossbeam-epoch) bundled(rust-crate:crossbeam-queue) bundled(rust-crate:crossbeam-utils) bundled(rust-crate:crypto-common) bundled(rust-crate:ctor) bundled(rust-crate:dashmap) bundled(rust-crate:deunicode) bundled(rust-crate:digest) bundled(rust-crate:dirs) bundled(rust-crate:dirs-sys) bundled(rust-crate:either) bundled(rust-crate:encoding_rs) bundled(rust-crate:encoding_rs_io) bundled(rust-crate:env_logger) bundled(rust-crate:erased-serde) bundled(rust-crate:exr) bundled(rust-crate:fastrand) bundled(rust-crate:fdeflate) bundled(rust-crate:filetime) bundled(rust-crate:flate2) bundled(rust-crate:flume) bundled(rust-crate:fnv) bundled(rust-crate:form_urlencoded) bundled(rust-crate:futures-core) bundled(rust-crate:futures-sink) bundled(rust-crate:generic-array) bundled(rust-crate:getrandom) bundled(rust-crate:ghost) bundled(rust-crate:gif) bundled(rust-crate:gimli) bundled(rust-crate:git2) bundled(rust-crate:gix) bundled(rust-crate:gix-actor) bundled(rust-crate:gix-attributes) bundled(rust-crate:gix-bitmap) bundled(rust-crate:gix-chunk) bundled(rust-crate:gix-command) bundled(rust-crate:gix-config) bundled(rust-crate:gix-config-value) bundled(rust-crate:gix-credentials) bundled(rust-crate:gix-date) bundled(rust-crate:gix-diff) bundled(rust-crate:gix-discover) bundled(rust-crate:gix-features) bundled(rust-crate:gix-fs) bundled(rust-crate:gix-glob) bundled(rust-crate:gix-hash) bundled(rust-crate:gix-hashtable) bundled(rust-crate:gix-ignore) bundled(rust-crate:gix-index) bundled(rust-crate:gix-lock) bundled(rust-crate:gix-mailmap) bundled(rust-crate:gix-object) bundled(rust-crate:gix-odb) bundled(rust-crate:gix-pack) bundled(rust-crate:gix-path) bundled(rust-crate:gix-prompt) bundled(rust-crate:gix-quote) bundled(rust-crate:gix-ref) bundled(rust-crate:gix-refspec) bundled(rust-crate:gix-revision) bundled(rust-crate:gix-sec) bundled(rust-crate:gix-tempfile) bundled(rust-crate:gix-traverse) bundled(rust-crate:gix-url) bundled(rust-crate:gix-utils) bundled(rust-crate:gix-validate) bundled(rust-crate:gix-worktree) bundled(rust-crate:globset) bundled(rust-crate:globwalk) bundled(rust-crate:grep-matcher) bundled(rust-crate:grep-searcher) bundled(rust-crate:half) bundled(rust-crate:hashbrown) bundled(rust-crate:heck) bundled(rust-crate:hex) bundled(rust-crate:home) bundled(rust-crate:human-panic) bundled(rust-crate:human_format) bundled(rust-crate:humansize) bundled(rust-crate:humantime) bundled(rust-crate:iana-time-zone) bundled(rust-crate:idna) bundled(rust-crate:ignore) bundled(rust-crate:image) bundled(rust-crate:imara-diff) bundled(rust-crate:indexmap) bundled(rust-crate:instant) bundled(rust-crate:inventory) bundled(rust-crate:io-close) bundled(rust-crate:io-lifetimes) bundled(rust-crate:is-terminal) bundled(rust-crate:itoa) bundled(rust-crate:jobserver) bundled(rust-crate:jpeg-decoder) bundled(rust-crate:jwalk) bundled(rust-crate:kstring) bundled(rust-crate:lazy_static) bundled(rust-crate:lebe) bundled(rust-crate:libc) bundled(rust-crate:libgit2-sys) bundled(rust-crate:libz-ng-sys) bundled(rust-crate:libz-sys) bundled(rust-crate:linked-hash-map) bundled(rust-crate:linux-raw-sys) bundled(rust-crate:lock_api) bundled(rust-crate:log) bundled(rust-crate:memchr) bundled(rust-crate:memmap2) bundled(rust-crate:memoffset) bundled(rust-crate:minimal-lexical) bundled(rust-crate:miniz_oxide) bundled(rust-crate:nanorand) bundled(rust-crate:nom) bundled(rust-crate:npm-package-json) bundled(rust-crate:num-format) bundled(rust-crate:num-integer) bundled(rust-crate:num-rational) bundled(rust-crate:num-traits) bundled(rust-crate:num_cpus) bundled(rust-crate:num_threads) bundled(rust-crate:object) bundled(rust-crate:once_cell) bundled(rust-crate:onefetch) bundled(rust-crate:onefetch-ascii) bundled(rust-crate:onefetch-image) bundled(rust-crate:onefetch-manifest) bundled(rust-crate:os_info) bundled(rust-crate:owo-colors) bundled(rust-crate:parking_lot) bundled(rust-crate:parking_lot_core) bundled(rust-crate:parse-zoneinfo) bundled(rust-crate:paste) bundled(rust-crate:percent-encoding) bundled(rust-crate:pest) bundled(rust-crate:pest_derive) bundled(rust-crate:pest_generator) bundled(rust-crate:pest_meta) bundled(rust-crate:phf) bundled(rust-crate:phf_codegen) bundled(rust-crate:phf_generator) bundled(rust-crate:phf_shared) bundled(rust-crate:pin-project) bundled(rust-crate:pin-project-internal) bundled(rust-crate:pkg-config) bundled(rust-crate:png) bundled(rust-crate:ppv-lite86) bundled(rust-crate:proc-macro2) bundled(rust-crate:prodash) bundled(rust-crate:qoi) bundled(rust-crate:quote) bundled(rust-crate:rand) bundled(rust-crate:rand_chacha) bundled(rust-crate:rand_core) bundled(rust-crate:rayon) bundled(rust-crate:rayon-core) bundled(rust-crate:regex) bundled(rust-crate:regex-automata) bundled(rust-crate:regex-syntax) bundled(rust-crate:rmp) bundled(rust-crate:rmp-serde) bundled(rust-crate:rustc-demangle) bundled(rust-crate:rustix) bundled(rust-crate:rustversion) bundled(rust-crate:ryu) bundled(rust-crate:same-file) bundled(rust-crate:scopeguard) bundled(rust-crate:serde) bundled(rust-crate:serde_derive) bundled(rust-crate:serde_json) bundled(rust-crate:serde_spanned) bundled(rust-crate:serde_yaml) bundled(rust-crate:sha1_smol) bundled(rust-crate:sha2) bundled(rust-crate:signal-hook) bundled(rust-crate:signal-hook-registry) bundled(rust-crate:simd-adler32) bundled(rust-crate:siphasher) bundled(rust-crate:slug) bundled(rust-crate:smallvec) bundled(rust-crate:spin) bundled(rust-crate:static_assertions) bundled(rust-crate:strsim) bundled(rust-crate:strum) bundled(rust-crate:strum_macros) bundled(rust-crate:syn) bundled(rust-crate:tempfile) bundled(rust-crate:tera) bundled(rust-crate:term_size) bundled(rust-crate:termcolor) bundled(rust-crate:textwrap) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:thread_local) bundled(rust-crate:tiff) bundled(rust-crate:time) bundled(rust-crate:time-core) bundled(rust-crate:time-humanize) bundled(rust-crate:time-macros) bundled(rust-crate:tinyvec) bundled(rust-crate:tinyvec_macros) bundled(rust-crate:tokei) bundled(rust-crate:toml) bundled(rust-crate:toml_datetime) bundled(rust-crate:toml_edit) bundled(rust-crate:typenum) bundled(rust-crate:typetag) bundled(rust-crate:typetag-impl) bundled(rust-crate:ucd-trie) bundled(rust-crate:uluru) bundled(rust-crate:uncased) bundled(rust-crate:unic-char-property) bundled(rust-crate:unic-char-range) bundled(rust-crate:unic-common) bundled(rust-crate:unic-segment) bundled(rust-crate:unic-ucd-segment) bundled(rust-crate:unic-ucd-version) bundled(rust-crate:unicode-bidi) bundled(rust-crate:unicode-bom) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-normalization) bundled(rust-crate:unicode-width) bundled(rust-crate:unsafe-libyaml) bundled(rust-crate:url) bundled(rust-crate:utf8-width) bundled(rust-crate:utf8parse) bundled(rust-crate:uuid) bundled(rust-crate:vec_map) bundled(rust-crate:version_check) bundled(rust-crate:walkdir) bundled(rust-crate:weezl) bundled(rust-crate:winnow) bundled(rust-crate:yaml-rust) bundled(rust-crate:zstd) bundled(rust-crate:zstd-safe) bundled(rust-crate:zstd-sys) bundled(rust-crate:zune-inflate) onefetch onefetch(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
