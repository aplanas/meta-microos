SUMMARY = "Development Files for xfconf"
DESCRIPTION = "This package contains the files needed for developing applications using \
xfconf."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "libxfconf-devel-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "ddc0de6fb557585ee42ebd5ed8adf809c3ef2f9b5bf6345a951f92c2e7304473a44d33b9b003a6bfe9f17fd6db94f6bdc7a70090d6edf6d762b26fdd1d619a90"

RPROVIDES:${PN} += "libxfce4mcs-devel \
libxfconf-devel \
libxfconf-devel(aarch-64) \
pkgconfig(libxfconf-0) \
xfce-mcs-manager-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxfconf-0-3 \
pkgconfig(gio-2.0)"

inherit rpm
