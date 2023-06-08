SUMMARY = "Intuitive find & replace CLI"
DESCRIPTION = "sd uses regex syntax that you already know from JavaScript and Python. \
Forget about dealing with quirks of sed or awk - get productive immediately."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & BSD-3-Clause & MIT & (MIT | Unlicense)"

PV = "0.7.6+g33"

RPM_NAME = "sd-0.7.6+g33-2.2.aarch64.rpm"
RPM_HASH = "60442837335ed48fae50f9dbe155607f2917ff3980b1629a7c7c5a4c31c71dc3371f8be972e8017d0f8367cf13fd5627204d0c7288849d5235ab55fd8c72dd2c"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) bundled(rust-crate:ansi_term) bundled(rust-crate:atty) bundled(rust-crate:autocfg) bundled(rust-crate:bitflags) bundled(rust-crate:bstr) bundled(rust-crate:cfg-if) bundled(rust-crate:clap) bundled(rust-crate:crossbeam-channel) bundled(rust-crate:crossbeam-deque) bundled(rust-crate:crossbeam-epoch) bundled(rust-crate:crossbeam-utils) bundled(rust-crate:either) bundled(rust-crate:fastrand) bundled(rust-crate:fnv) bundled(rust-crate:globset) bundled(rust-crate:globwalk) bundled(rust-crate:heck) bundled(rust-crate:ignore) bundled(rust-crate:lazy_static) bundled(rust-crate:libc) bundled(rust-crate:log) bundled(rust-crate:man) bundled(rust-crate:memchr) bundled(rust-crate:memmap) bundled(rust-crate:memoffset) bundled(rust-crate:num_cpus) bundled(rust-crate:once_cell) bundled(rust-crate:proc-macro-error) bundled(rust-crate:proc-macro-error-attr) bundled(rust-crate:proc-macro2) bundled(rust-crate:quote) bundled(rust-crate:rayon) bundled(rust-crate:rayon-core) bundled(rust-crate:regex) bundled(rust-crate:regex-syntax) bundled(rust-crate:remove_dir_all) bundled(rust-crate:roff) bundled(rust-crate:same-file) bundled(rust-crate:scopeguard) bundled(rust-crate:sd) bundled(rust-crate:serde) bundled(rust-crate:strsim) bundled(rust-crate:structopt) bundled(rust-crate:structopt-derive) bundled(rust-crate:syn) bundled(rust-crate:tempfile) bundled(rust-crate:textwrap) bundled(rust-crate:thiserror) bundled(rust-crate:thiserror-impl) bundled(rust-crate:thread_local) bundled(rust-crate:unescape) bundled(rust-crate:unicode-ident) bundled(rust-crate:unicode-segmentation) bundled(rust-crate:unicode-width) bundled(rust-crate:vec_map) bundled(rust-crate:version_check) bundled(rust-crate:walkdir) sd sd(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
