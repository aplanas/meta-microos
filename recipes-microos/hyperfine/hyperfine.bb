SUMMARY = "Command-line benchmarking tool"
DESCRIPTION = "A command-line tool which runs benchmarks of other programs passed as arguments. \
It includes: \
  * Statistical analysis across multiple runs \
  * Support for arbitrary shell commands \
  * Constant feedback about the benchmark progress and current estimates \
  * Warmup runs can be executed before the actual benchmark \
  * Cache-clearing commands can be set up before each timing run \
  * Statistical outlier detection to detect interference from other programs and caching effects \
  * Export results to various formats: CSV, JSON, Markdown, AsciiDoc \
  * Parameterized benchmarks (e.g. vary the number of threads)"
LICENSE = "Apache-2.0 | MIT"

PV = "1.16.1"

RPM_NAME = "hyperfine-1.16.1-1.1.aarch64.rpm"
RPM_HASH = "5b36d66fde5619f95b1291875a29d9a50770bb783802aebb8da638f1506a3dcac1328f7b4214a6c39ffc2521c89a79ff8362acef62a25d94e65f7b481baf1b72"

RPROVIDES:${PN} += "bundled(rust-crate:ahash) \
bundled(rust-crate:anyhow) \
bundled(rust-crate:arrayvec) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:borsh) \
bundled(rust-crate:borsh-derive) \
bundled(rust-crate:borsh-derive-internal) \
bundled(rust-crate:borsh-schema-derive-internal) \
bundled(rust-crate:bytecheck) \
bundled(rust-crate:bytecheck_derive) \
bundled(rust-crate:byteorder) \
bundled(rust-crate:bytes) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_complete) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:colored) \
bundled(rust-crate:console) \
bundled(rust-crate:csv) \
bundled(rust-crate:csv-core) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:hyperfine) \
bundled(rust-crate:indicatif) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itoa) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:libc) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:memchr) \
bundled(rust-crate:memoffset) \
bundled(rust-crate:nix) \
bundled(rust-crate:num) \
bundled(rust-crate:num-bigint) \
bundled(rust-crate:num-complex) \
bundled(rust-crate:num-integer) \
bundled(rust-crate:num-iter) \
bundled(rust-crate:num-rational) \
bundled(rust-crate:num-traits) \
bundled(rust-crate:number_prefix) \
bundled(rust-crate:once_cell) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:pin-utils) \
bundled(rust-crate:portable-atomic) \
bundled(rust-crate:ppv-lite86) \
bundled(rust-crate:proc-macro-crate) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:ptr_meta) \
bundled(rust-crate:ptr_meta_derive) \
bundled(rust-crate:quote) \
bundled(rust-crate:rand) \
bundled(rust-crate:rand_chacha) \
bundled(rust-crate:rand_core) \
bundled(rust-crate:rand_hc) \
bundled(rust-crate:rand_isaac) \
bundled(rust-crate:rand_jitter) \
bundled(rust-crate:rand_os) \
bundled(rust-crate:rand_pcg) \
bundled(rust-crate:rand_xorshift) \
bundled(rust-crate:rend) \
bundled(rust-crate:rkyv) \
bundled(rust-crate:rkyv_derive) \
bundled(rust-crate:rust_decimal) \
bundled(rust-crate:rustix) \
bundled(rust-crate:ryu) \
bundled(rust-crate:seahash) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:shell-words) \
bundled(rust-crate:simdutf8) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:statistical) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:terminal_size) \
bundled(rust-crate:thiserror) \
bundled(rust-crate:thiserror-impl) \
bundled(rust-crate:toml) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:version_check) \
hyperfine \
hyperfine(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
