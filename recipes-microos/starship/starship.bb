SUMMARY = "A customizable prompt for many shells"
DESCRIPTION = "Starship generates shell code which modifies the current shell \
behavior to display an extravagant prompt. It installs a hook before \
every command invocation to gather additional information for the \
prompt, which increases the latency of the prompt (by about 5 ms with \
bash on a contemporary 3700X CPU). \
The default setup requires Nerd Font and a terminal in dark colors. \
dash is not supported as of 1.10.2."
LICENSE = "ISC"

PV = "1.14.2"

RPM_NAME = "starship-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "e0575156a29568a1b4b89f69705b59fbfba10aaecf3e5af2436b889897f90a994dac31412aafe6ffabc54f0b9f35ed655485112fa615983f63e481d40b5c27b5"

RPROVIDES:${PN} += "bundled(rust-crate:adler) \
bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anstream) \
bundled(rust-crate:anstyle) \
bundled(rust-crate:anstyle-parse) \
bundled(rust-crate:anstyle-query) \
bundled(rust-crate:arc-swap) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:async-broadcast) \
bundled(rust-crate:async-channel) \
bundled(rust-crate:async-executor) \
bundled(rust-crate:async-fs) \
bundled(rust-crate:async-io) \
bundled(rust-crate:async-lock) \
bundled(rust-crate:async-recursion) \
bundled(rust-crate:async-task) \
bundled(rust-crate:async-trait) \
bundled(rust-crate:atomic-waker) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:blocking) \
bundled(rust-crate:bstr) \
bundled(rust-crate:btoi) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bytesize) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_builder) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:clru) \
bundled(rust-crate:cmake) \
bundled(rust-crate:colorchoice) \
bundled(rust-crate:concurrent-queue) \
bundled(rust-crate:const_format) \
bundled(rust-crate:const_format_proc_macros) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crossbeam) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-deque) \
bundled(rust-crate:crossbeam-epoch) \
bundled(rust-crate:crossbeam-queue) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:derivative) \
bundled(rust-crate:digest) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-next) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:dlv-list) \
bundled(rust-crate:dunce) \
bundled(rust-crate:either) \
bundled(rust-crate:enumflags2) \
bundled(rust-crate:enumflags2_derive) \
bundled(rust-crate:errno) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:filetime) \
bundled(rust-crate:flate2) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-lite) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:gethostname) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:gix) \
bundled(rust-crate:gix-actor) \
bundled(rust-crate:gix-attributes) \
bundled(rust-crate:gix-bitmap) \
bundled(rust-crate:gix-chunk) \
bundled(rust-crate:gix-command) \
bundled(rust-crate:gix-config) \
bundled(rust-crate:gix-config-value) \
bundled(rust-crate:gix-credentials) \
bundled(rust-crate:gix-date) \
bundled(rust-crate:gix-diff) \
bundled(rust-crate:gix-discover) \
bundled(rust-crate:gix-features) \
bundled(rust-crate:gix-glob) \
bundled(rust-crate:gix-hash) \
bundled(rust-crate:gix-hashtable) \
bundled(rust-crate:gix-index) \
bundled(rust-crate:gix-lock) \
bundled(rust-crate:gix-mailmap) \
bundled(rust-crate:gix-object) \
bundled(rust-crate:gix-odb) \
bundled(rust-crate:gix-pack) \
bundled(rust-crate:gix-path) \
bundled(rust-crate:gix-prompt) \
bundled(rust-crate:gix-quote) \
bundled(rust-crate:gix-ref) \
bundled(rust-crate:gix-refspec) \
bundled(rust-crate:gix-revision) \
bundled(rust-crate:gix-sec) \
bundled(rust-crate:gix-tempfile) \
bundled(rust-crate:gix-traverse) \
bundled(rust-crate:gix-url) \
bundled(rust-crate:gix-validate) \
bundled(rust-crate:gix-worktree) \
bundled(rust-crate:guess_host_triple) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:heck) \
bundled(rust-crate:hex) \
bundled(rust-crate:home) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:idna) \
bundled(rust-crate:imara-diff) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:io-close) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:is_debug) \
bundled(rust-crate:itertools) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jwalk) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:lazycell) \
bundled(rust-crate:libc) \
bundled(rust-crate:libz-ng-sys) \
bundled(rust-crate:linked-hash-map) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memmap2) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:nix) \
bundled(rust-crate:nom) \
bundled(rust-crate:notify-rust) \
bundled(rust-crate:nu-ansi-term) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:num_threads) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:open) \
bundled(rust-crate:ordered-multimap) \
bundled(rust-crate:ordered-stream) \
bundled(rust-crate:os_info) \
bundled(rust-crate:parking) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:path-slash) \
bundled(rust-crate:pathdiff) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pest) \
bundled(rust-crate:pest_derive) \
bundled(rust-crate:pest_generator) \
bundled(rust-crate:pest_meta) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:polling) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-crate) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:process_control) \
bundled(rust-crate:prodash) \
bundled(rust-crate:quick-xml) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:rayon) \
bundled(rust-crate:rayon-core) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rust-ini) \
bundled(rust-crate:rustix) \
bundled(rust-crate:ryu) \
bundled(rust-crate:same-file) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:semver) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_repr) \
bundled(rust-crate:serde_spanned) \
bundled(rust-crate:sha1) \
bundled(rust-crate:sha1-asm) \
bundled(rust-crate:sha1_smol) \
bundled(rust-crate:sha2) \
bundled(rust-crate:shadow-rs) \
bundled(rust-crate:shell-words) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:socket2) \
bundled(rust-crate:starship) \
bundled(rust-crate:starship-battery) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:systemstat) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:toml) \
bundled(rust-crate:toml_datetime) \
bundled(rust-crate:toml_edit) \
bundled(rust-crate:tracing) \
bundled(rust-crate:tracing-attributes) \
bundled(rust-crate:tracing-core) \
bundled(rust-crate:typenum) \
bundled(rust-crate:ucd-trie) \
bundled(rust-crate:uluru) \
bundled(rust-crate:unicase) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-bom) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unicode-xid) \
bundled(rust-crate:uom) \
bundled(rust-crate:url) \
bundled(rust-crate:urlencoding) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:version_check) \
bundled(rust-crate:versions) \
bundled(rust-crate:waker-fn) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:which) \
bundled(rust-crate:winnow) \
bundled(rust-crate:yaml-rust) \
bundled(rust-crate:zbus) \
bundled(rust-crate:zbus_macros) \
bundled(rust-crate:zbus_names) \
bundled(rust-crate:zvariant) \
bundled(rust-crate:zvariant_derive) \
bundled(rust-crate:zvariant_utils) \
starship \
starship(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
