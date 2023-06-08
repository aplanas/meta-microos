SUMMARY = "Development files for libcdirectory"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries.  libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcdirectory."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220105"

RPM_NAME = "libcdirectory-devel-20220105-2.4.aarch64.rpm"
RPM_HASH = "1d025481d6ed6d706aa96d42ff9bd7f1d7b57efc1ce2aadf253dc801067f60dbe3f1e05521d238e9bc71a845c4624e88b91679fde6fcf5fee23b3318908906ed"

RPROVIDES:${PN} += "libcdirectory-devel libcdirectory-devel(aarch-64) pkgconfig(libcdirectory)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcdirectory1"

inherit rpm
