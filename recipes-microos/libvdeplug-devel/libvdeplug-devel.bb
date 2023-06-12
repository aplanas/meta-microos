SUMMARY = "VDE plug header files"
DESCRIPTION = "This package contains VDE plug header files"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdeplug-devel-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "ad22163b2676f18721be15735b05d0aa5b411621f867859a7ab584a5a291a85dd7065bcefe4e044e238f71bcb1ab15cad01de99a59d3a2eff63f735bd77d9d24"

RPROVIDES:${PN} += "libvdeplug-devel \
libvdeplug-devel(aarch-64) \
libvdeplug3-devel \
pkgconfig(vdeplug)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdeplug3 \
vde2"

inherit rpm
