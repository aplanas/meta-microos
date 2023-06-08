SUMMARY = "Header files, libraries and development documentation for libsynce"
DESCRIPTION = "This package contains the header files, static libraries and development documentation for libsynce. If you like to develop programs using libsynce, you will need to install libsynce-devel."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "libsynce-devel-0.15.1-13.29.aarch64.rpm"
RPM_HASH = "edfbfcea34eb4112cb162a4f477da539dc91c47dd8d3352ac31fac03a71bb93ea0624e0c6508eeb321f12caa40351b0cf7d1756b9143b55c53c640c508c8a522"

RPROVIDES:${PN} += "libsynce-devel libsynce-devel(aarch-64) pkgconfig(libsynce)"
RDEPENDS:${PN} += "/usr/bin/pkg-config dbus-1-glib-devel libsynce"

inherit rpm
