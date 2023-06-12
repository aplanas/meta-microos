SUMMARY = "Mousepad plugin provider"
DESCRIPTION = "A plugin provider for the Mousepad text editor"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "libmousepad0-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "2a804d03f8779205b023c48bd9746b5d24aeff74c842c9793818c09515141301af498980307a0830c9eb54ffe379e53d035ebf7fc97a03d12c94e29d7ee9ddab"

RPROVIDES:${PN} += "libmousepad.so.0()(64bit) libmousepad0 libmousepad0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libpango-1.0.so.0()(64bit) mousepad"

inherit rpm
