SUMMARY = "WebP support for graphviz"
DESCRIPTION = "The graphviz-webp package contains files needed for the support of WebP images"
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-webp-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "03f94644a927926f75d3ff839b3a8af4e4a05b40a9e0526c9ea7c7392293cc6f85fcd2fff2673530931be78ec8d56524b6cafe4b65a0cceb9118add9fc169003"

RPROVIDES:${PN} += "graphviz-webp graphviz-webp(aarch-64) libgvplugin_webp.so.6()(64bit)"
RDEPENDS:${PN} += "/bin/sh graphviz graphviz-gnome ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgvc.so.6()(64bit) libwebp.so.7()(64bit)"

inherit rpm
