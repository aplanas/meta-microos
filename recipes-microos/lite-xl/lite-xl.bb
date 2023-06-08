SUMMARY = "A lightweight text editor written in Lua"
DESCRIPTION = "Lite XL is derived from lite. It is a lightweight text editor written mostly in Lua — it aims to provide something practical, pretty, small and fast easy to modify and extend, or to use without doing either. The aim of Lite XL compared to lite is to be more user friendly, improve the quality of font rendering, and reduce CPU usage."
LICENSE = "MIT"

PV = "2.1.1+git20221230.4e272c3"

RPM_NAME = "lite-xl-2.1.1+git20221230.4e272c3-1.3.aarch64.rpm"
RPM_HASH = "58e9cac2935aa4bb5c55681b9be761bc4f3501a4aea5e9aee566a4c898c2dc57ce7d58c6f672223bbae35c51da0c6d8ea8193fe3d7f3c287a1f03bbe04b2cd4a"

RPROVIDES:${PN} += "application() application(org.lite_xl.lite_xl.desktop) lite-xl lite-xl(aarch-64) metainfo() metainfo(org.lite_xl.lite_xl.appdata.xml) mimehandler(inode/directory) mimehandler(text/plain)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.22)(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpcre2-8.so.0()(64bit)"

inherit rpm
