SUMMARY = "Development files for oprofile, a system-wide profiler for Linux"
DESCRIPTION = "OProfile is a system-wide profiler for Linux systems, capable of \
profiling all running code at low overhead. OProfile is released under \
the GNU GPL. \
 \
This package contains the files needed to develop JIT agents for other \
virtual machines."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "oprofile-devel-1.4.0-2.1.aarch64.rpm"
RPM_HASH = "2b4bbb69534b6638be1a56bd318a03bfeab31b8ccfc04cb78db80f6d984b19aeb206b44177c7332d254918ecc1cfca47df36da28d018960187256591f8af23bd"

RPROVIDES:${PN} += "oprofile-devel oprofile-devel(aarch-64)"
RDEPENDS:${PN} += "binutils-devel libopagent1"

inherit rpm
