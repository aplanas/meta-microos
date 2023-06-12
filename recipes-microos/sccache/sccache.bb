SUMMARY = "A compiler caching tool for Rust, C and C++ with optional cloud storage"
DESCRIPTION = "Sccache is a ccache-like tool. It is used as a compiler wrapper and \
avoids compilation when possible, storing a cache in a remote storage \
using the Amazon Simple Cloud Storage Service (S3) API, Redis or \
the Google Cloud Storage (GCS) API."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | CC0-1.0) & ((Apache-2.0 & BSD-2-Clause) | MIT) & (Apache-2.0 | MIT | BSD-2-Clause) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT"

PV = "0.5.0~2"

RPM_NAME = "sccache-0.5.0~2-1.1.aarch64.rpm"
RPM_HASH = "a649ba4cf150f7adf9325b6115038224f526558cf1f12fbc611ece1e735b999b66c0e788f1d34bbc0b7cb67684bcff6dc10495cc3076ad5b7efcaa784bd7995f"

RPROVIDES:${PN} += "bundled(rust-crate:adler) bundled(rust-crate:ahash) bundled(rust-crate:aho-corasick) bundled(rust-crate:anstream) bundled(rust-crate:anstyle) bundled(rust-crate:anstyle-parse) bundled(rust-crate:anstyle-query) bundled(rust-crate:anyhow) bundled(rust-crate:ar) bundled(rust-crate:arc-disk-cache) bundled(rust-crate:arc-swap) bundled(rust-crate:arrayref) bundled(rust-crate:arrayvec) bundled(rust-crate:async-compat) bundled(rust-crate:async-trait) bundled(rust-crate:autocfg) bundled(rust-crate:backon) bundled(rust-crate:base64) bundled(rust-crate:base64ct) bundled(rust-crate:bincode) bundled(rust-crate:bitflags) bundled(rust-crate:blake3) bundled(rust-crate:block-buffer) bundled(rust-crate:byteorder) bundled(rust-crate:bytes) bundled(rust-crate:cc) bundled(rust-crate:cfg-if) bundled(rust-crate:chrono) bundled(rust-crate:clap) bundled(rust-crate:clap_builder) bundled(rust-crate:clap_derive) bundled(rust-crate:clap_lex) bundled(rust-crate:colorchoice) bundled(rust-crate:combine) bundled(rust-crate:concread) bundled(rust-crate:const-oid) bundled(rust-crate:const-random) bundled(rust-crate:const-random-macro) bundled(rust-crate:constant_time_eq) bundled(rust-crate:core_affinity) bundled(rust-crate:cpufeatures) bundled(rust-crate:crc32c) bundled(rust-crate:crc32fast) bundled(rust-crate:crossbeam-epoch) bundled(rust-crate:crossbeam-queue) bundled(rust-crate:crossbeam-utils) bundled(rust-crate:crunchy) bundled(rust-crate:crypto-common) bundled(rust-crate:daemonize) bundled(rust-crate:data-encoding) bundled(rust-crate:der) bundled(rust-crate:digest) bundled(rust-crate:directories) bundled(rust-crate:dirs-sys) bundled(rust-crate:dlv-list) bundled(rust-crate:either) bundled(rust-crate:encoding) bundled(rust-crate:encoding-index-japanese) bundled(rust-crate:encoding-index-korean) bundled(rust-crate:encoding-index-simpchinese) bundled(rust-crate:encoding-index-singlebyte) bundled(rust-crate:encoding-index-tradchinese) bundled(rust-crate:encoding_index_tests) bundled(rust-crate:encoding_rs) bundled(rust-crate:enum-as-inner) bundled(rust-crate:env_logger) bundled(rust-crate:fastrand) bundled(rust-crate:filetime) bundled(rust-crate:flagset) bundled(rust-crate:flate2) bundled(rust-crate:flume) bundled(rust-crate:fnv) bundled(rust-crate:foreign-types) bundled(rust-crate:foreign-types-shared) bundled(rust-crate:form_urlencoded) bundled(rust-crate:fs-err) bundled(rust-crate:futures) bundled(rust-crate:futures-channel) bundled(rust-crate:futures-core) bundled(rust-crate:futures-executor) bundled(rust-crate:futures-io) bundled(rust-crate:futures-macro) bundled(rust-crate:futures-sink) bundled(rust-crate:futures-task) bundled(rust-crate:futures-util) bundled(rust-crate:generic-array) bundled(rust-crate:getrandom) bundled(rust-crate:gzp) bundled(rust-crate:h2) bundled(rust-crate:hashbrown) bundled(rust-crate:heck) bundled(rust-crate:hex) bundled(rust-crate:hmac) bundled(rust-crate:home) bundled(rust-crate:hostname) bundled(rust-crate:http) bundled(rust-crate:http-body) bundled(rust-crate:httparse) bundled(rust-crate:httpdate) bundled(rust-crate:humantime) bundled(rust-crate:hyper) bundled(rust-crate:hyper-rustls) bundled(rust-crate:hyper-tls) bundled(rust-crate:iana-time-zone) bundled(rust-crate:idna) bundled(rust-crate:indexmap) bundled(rust-crate:io-lifetimes) bundled(rust-crate:ipnet) bundled(rust-crate:is-terminal) bundled(rust-crate:itoa) bundled(rust-crate:jobserver) bundled(rust-crate:jsonwebtoken) bundled(rust-crate:lazy_static) bundled(rust-crate:libc) bundled(rust-crate:libm) bundled(rust-crate:linked-hash-map) bundled(rust-crate:linux-raw-sys) bundled(rust-crate:lock_api) bundled(rust-crate:log) bundled(rust-crate:lru) bundled(rust-crate:lru-cache) bundled(rust-crate:match_cfg) bundled(rust-crate:matches) bundled(rust-crate:md-5) bundled(rust-crate:memchr) bundled(rust-crate:memoffset) bundled(rust-crate:mime) bundled(rust-crate:miniz_oxide) bundled(rust-crate:mio) bundled(rust-crate:nanorand) bundled(rust-crate:native-tls) bundled(rust-crate:num-bigint) bundled(rust-crate:num-bigint-dig) bundled(rust-crate:num-integer) bundled(rust-crate:num-iter) bundled(rust-crate:num-traits) bundled(rust-crate:num_cpus) bundled(rust-crate:number_prefix) bundled(rust-crate:once_cell) bundled(rust-crate:opendal) bundled(rust-crate:openssl) bundled(rust-crate:openssl-macros) bundled(rust-crate:openssl-probe) bundled(rust-crate:openssl-sys) bundled(rust-crate:option-ext) bundled(rust-crate:ordered-multimap) bundled(rust-crate:parking_lot) bundled(rust-crate:parking_lot_core) bundled(rust-crate:pem) bundled(rust-crate:pem-rfc7468) bundled(rust-crate:percent-encoding) bundled(rust-crate:pin-project) bundled(rust-crate:pin-project-internal) bundled(rust-crate:pin-project-lite) bundled(rust-crate:pin-utils) bundled(rust-crate:pkcs1) bundled(rust-crate:pkcs8) bundled(rust-crate:pkg-config) bundled(rust-crate:ppv-lite86) bundled(rust-crate:proc-macro-hack) bundled(rust-crate:proc-macro2) bundled(rust-crate:quick-error) bundled(rust-crate:quick-xml) bundled(rust-crate:quote) bundled(rust-crate:rand) bundled(rust-crate:rand_chacha) bundled(rust-crate:rand_core) bundled(rust-crate:redis) bundled(rust-crate:regex) bundled(rust-crate:regex-syntax) bundled(rust-crate:reqsign) bundled(rust-crate:reqwest) bundled(rust-crate:resolv-conf) bundled(rust-crate:retry) bundled(rust-crate:ring) bundled(rust-crate:rsa) bundled(rust-crate:rust-ini) bundled(rust-crate:rustc_version) bundled(rust-crate:rustix) bundled(rust-crate:rustls) bundled(rust-crate:rustls-native-certs) bundled(rust-crate:rustls-pemfile) bundled(rust-crate:rustls-webpki) bundled(rust-crate:ryu) bundled(rust-crate:same-file) bundled(rust-crate:sccache) bundled(rust-crate:scopeguard) bundled(rust-crate:sct) bundled(rust-crate:semver) bundled(rust-crate:serde) bundled(rust-crate:serde_derive) bundled(rust-crate:serde_json) bundled(rust-crate:serde_spanned) bundled(rust-crate:serde_urlencoded) bundled(rust-crate:sha1) bundled(rust-crate:sha1_smol) bundled(rust-crate:sha2) bundled(rust-crate:signal-hook-registry) bundled(rust-crate:signature) bundled(rust-crate:simple_asn1) bundled(rust-crate:slab) bundled(rust-crate:smallvec) bundled(rust-crate:socket2) bundled(rust-crate:spin) bundled(rust-crate:spki) bundled(rust-crate:sptr) bundled(rust-crate:strip-ansi-escapes) bundled(rust-crate:strsim) bundled(rust-crate:subtle) bundled(rust-crate:syn) bundled(rust-crate:tar) bundled(rust-crate:tempfile) bundled(rust-crate:termcolor) bundled(rust-crate:terminal_size) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:time) bundled(rust-crate:time-core) bundled(rust-crate:time-macros) bundled(rust-crate:tiny-keccak) bundled(rust-crate:tinyvec) bundled(rust-crate:tinyvec_macros) bundled(rust-crate:tokio) bundled(rust-crate:tokio-macros) bundled(rust-crate:tokio-native-tls) bundled(rust-crate:tokio-rustls) bundled(rust-crate:tokio-serde) bundled(rust-crate:tokio-util) bundled(rust-crate:toml) bundled(rust-crate:toml_datetime) bundled(rust-crate:toml_edit) bundled(rust-crate:tower) bundled(rust-crate:tower-layer) bundled(rust-crate:tower-service) bundled(rust-crate:tracing) bundled(rust-crate:tracing-attributes) bundled(rust-crate:tracing-core) bundled(rust-crate:trust-dns-proto) bundled(rust-crate:trust-dns-resolver) bundled(rust-crate:try-lock) bundled(rust-crate:typenum) bundled(rust-crate:unicode-bidi) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-normalization) bundled(rust-crate:untrusted) bundled(rust-crate:url) bundled(rust-crate:utf8parse) bundled(rust-crate:uuid) bundled(rust-crate:version_check) bundled(rust-crate:vte) bundled(rust-crate:vte_generate_state_changes) bundled(rust-crate:walkdir) bundled(rust-crate:want) bundled(rust-crate:webpki) bundled(rust-crate:webpki-roots) bundled(rust-crate:which) bundled(rust-crate:winnow) bundled(rust-crate:xattr) bundled(rust-crate:zeroize) bundled(rust-crate:zip) bundled(rust-crate:zstd) bundled(rust-crate:zstd-safe) bundled(rust-crate:zstd-sys) config(sccache) sccache sccache(aarch-64)"
RDEPENDS:${PN} += "bubblewrap ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
