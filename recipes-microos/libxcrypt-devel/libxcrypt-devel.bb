SUMMARY = "Development files for libxcrypt"
DESCRIPTION = "The libxcrypt-devel package contains libraries and header files for \
developing applications that use libxcrypt."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.33"

RPM_NAME = "libxcrypt-devel-4.4.33-3.1.aarch64.rpm"
RPM_HASH = "a9cb1324e2fecfce6d4c78f11ab1f4568a8c26550b264e8436308fd26d994434ee07323018b0c36193e1f3c4fb7a70ca650856348821ef6fbd4311c6fe7e5b18"

RPROVIDES:${PN} += "glibc-devel:/usr/lib64/libcrypt.so libxcrypt-devel libxcrypt-devel(aarch-64) pkgconfig(libcrypt) pkgconfig(libxcrypt)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcrypt1 pkgconfig"

inherit rpm
