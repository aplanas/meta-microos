SUMMARY = "Runtime files for helix"
DESCRIPTION = "Helix runtime files. Separated due to how huge the runtime files are. \
The runtime contains tree-sitter and grammars that makes run helix normally \
if there is no runtime present in the users config directory specifically \
`XDG_CONFIG_HOME/helix`."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (MIT | Apache-2.0 | Zlib) & (MIT | Unlicense) & (Zlib | Apache-2.0 | MIT) & Apache-2.0 & BSL-1.0 & ISC & MIT & MPL-2.0 & Zlib & MPL-2.0"

PV = "23.03"

RPM_NAME = "helix-runtime-23.03-2.1.aarch64.rpm"
RPM_HASH = "c2cb042b67732b38d4e6717ce9b6cf2c87640057758ce1bbf7fcc262c1ea55042ec35a705b4c9c0f22e3ad08818bf9b92d3f12bd567e9ecc37a34c744747ca40"

RPROVIDES:${PN} += "helix-runtime helix-runtime(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
