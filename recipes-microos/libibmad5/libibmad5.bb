SUMMARY = "Libibmad runtime library"
DESCRIPTION = "Libibmad provides low layer IB functions for use by the IB diagnostic \
and management programs. These include MAD, SA, SMP, and other basic IB \
functions. This package contains the runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libibmad5-42.0-2.3.aarch64.rpm"
RPM_HASH = "576320bf36f2e784afa044b611ca6e55eb0a5a340cf54709fcfb3c4a083552a1d099bd4ee6ebc006c32f062e9800ad2406fdda0023b562a4bad8c7567662b797"

RPROVIDES:${PN} += "libibmad.so.5()(64bit) libibmad.so.5(IBMAD_1.3)(64bit) libibmad5 libibmad5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libibumad.so.3()(64bit) libibumad.so.3(IBUMAD_1.0)(64bit)"

inherit rpm
