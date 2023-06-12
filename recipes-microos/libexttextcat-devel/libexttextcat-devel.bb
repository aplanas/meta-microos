SUMMARY = "Files for Developing with libexttextcat"
DESCRIPTION = "The libexttextcat is a library implementing N-gram-based text categorization \
 \
This package contains the libexttextcat development files."
LICENSE = "BSD-4-Clause"

PV = "3.4.6"

RPM_NAME = "libexttextcat-devel-3.4.6-1.3.aarch64.rpm"
RPM_HASH = "839766f1dce1144ce70c91f4be980c02d1b8cff11a4be21fd29416bdf7de462bf0d13c11f4142174fa130517eba8e8ed5d255cd0d1a604c81e55f3d2be7ea9d1"

RPROVIDES:${PN} += "libexttextcat-devel \
libexttextcat-devel(aarch-64) \
libtextcat-devel \
pkgconfig(libexttextcat)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libexttextcat-2_0-0"

inherit rpm
