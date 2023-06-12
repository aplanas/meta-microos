SUMMARY = "Commmand runner"
DESCRIPTION = "Just is a command runner. Although it shares \
some similarities with 'make', it is not a build \
system."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (MIT | Unlicense) & Apache-2.0 & BSD-3-Clause & CC0-1.0 & MIT & CC0-1.0"

PV = "1.14.0"

RPM_NAME = "just-1.14.0-1.1.aarch64.rpm"
RPM_HASH = "44fb0d31dafd1908d6016887879e73a6652f473d06be398139193ed195a917ded19720e0e0ffc3eadf1b5c61015a9b8007fff28de8230977bf3b2f30ad594961"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:ansi_term) \
bundled(rust-crate:atty) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:block-buffer) \
bundled(rust-crate:bstr) \
bundled(rust-crate:camino) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clap) \
bundled(rust-crate:cpufeatures) \
bundled(rust-crate:crypto-common) \
bundled(rust-crate:ctrlc) \
bundled(rust-crate:derivative) \
bundled(rust-crate:digest) \
bundled(rust-crate:doc-comment) \
bundled(rust-crate:dotenvy) \
bundled(rust-crate:edit-distance) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:fastrand) \
bundled(rust-crate:generic-array) \
bundled(rust-crate:getrandom) \
bundled(rust-crate:heck) \
bundled(rust-crate:humantime) \
bundled(rust-crate:io-lifetimes) \
bundled(rust-crate:is-terminal) \
bundled(rust-crate:itoa) \
bundled(rust-crate:just) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:lexiclean) \
bundled(rust-crate:libc) \
bundled(rust-crate:linux-raw-sys) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:nix) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-automata) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rustix) \
bundled(rust-crate:rustversion) \
bundled(rust-crate:ryu) \
bundled(rust-crate:serde) \
bundled(rust-crate:serde_derive) \
bundled(rust-crate:serde_json) \
bundled(rust-crate:sha2) \
bundled(rust-crate:similar) \
bundled(rust-crate:snafu) \
bundled(rust-crate:snafu-derive) \
bundled(rust-crate:static_assertions) \
bundled(rust-crate:strsim) \
bundled(rust-crate:strum) \
bundled(rust-crate:strum_macros) \
bundled(rust-crate:syn) \
bundled(rust-crate:target) \
bundled(rust-crate:tempfile) \
bundled(rust-crate:term_size) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:typed-arena) \
bundled(rust-crate:typenum) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:unicode-segmentation) \
bundled(rust-crate:unicode-width) \
bundled(rust-crate:uuid) \
bundled(rust-crate:vec_map) \
bundled(rust-crate:version_check) \
just \
just(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
