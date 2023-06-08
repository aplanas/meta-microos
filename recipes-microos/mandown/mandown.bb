SUMMARY = "A man page generator for markdown markup files"
DESCRIPTION = "Mandown is a tool that generates man pages from markdown markup files."
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "mandown-0.1.2-1.2.aarch64.rpm"
RPM_HASH = "c75699a4515152ee26334c8e0864ac37ccc824400e123db38c7de6118ecdcf047b4cf5eacf697261e6d143f287d5fafa3e23b5265547e587865e497baad24f46"

RPROVIDES:${PN} += "bundled(rust-crate:bitflags) bundled(rust-crate:deunicode) bundled(rust-crate:getopts) bundled(rust-crate:mandown) bundled(rust-crate:memchr) bundled(rust-crate:pulldown-cmark) bundled(rust-crate:unicase) bundled(rust-crate:unicode-width) bundled(rust-crate:version_check) mandown mandown(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
