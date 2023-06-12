SUMMARY = "Source-based package manager for OCaml"
DESCRIPTION = "OPAM is a source-based package manager for OCaml. It supports multiple \
simultaneous compiler installations, flexible package constraints, and a \
Git-friendly development workflow."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "aa8ecff1eb9e6096506f7502fc603bfd2635c17364084287c9ddefdffdb76fb948810620fa35ae751139aec6d7314a3a6b45f788defd10d26d4ed09b85c41baa"

RPROVIDES:${PN} += "opam opam(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/ocamlrun bubblewrap bzip2 curl diffutils gzip libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) opam-installer(aarch-64) patch tar unzip"

inherit rpm
