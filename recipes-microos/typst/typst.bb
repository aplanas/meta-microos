SUMMARY = "A new markup-based typesetting system that is powerful and easy to learn"
DESCRIPTION = "Typst is a new markup-based typesetting system that is designed to be as powerful as LaTeX while being much easier to learn and use."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "typst-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "becfb8768095f1c589b68e010666f5e01ebbb445c1f56082b3f8cdc7b2822f401c8417d99abc16fdf959ed2325f57f8a304b742648dbc857a7357e5048f8fb95"

RPROVIDES:${PN} += "bundled(rust-crate:adler) \
bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anstream) \
bundled(rust-crate:anstyle) \
bundled(rust-crate:anstyle-parse) \
bundled(rust-crate:anstyle-query) \
bundled(rust-crate:arrayref) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:biblatex) \
bundled(rust-crate:bincode) \
bundled(rust-crate:bit-set) \
bundled(rust-crate:bit-vec) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:bytemuck) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chinese-number) \
bundled(rust-crate:chinese-variant) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_builder) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:clap_mangen) \
bundled(rust-crate:codespan-reporting) \
bundled(rust-crate:color_quant) \
bundled(rust-crate:colorchoice) \
bundled(rust-crate:comemo) \
bundled(rust-crate:comemo-macros) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-deque) \
bundled(rust-crate:crossbeam-epoch) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:csv) \
bundled(rust-crate:csv-core) \
bundled(rust-crate:dashmap) \
bundled(rust-crate:data-url) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:displaydoc) \
bundled(rust-crate:ecow) \
bundled(rust-crate:either) \
bundled(rust-crate:elsa) \
bundled(rust-crate:enum-ordinalize) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:fancy-regex) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:fdeflate) \
bundled(rust-crate:filetime) \
bundled(rust-crate:flate2) \
bundled(rust-crate:float-cmp) \
bundled(rust-crate:fnv) \
bundled(rust-crate:fontdb) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:gif) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hayagriva) \
bundled(rust-crate:heck) \
bundled(rust-crate:hypher) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:idna) \
bundled(rust-crate:if_chain) \
bundled(rust-crate:image) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:inferno) \
bundled(rust-crate:inotify) \
bundled(rust-crate:inotify-sys) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-docker) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:is-wsl) \
bundled(rust-crate:isolang) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jpeg-decoder) \
bundled(rust-crate:kurbo) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lipsum) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:matches) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memmap2) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:mio) \
bundled(rust-crate:notify) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-format) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-rational) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:numerals) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:open) \
bundled(rust-crate:overload) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:paste) \
bundled(rust-crate:pathdiff) \
bundled(rust-crate:pdf-writer) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:phf) \
bundled(rust-crate:phf_shared) \
bundled(rust-crate:pico-args) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pixglyph) \
bundled(rust-crate:png) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:psm) \
bundled(rust-crate:quick-xml) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:rayon) \
bundled(rust-crate:rayon-core) \
bundled(rust-crate:rctree) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:resvg) \
bundled(rust-crate:rgb) \
bundled(rust-crate:roff) \
bundled(rust-crate:roxmltree) \
bundled(rust-crate:rustc_version) \
bundled(rust-crate:rustix) \
bundled(rust-crate:rustversion) \
bundled(rust-crate:rustybuzz) \
bundled(rust-crate:ryu) \
bundled(rust-crate:safe_arch) \
bundled(rust-crate:same-file) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_spanned) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:sharded-slab) \
bundled(rust-crate:simd-adler32) \
bundled(rust-crate:simplecss) \
bundled(rust-crate:siphasher) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:stable_deref_trait) \
bundled(rust-crate:stacker) \
bundled(rust-crate:str_stack) \
bundled(rust-crate:strsim) \
bundled(rust-crate:strum) \
bundled(rust-crate:strum_macros) \
bundled(rust-crate:subsetter) \
bundled(rust-crate:svg2pdf) \
bundled(rust-crate:svgtypes) \
bundled(rust-crate:syn) \
bundled(rust-crate:syntect) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:tiny-skia) \
bundled(rust-crate:tinystr) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:toml) \
bundled(rust-crate:toml_datetime) \
bundled(rust-crate:toml_edit) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-attributes) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:tracing-error) \
bundled(rust-crate:tracing-flame) \
bundled(rust-crate:tracing-log) \
bundled(rust-crate:tracing-subscriber) \
bundled(rust-crate:ttf-parser) \
bundled(rust-crate:typed-arena) \
bundled(rust-crate:typst) \
bundled(rust-crate:typst-cli) \
bundled(rust-crate:typst-library) \
bundled(rust-crate:typst-macros) \
bundled(rust-crate:unic-langid) \
bundled(rust-crate:unic-langid-impl) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-bidi-mirroring) \
bundled(rust-crate:unicode-ccc) \
bundled(rust-crate:unicode-general-category) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-math-class) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-script) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-vo) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unicode-xid) \
bundled(rust-crate:unscanny) \
bundled(rust-crate:url) \
bundled(rust-crate:usvg) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:weezl) \
bundled(rust-crate:winnow) \
bundled(rust-crate:xi-unicode) \
bundled(rust-crate:xmlparser) \
bundled(rust-crate:xmp-writer) \
bundled(rust-crate:yaml-rust) \
typst \
typst(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
