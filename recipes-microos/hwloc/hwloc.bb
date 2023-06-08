SUMMARY = "Portable Hardware Locality"
DESCRIPTION = "The Portable Hardware Locality (hwloc) software package provides \
an abstraction (across OS, versions, architectures, ...) \
of the hierarchical topology of modern architectures, including \
NUMA memory nodes, shared caches, processor sockets, processor cores \
and processing units (logical processors or 'threads'). It also gathers \
various system attributes such as cache and memory information. It primarily \
aims at helping applications with gathering information about modern \
computing hardware so as to exploit it accordingly and efficiently. \
 \
hwloc may display the topology in multiple convenient formats. \
It also offers a powerful programming interface (C API) to gather information \
about the hardware, bind processes, and much more."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-2.9.0-2.3.aarch64.rpm"
RPM_HASH = "592dac2076006c02e2ac47be2b6aaf4adc60fd41b8994ac52427aeb2bf49d0c377cfcfd33a74bb0ae918bfe7410caa878d5d77b267d2945ecccdb786e8a5d8d0"

RPROVIDES:${PN} += "application() application(lstopo.desktop) hwloc hwloc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh desktop-file-utils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libhwloc.so.15()(64bit) libhwloc15 libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) perl-JSON perl-base"

inherit rpm
