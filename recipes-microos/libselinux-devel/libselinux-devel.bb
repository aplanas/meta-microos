SUMMARY = "Development files for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This package contains the development files, which are \
necessary to develop your own software using libselinux."
LICENSE = "SUSE-Public-Domain"

PV = "3.5"

RPM_NAME = "libselinux-devel-3.5-2.1.aarch64.rpm"
RPM_HASH = "9eed197bbf98cf9266ba6f156541b4ac2643d73118eb741c96719a942259296458351a9d51d6c70cea24204d8d4eda4af9ea7578c88f3ad0c6f5226c2f360f5e"

RPROVIDES:${PN} += "libselinux-devel libselinux-devel(aarch-64) pkgconfig(libselinux)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libselinux1 pkgconfig(libpcre2-8) pkgconfig(libsepol)"

inherit rpm
