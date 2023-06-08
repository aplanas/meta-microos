SUMMARY = "Infiniband Net Discovery runtime library"
DESCRIPTION = "This package contains the Infiniband Net Discovery runtime library needed \
mainly by infiniband-diags."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "42.0"

RPM_NAME = "libibnetdisc5-42.0-2.3.aarch64.rpm"
RPM_HASH = "6b3b9534a35e468984d54bf29a8500cfd852261c0c7ab2f31137120b424cbbe25424e9052e82107ada22bbf54d5b6dc6df9561099cda320ddbcc99f51bffd53a"

RPROVIDES:${PN} += "libibnetdisc.so.5()(64bit) libibnetdisc.so.5(IBNETDISC_1.0)(64bit) libibnetdisc5 libibnetdisc5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libibmad.so.5()(64bit) libibmad.so.5(IBMAD_1.3)(64bit) libibumad.so.3()(64bit) libibumad.so.3(IBUMAD_1.0)(64bit)"

inherit rpm
