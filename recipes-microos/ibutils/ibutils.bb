SUMMARY = "OpenIB Mellanox InfiniBand Diagnostic Tools"
DESCRIPTION = " \
The ibutils package provides a set of diagnostic tools that check the health \
of an InfiniBand fabric. \
 \
Package components: \
ibis:     IB interface - A TCL shell that provides interface for sending various \
          MADs on the IB fabric. This is the component that actually accesses \
          the IB Hardware. \
 \
ibdm:     IB Data Model - A library that provides IB fabric analysis. \
 \
ibmgtsim: An IB fabric simulator. Useful for developing IB tools. \
 \
ibdiag:   This package provides two tools which provide the user interface \
          to activate the above functionality: \
            - ibdiagnet:  Performs various quality and health checks on the IB \
                          fabric. \
            - ibdiagpath: Performs various fabric quality and health checks on \
                          the given links and nodes in a specific path."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.5.7.0.2"

RPM_NAME = "ibutils-1.5.7.0.2-11.8.aarch64.rpm"
RPM_HASH = "520df13fd88c1ced49721399ca626946d6feeb4799382b38ef8158901bbf976809300b86ddc7520ee35811c13191ef630013b00cbe1c14882eda7a60a1949cfb"

RPROVIDES:${PN} += "ibutils ibutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libibdmcom.so.1()(64bit) libopensm.so.9()(64bit) libopensm.so.9(OPENSM_1.5)(64bit) libosmcomp.so.5()(64bit) libosmcomp.so.5(OSMCOMP_2.3)(64bit) libosmvendor.so.5()(64bit) libosmvendor.so.5(OSMVENDOR_2.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtcl8.6.so()(64bit)"

inherit rpm
