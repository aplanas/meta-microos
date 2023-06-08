SUMMARY = "Headers for the Reiser4 File System tool libraries"
DESCRIPTION = "A set of header C files and static libraries for the Reiser4 file \
system tools."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "reiser4progs-devel-2.0.5-1.7.aarch64.rpm"
RPM_HASH = "f08d2a4840be002b7b03199d64e4939aeff1be20af5ee69538fc2906ac175b3b94965f0e7a73c4bd4981950bfa3857b777c8ff87652cb39a4ad75fd51a8bf269"

RPROVIDES:${PN} += "reiser4progs-devel reiser4progs-devel(aarch-64)"
RDEPENDS:${PN} += "libreiser4-2_0-5 libreiser4-minimal-2_0-5 librepair-2_0-5"

inherit rpm
