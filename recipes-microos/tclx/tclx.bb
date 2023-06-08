SUMMARY = "TclX - Extended Tcl"
DESCRIPTION = "Extended Tcl is a superset of standard Tcl. Extended Tcl has three \
basic functional areas: A set of new commands, a Tcl shell (a Unix \
shell-style command line and interactive environment), and a \
user-extensible library of useful Tcl procedures, any of which can be \
automatically loaded on the first attempt to execute it. \
 \
In addition, a detailed help system is available for Tcl/Tk: tclhelp."
LICENSE = "BSD-3-Clause & SUSE-Permissive"

PV = "8.4.4"

RPM_NAME = "tclx-8.4.4-2.2.aarch64.rpm"
RPM_HASH = "cab0ac1c6a6fccad65247b33b189be44c4dc559d7d091d3e71e362235440b0aecc8f6e00615b8525b0bcad1e4334659280ec9455719026f98763968d0359d0b5"

RPROVIDES:${PN} += "libtclx8.6.so()(64bit) tclx tclx(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
