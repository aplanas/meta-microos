SUMMARY = "Program to display a short text fullscreen"
DESCRIPTION = "Screen Message is a program to display a text as large as possible on \
the screen. The text can be edited while Screen Message is running."
LICENSE = "GPL-2.0-or-later"

PV = "0.26"

RPM_NAME = "screen-message-0.26-1.10.aarch64.rpm"
RPM_HASH = "0db592487a12518ed4b0ed58a4d3e1a8fdc88bec9b341443f7e615bf80ba05d4fe608ac53da7f88fb09a987c729e8cc708440d6d59f9ccae985d3a63dc33c2c8"

RPROVIDES:${PN} += "application() application(sm.desktop) screen-message screen-message(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
