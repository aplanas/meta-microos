SUMMARY = "GTK UI for Neovim"
DESCRIPTION = "GTK UI for Neovim written in Rust using gtk-rs bindings. With ligatures \
support."
LICENSE = "GPL-3.0-only"

PV = "0.2.0+git.1609586374.c036492"

RPM_NAME = "neovim-gtk-0.2.0+git.1609586374.c036492-5.3.aarch64.rpm"
RPM_HASH = "2b80713f2e0bf6bc051688e805bc64f032f009030b389a5ce6b32651908586ccec6d4199b8e7a88765194850d816a0916590b36ccc1161d641cd609cd3c75184"

RPROVIDES:${PN} += "application() application(org.daa.NeovimGtk.desktop) mimehandler(application/x-shellscript) mimehandler(text/english) mimehandler(text/plain) mimehandler(text/x-c) mimehandler(text/x-c++) mimehandler(text/x-c++hdr) mimehandler(text/x-c++src) mimehandler(text/x-chdr) mimehandler(text/x-csrc) mimehandler(text/x-java) mimehandler(text/x-makefile) mimehandler(text/x-moc) mimehandler(text/x-pascal) mimehandler(text/x-tcl) mimehandler(text/x-tex) neovim-gtk neovim-gtk(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit)"

inherit rpm
