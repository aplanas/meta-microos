SUMMARY = "Headers for Pluma, a UTF-8 text editor"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "pluma-devel-1.26.0-2.5.aarch64.rpm"
RPM_HASH = "6f01ba1564c54e27c5a1463ed6ee3895606f15e67f075f95711736cbf108582036969ef52f80f42b1708bad84cad63d0b328dd188c7f9931055f7d47a18cce36"

RPROVIDES:${PN} += "pkgconfig(pluma) pluma-devel pluma-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(gtksourceview-3.0) pkgconfig(gtksourceview-4) pkgconfig(libpeas-1.0) pkgconfig(libpeas-gtk-1.0) pluma typelib-1_0-Pluma-1_0"

inherit rpm
