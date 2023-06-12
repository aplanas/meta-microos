SUMMARY = "Compilation of plugins for libpurple"
DESCRIPTION = "The Purple Plugin Pack is a compilation of plugins for the \
libpurple family of IM clients. \
 \
To avoid licence issues between GPLv3+ plugins and other plugins \
that could be incompatible with GPLv3+, the GPLv3+ plugins are \
split into the libpurple-plugin-pack-extras package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libpurple-plugin-pack-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "f0bb00490d2bb8853e9e950d2c8ec4fa6e3e44be487949df0ec6aac981c21cd1332f11063291143f93c3d1ad4c816be4b0ca2ed5a84e98c076f9e38cbe6f784f"

RPROVIDES:${PN} += "libpurple-plugin-pack \
libpurple-plugin-pack(aarch-64) \
metainfo() \
metainfo(purple-plugin-pack.metainfo.xml) \
purple-plugin_pack"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.33)(64bit) \
libglib-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpurple.so.0()(64bit)"

inherit rpm
