SUMMARY = "GPU-accelerated cross-platform terminal emulator and multiplexer"
DESCRIPTION = "Wezterm is a GPU-accelerated terminal emulator written in Rust. It supports \
ligatures, font fallback and true color. It features dynamic color schemes, hyperlinks, \
and multiplex terminal panes."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & LGPL-2.1-only & MIT & MPL-2.0 & WTFPL & Zlib & MIT"

PV = "20230408.112425.69ae8472"

RPM_NAME = "wezterm-20230408.112425.69ae8472-1.1.aarch64.rpm"
RPM_HASH = "4a003ce36ee488957f36888adce2bf7e35faf0c4df8c390c27860e1cea8bd93886b8be9c8575b2a26dae802910afb2187aa56cafb3a655048aa70de765d97644"

RPROVIDES:${PN} += "application() \
application(org.wezfurlong.wezterm.desktop) \
bundled(rust-crate:addr2line) \
bundled(rust-crate:adler) \
bundled(rust-crate:ahash) \
bundled(rust-crate:aho-corasick) \
bundled(rust-crate:anstream) \
bundled(rust-crate:anstyle) \
bundled(rust-crate:anstyle-parse) \
bundled(rust-crate:anstyle-query) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:arrayref) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:ash) \
bundled(rust-crate:async-broadcast) \
bundled(rust-crate:async-channel) \
bundled(rust-crate:async-executor) \
bundled(rust-crate:async-fs) \
bundled(rust-crate:async-io) \
bundled(rust-crate:async-lock) \
bundled(rust-crate:async-net) \
bundled(rust-crate:async-process) \
bundled(rust-crate:async-recursion) \
bundled(rust-crate:async-task) \
bundled(rust-crate:async-trait) \
bundled(rust-crate:async_ossl) \
bundled(rust-crate:atomic) \
bundled(rust-crate:atomic-waker) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:backtrace) \
bundled(rust-crate:base64) \
bundled(rust-crate:battery) \
bundled(rust-crate:bintree) \
bundled(rust-crate:bit-set) \
bundled(rust-crate:bit-vec) \
bundled(rust-crate:bit_field) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:blocking) \
bundled(rust-crate:bstr) \
bundled(rust-crate:bytemuck) \
bundled(rust-crate:bytemuck_derive) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bytes) \
bundled(rust-crate:camino) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:chrono) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_builder) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_complete_fig) \
bundled(rust-crate:clap_derive) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:codec) \
bundled(rust-crate:codespan-reporting) \
bundled(rust-crate:color-funcs) \
bundled(rust-crate:color_quant) \
bundled(rust-crate:colorchoice) \
bundled(rust-crate:colorgrad) \
bundled(rust-crate:com-rs) \
bundled(rust-crate:concurrent-queue) \
bundled(rust-crate:config) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crc32fast) \
bundled(rust-crate:crossbeam) \
bundled(rust-crate:crossbeam-channel) \
bundled(rust-crate:crossbeam-deque) \
bundled(rust-crate:crossbeam-epoch) \
bundled(rust-crate:crossbeam-queue) \
bundled(rust-crate:crossbeam-utils) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:csscolorparser) \
bundled(rust-crate:darling) \
bundled(rust-crate:darling_core) \
bundled(rust-crate:darling_macro) \
bundled(rust-crate:dashmap) \
bundled(rust-crate:deltae) \
bundled(rust-crate:derivative) \
bundled(rust-crate:dhat) \
bundled(rust-crate:digest) \
bundled(rust-crate:dirs) \
bundled(rust-crate:dirs-next) \
bundled(rust-crate:dirs-sys) \
bundled(rust-crate:dirs-sys-next) \
bundled(rust-crate:dlib) \
bundled(rust-crate:downcast-rs) \
bundled(rust-crate:either) \
bundled(rust-crate:emojis) \
bundled(rust-crate:encoding_rs) \
bundled(rust-crate:enum-display-derive) \
bundled(rust-crate:enumflags2) \
bundled(rust-crate:enumflags2_derive) \
bundled(rust-crate:env-bootstrap) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:euclid) \
bundled(rust-crate:event-listener) \
bundled(rust-crate:exr) \
bundled(rust-crate:fancy-regex) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:fdeflate) \
bundled(rust-crate:filedescriptor) \
bundled(rust-crate:filenamegen) \
bundled(rust-crate:filesystem) \
bundled(rust-crate:filetime) \
bundled(rust-crate:finl_unicode) \
bundled(rust-crate:fixedbitset) \
bundled(rust-crate:flate2) \
bundled(rust-crate:flume) \
bundled(rust-crate:fnv) \
bundled(rust-crate:fontconfig) \
bundled(rust-crate:foreign-types) \
bundled(rust-crate:foreign-types-shared) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:frecency) \
bundled(rust-crate:freetype) \
bundled(rust-crate:futures) \
bundled(rust-crate:futures-channel) \
bundled(rust-crate:futures-core) \
bundled(rust-crate:futures-executor) \
bundled(rust-crate:futures-io) \
bundled(rust-crate:futures-lite) \
bundled(rust-crate:futures-macro) \
bundled(rust-crate:futures-sink) \
bundled(rust-crate:futures-task) \
bundled(rust-crate:futures-timer) \
bundled(rust-crate:futures-util) \
bundled(rust-crate:fuzzy-matcher) \
bundled(rust-crate:fxhash) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:gethostname) \
bundled(rust-crate:getopts) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:gif) \
bundled(rust-crate:gimli) \
bundled(rust-crate:git2) \
bundled(rust-crate:gl_generator) \
bundled(rust-crate:glium) \
bundled(rust-crate:glow) \
bundled(rust-crate:governor) \
bundled(rust-crate:gpu-alloc) \
bundled(rust-crate:gpu-alloc-types) \
bundled(rust-crate:gpu-allocator) \
bundled(rust-crate:gpu-descriptor) \
bundled(rust-crate:gpu-descriptor-types) \
bundled(rust-crate:guillotiere) \
bundled(rust-crate:half) \
bundled(rust-crate:harfbuzz) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hassle-rs) \
bundled(rust-crate:hdrhistogram) \
bundled(rust-crate:heck) \
bundled(rust-crate:hex) \
bundled(rust-crate:hexf-parse) \
bundled(rust-crate:hostname) \
bundled(rust-crate:http_req) \
bundled(rust-crate:humansize) \
bundled(rust-crate:humantime) \
bundled(rust-crate:iana-time-zone) \
bundled(rust-crate:ident_case) \
bundled(rust-crate:idna) \
bundled(rust-crate:image) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:inotify) \
bundled(rust-crate:inotify-sys) \
bundled(rust-crate:instant) \
bundled(rust-crate:intrusive-collections) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:ioctl-rs) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itoa) \
bundled(rust-crate:jobserver) \
bundled(rust-crate:jpeg-decoder) \
bundled(rust-crate:json) \
bundled(rust-crate:khronos-egl) \
bundled(rust-crate:khronos_api) \
bundled(rust-crate:lab) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:lazycell) \
bundled(rust-crate:leb128) \
bundled(rust-crate:lebe) \
bundled(rust-crate:lfucache) \
bundled(rust-crate:libc) \
bundled(rust-crate:libgit2-sys) \
bundled(rust-crate:libloading) \
bundled(rust-crate:libm) \
bundled(rust-crate:libssh-rs) \
bundled(rust-crate:libssh-rs-sys) \
bundled(rust-crate:libssh2-sys) \
bundled(rust-crate:libz-sys) \
bundled(rust-crate:line-wrap) \
bundled(rust-crate:line_drawing) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:lock_api) \
bundled(rust-crate:log) \
bundled(rust-crate:logging) \
bundled(rust-crate:lru) \
bundled(rust-crate:lua-src) \
bundled(rust-crate:luahelper) \
bundled(rust-crate:luajit-src) \
bundled(rust-crate:mac_address) \
bundled(rust-crate:match_cfg) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memmap2) \
bundled(rust-crate:memmem) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:metrics) \
bundled(rust-crate:metrics-macros) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:miniz_oxide) \
bundled(rust-crate:mintex) \
bundled(rust-crate:mio) \
bundled(rust-crate:mlua) \
bundled(rust-crate:mux) \
bundled(rust-crate:mux-lua) \
bundled(rust-crate:naga) \
bundled(rust-crate:names) \
bundled(rust-crate:nanorand) \
bundled(rust-crate:native-tls) \
bundled(rust-crate:nix) \
bundled(rust-crate:no-std-compat) \
bundled(rust-crate:nom) \
bundled(rust-crate:nonzero_ext) \
bundled(rust-crate:notify) \
bundled(rust-crate:num) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-complex) \
bundled(rust-crate:num-derive) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-rational) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:num_cpus) \
bundled(rust-crate:object) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:openssl) \
bundled(rust-crate:openssl-probe) \
bundled(rust-crate:openssl-src) \
bundled(rust-crate:openssl-sys) \
bundled(rust-crate:ordered-float) \
bundled(rust-crate:ordered-stream) \
bundled(rust-crate:parking) \
bundled(rust-crate:parking_lot) \
bundled(rust-crate:parking_lot_core) \
bundled(rust-crate:pem) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:pest) \
bundled(rust-crate:pest_derive) \
bundled(rust-crate:pest_generator) \
bundled(rust-crate:pest_meta) \
bundled(rust-crate:phf) \
bundled(rust-crate:phf_codegen) \
bundled(rust-crate:phf_generator) \
bundled(rust-crate:phf_macros) \
bundled(rust-crate:phf_shared) \
bundled(rust-crate:pin-project) \
bundled(rust-crate:pin-project-internal) \
bundled(rust-crate:pin-project-lite) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:pkg-config) \
bundled(rust-crate:plist) \
bundled(rust-crate:plugin) \
bundled(rust-crate:png) \
bundled(rust-crate:polling) \
bundled(rust-crate:portable-pty) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-crate) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:procinfo) \
bundled(rust-crate:procinfo-funcs) \
bundled(rust-crate:profiling) \
bundled(rust-crate:promise) \
bundled(rust-crate:pulldown-cmark) \
bundled(rust-crate:pure-rust-locales) \
bundled(rust-crate:qoi) \
bundled(rust-crate:quanta) \
bundled(rust-crate:quick-xml) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:range-alloc) \
bundled(rust-crate:rangeset) \
bundled(rust-crate:ratelim) \
bundled(rust-crate:raw-window-handle) \
bundled(rust-crate:rayon) \
bundled(rust-crate:rayon-core) \
bundled(rust-crate:rcgen) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:renderdoc-sys) \
bundled(rust-crate:resize) \
bundled(rust-crate:rgb) \
bundled(rust-crate:ring) \
bundled(rust-crate:rustc-demangle) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:rustix) \
bundled(rust-crate:ryu) \
bundled(rust-crate:safemem) \
bundled(rust-crate:same-file) \
bundled(rust-crate:scoped-tls) \
bundled(rust-crate:scopeguard) \
bundled(rust-crate:semver) \
bundled(rust-crate:semver-parser) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:serde_repr) \
bundled(rust-crate:serde_spanned) \
bundled(rust-crate:serde_with) \
bundled(rust-crate:serde_with_macros) \
bundled(rust-crate:serde_yaml) \
bundled(rust-crate:serial) \
bundled(rust-crate:serial-core) \
bundled(rust-crate:serial-unix) \
bundled(rust-crate:sha1) \
bundled(rust-crate:sha2) \
bundled(rust-crate:share-data) \
bundled(rust-crate:shell-words) \
bundled(rust-crate:shlex) \
bundled(rust-crate:signal-hook) \
bundled(rust-crate:signal-hook-registry) \
bundled(rust-crate:simd-adler32) \
bundled(rust-crate:siphasher) \
bundled(rust-crate:slab) \
bundled(rust-crate:smallvec) \
bundled(rust-crate:smawk) \
bundled(rust-crate:smithay-client-toolkit) \
bundled(rust-crate:smol) \
bundled(rust-crate:socket2) \
bundled(rust-crate:spa) \
bundled(rust-crate:spawn-funcs) \
bundled(rust-crate:spin) \
bundled(rust-crate:spirv) \
bundled(rust-crate:ssh-funcs) \
bundled(rust-crate:ssh2) \
bundled(rust-crate:starship-battery) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strict-num) \
bundled(rust-crate:strip-ansi-escapes) \
bundled(rust-crate:strsim) \
bundled(rust-crate:svg_fmt) \
bundled(rust-crate:syn) \
bundled(rust-crate:sys-info) \
bundled(rust-crate:tabout) \
bundled(rust-crate:takeable-option) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:terminfo) \
bundled(rust-crate:termios) \
bundled(rust-crate:termwiz) \
bundled(rust-crate:termwiz-funcs) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:thousands) \
bundled(rust-crate:thread_local) \
bundled(rust-crate:tiff) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:time-funcs) \
bundled(rust-crate:time-macros) \
bundled(rust-crate:tiny-skia) \
bundled(rust-crate:tiny-skia-path) \
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
bundled(rust-crate:umask) \
bundled(rust-crate:unicase) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-linebreak) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:unicode-xid) \
bundled(rust-crate:unsafe-libyaml) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:uom) \
bundled(rust-crate:url) \
bundled(rust-crate:utf8parse) \
bundled(rust-crate:uuid) \
bundled(rust-crate:varbincode) \
bundled(rust-crate:version_check) \
bundled(rust-crate:vtparse) \
bundled(rust-crate:waker-fn) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:wayland-client) \
bundled(rust-crate:wayland-commons) \
bundled(rust-crate:wayland-cursor) \
bundled(rust-crate:wayland-egl) \
bundled(rust-crate:wayland-protocols) \
bundled(rust-crate:wayland-scanner) \
bundled(rust-crate:wayland-sys) \
bundled(rust-crate:weezl) \
bundled(rust-crate:wezterm) \
bundled(rust-crate:wezterm-bidi) \
bundled(rust-crate:wezterm-blob-leases) \
bundled(rust-crate:wezterm-client) \
bundled(rust-crate:wezterm-color-types) \
bundled(rust-crate:wezterm-config-derive) \
bundled(rust-crate:wezterm-dynamic) \
bundled(rust-crate:wezterm-dynamic-derive) \
bundled(rust-crate:wezterm-font) \
bundled(rust-crate:wezterm-gui) \
bundled(rust-crate:wezterm-gui-subcommands) \
bundled(rust-crate:wezterm-input-types) \
bundled(rust-crate:wezterm-mux-server-impl) \
bundled(rust-crate:wezterm-open-url) \
bundled(rust-crate:wezterm-ssh) \
bundled(rust-crate:wezterm-term) \
bundled(rust-crate:wezterm-toast-notification) \
bundled(rust-crate:wgpu) \
bundled(rust-crate:wgpu-core) \
bundled(rust-crate:wgpu-hal) \
bundled(rust-crate:wgpu-types) \
bundled(rust-crate:widestring) \
bundled(rust-crate:winapi) \
bundled(rust-crate:window) \
bundled(rust-crate:window-funcs) \
bundled(rust-crate:winnow) \
bundled(rust-crate:x11) \
bundled(rust-crate:xcb) \
bundled(rust-crate:xcb-imdkit) \
bundled(rust-crate:xcursor) \
bundled(rust-crate:xkbcommon) \
bundled(rust-crate:xml-rs) \
bundled(rust-crate:yasna) \
bundled(rust-crate:zbus) \
bundled(rust-crate:zbus_macros) \
bundled(rust-crate:zbus_names) \
bundled(rust-crate:zstd) \
bundled(rust-crate:zstd-safe) \
bundled(rust-crate:zstd-sys) \
bundled(rust-crate:zune-inflate) \
bundled(rust-crate:zvariant) \
bundled(rust-crate:zvariant_derive) \
bundled(rust-crate:zvariant_utils) \
config(wezterm) \
metainfo() \
metainfo(org.wezfurlong.wezterm.appdata.xml) \
wezterm \
wezterm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libxcb-image.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_0.6.0)(64bit) \
libz.so.1()(64bit) \
terminfo"

inherit rpm
