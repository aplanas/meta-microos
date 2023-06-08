SUMMARY = "Integrated LaTeX Environment for the GNOME desktop"
DESCRIPTION = "Gnome-latex is an Integrated LaTeX Environment for GNOME. The main \
features are: \
  * Configurable buttons to compile, convert and view a document in \
    one click. \
  * LaTeX commands auto-completion. \
  * Symbol tables (Greek letters, arrows, ...). \
  * File browser integrated. \
  * Template managing. \
  * Menus with the most commonly used LaTeX commands. \
  * Easy projects management."
LICENSE = "GPL-3.0-or-later"

PV = "3.44.0"

RPM_NAME = "gnome-latex-3.44.0-1.4.aarch64.rpm"
RPM_HASH = "71e53c5b2f0b501f3e11726935c376a856191e9a83bfb0c606c170daa5890ffde9de49e421ff0565dfb441ed2ff74e158ce35c0bb35ce637c873a0a7bd43cee9"

RPROVIDES:${PN} += "application() application(org.gnome.gnome-latex.desktop) gnome-latex gnome-latex(aarch-64) latexila metainfo() metainfo(org.gnome.gnome-latex.appdata.xml) mimehandler(text/x-tex)"
RDEPENDS:${PN} += "gsettings-desktop-schemas ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libamtk-5.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdconf.so.1()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgspell-1.so.2()(64bit) libgtk-3.so.0()(64bit) libgtksourceview-4.so.0()(64bit) libpango-1.0.so.0()(64bit) libtepl-6.so.2()(64bit) texlive-latexmk-bin"

inherit rpm
