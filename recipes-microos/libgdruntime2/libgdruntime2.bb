SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "11.3.1+git2076"

RPM_NAME = "libgdruntime2-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "98158b737122b35977ddd25b88619e319bd03f76afd7108488071ea603353d45ec65d0dba34ff2035593f01394e19bf1031e8e91329bf874d9e6b43d8b4a8d57"

RPROVIDES:${PN} += "libgdruntime.so.2()(64bit) libgdruntime2 libgdruntime2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
