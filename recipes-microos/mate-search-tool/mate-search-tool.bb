SUMMARY = "MATE Search Tool"
DESCRIPTION = "This is the MATE Seach Tool as shipped with the MATE utilities. It uses \
command-line tools such as find and locate to get results."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-search-tool-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "dd932e538c49fdd9d077fe9f3bbd60b20bf1273dd595363570f5c63f8e391a4e9685d51b55a76dbf4af7696bd67bb247e2c466a1e216fe9a954611f653215b0f"

RPROVIDES:${PN} += "application() application(mate-search-tool.desktop) mate-search-tool mate-search-tool(aarch-64) metainfo() metainfo(mate-search-tool.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) mate-desktop-gschemas"

inherit rpm
