SUMMARY = "Libraries, includes, etc. to compile with the libvirt library"
DESCRIPTION = "Include header files & development libraries for the libvirt C library."
LICENSE = "LGPL-2.1-or-later"

PV = "9.3.0"

RPM_NAME = "libvirt-devel-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "efa4816e68fc94979d49b619ca2cd707365cf89f1422c68802be1b497b36831699d4e634c40205ab07915a138f852c7601cdd18a753d5678c438f41cc7c03429"

RPROVIDES:${PN} += "libvirt-devel libvirt-devel(aarch-64) pkgconfig(libvirt) pkgconfig(libvirt-admin) pkgconfig(libvirt-lxc) pkgconfig(libvirt-qemu)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvirt-libs pkg-config pkgconfig(libvirt)"

inherit rpm
