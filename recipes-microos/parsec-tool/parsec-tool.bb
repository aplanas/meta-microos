SUMMARY = "Platform AbstRaction for SECurity"
DESCRIPTION = "A tool to communicate with the Parsec service on the command-line."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "parsec-tool-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "bc60bc2c35bc800e665d817ee1824a0f5fa2e7969c5c0c3f59c5d1fa822fa96bd06988352c90835628af9ba6aa36882a101d8c7dbd9520e68971410810d01f39"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:base64) \
bundled(rust-crate:bincode) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cc) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:cmake) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:derivative) \
bundled(rust-crate:digest) \
bundled(rust-crate:either) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:form_urlencoded) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:heck) \
bundled(rust-crate:humantime) \
bundled(rust-crate:idna) \
bundled(rust-crate:itertools) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:num) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-complex) \
bundled(rust-crate:num-derive) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-rational) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:oid) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:opaque-debug) \
bundled(rust-crate:parsec-client) \
bundled(rust-crate:parsec-interface) \
bundled(rust-crate:parsec-tool) \
bundled(rust-crate:pem) \
bundled(rust-crate:percent-encoding) \
bundled(rust-crate:picky-asn1) \
bundled(rust-crate:picky-asn1-der) \
bundled(rust-crate:picky-asn1-x509) \
bundled(rust-crate:proc-macro-error) \
bundled(rust-crate:proc-macro-error-attr) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:prost) \
bundled(rust-crate:prost-derive) \
bundled(rust-crate:psa-crypto) \
bundled(rust-crate:psa-crypto-sys) \
bundled(rust-crate:quote) \
bundled(rust-crate:rcgen) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:ring) \
bundled(rust-crate:same-file) \
bundled(rust-crate:secrecy) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_bytes) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:sha2) \
bundled(rust-crate:spin) \
bundled(rust-crate:strsim) \
bundled(rust-crate:structopt) \
bundled(rust-crate:structopt-derive) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:time) \
bundled(rust-crate:time-core) \
bundled(rust-crate:tinyvec) \
bundled(rust-crate:tinyvec_macros) \
bundled(rust-crate:typenum) \
bundled(rust-crate:unicode-bidi) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-normalization) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:untrusted) \
bundled(rust-crate:url) \
bundled(rust-crate:users) \
bundled(rust-crate:uuid) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
bundled(rust-crate:walkdir) \
bundled(rust-crate:yasna) \
bundled(rust-crate:zeroize) \
bundled(rust-crate:zeroize_derive) \
parsec-tool \
parsec-tool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
parsec"

inherit rpm
